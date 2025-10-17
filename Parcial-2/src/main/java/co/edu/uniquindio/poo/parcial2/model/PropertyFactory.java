package co.edu.uniquindio.poo.parcial2.model;

// Patrón de diseño factory para crear las propiedades.

public class PropertyFactory {
    public static Property propertyFactory(String type,String city, int rooms, int floors, double price, String id){

        switch (type.toLowerCase()){
            case "house":
                return new Property.Builder().propertyType(PropertyType.HOUSE).city(city).rooms(rooms).floors(floors).price(price).id(id).build();

            case "apartment":
                return new Property.Builder().propertyType(PropertyType.APARTMENT).city(city).rooms(rooms).floors(floors).price(price).id(id).build();

            case "estate":
                return new Property.Builder().propertyType(PropertyType.ESTATE).city(city).rooms(rooms).floors(floors).price(price).id(id).build();

            case "premises":
                return new Property.Builder().propertyType(PropertyType.PREMISES).city(city).rooms(rooms).floors(floors).price(price).id(id).build();

            default: throw new IllegalArgumentException("Invalid property type");

        }
    }
}
