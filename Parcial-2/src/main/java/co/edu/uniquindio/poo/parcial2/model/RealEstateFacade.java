package co.edu.uniquindio.poo.parcial2.model;
import java.util.ArrayList;
import java.util.Optional;

//Facade pattern design. Users interact with facade and not with RealEstate directly.

public class RealEstateFacade {
    private RealEstate realEstate;

    public RealEstateFacade() {
        this.realEstate = RealEstate.getInstance();
    }

    public boolean registerProperty(String type, String city, int rooms, int floors, double price, String id) {
        try {
            // Validations
            if (id == null || id.trim().isEmpty()) {
                System.out.println("Error: ID no puede estar vacío");
                return false;
            }

            if (propertyExists(id)) {
                System.out.println("Error: Ya existe una propiedad con el ID: " + id);
                return false;
            }

            realEstate.registerProperty(type, city, rooms, floors, price, id);
            System.out.println("Propiedad registrada exitosamente con ID: " + id);
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println("Error al registrar propiedad: " + e.getMessage());
            return false;
        }
    }

    public boolean deleteProperty(String id) {
        if (id == null || id.trim().isEmpty()) {
            System.out.println("Error: ID no puede estar vacío");
            return false;
        }

        boolean deleted = realEstate.deleteProperty(id);
        if (deleted) {
            System.out.println("Propiedad eliminada exitosamente con ID: " + id);
        } else {
            System.out.println("No se encontró ninguna propiedad con el ID: " + id);
        }
        return deleted;
    }

    public Optional<Property> findPropertyById(String id) {
        return realEstate.getProperties().stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    public boolean propertyExists(String id) {
        return realEstate.getProperties().stream()
                .anyMatch(p -> p.getId().equals(id));
    }


    public ArrayList<Property> getAllProperties() {
        return realEstate.getProperties();
    }

    public String getRealEstateInfo() {
        return "Inmobiliaria: " + realEstate.getName() +
                " | NIT: " + realEstate.getNit() +
                " | Propiedades: " + getTotalProperties();
    }

    public int getTotalProperties() {
        return realEstate.getProperties().size();
    }

}
