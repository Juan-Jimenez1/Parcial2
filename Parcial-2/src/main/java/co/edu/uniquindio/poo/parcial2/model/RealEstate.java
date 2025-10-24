package co.edu.uniquindio.poo.parcial2.model;

import java.util.ArrayList;

public class RealEstate {
    private String name;
    private String nit;
    private ArrayList<Property> properties;
    private static RealEstate instance;
// Singleton design pattern to have just one instance of "RealEstate".

    private RealEstate() {
        this.name = "Inmobiliaria ";
        this.nit = "1221346";
        this.properties = new ArrayList<>();
    }

    public static RealEstate getInstance() {
        if (instance == null) {
            instance = new RealEstate();
        }
        return instance;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }

    public void registerProperty(String type, String city, int rooms, int floors, double price, String id) {
        Property property = PropertyFactory.propertyFactory(type, city, rooms, floors, price, id);
        properties.add(property);
    }

    public boolean deleteProperty(String id) {
        for (int i = 0; i < properties.size(); i++) {
            if (properties.get(i).getId().equals(id)) {
                properties.remove(i);
                return true;
            }
        }
        return false;
    }

}











