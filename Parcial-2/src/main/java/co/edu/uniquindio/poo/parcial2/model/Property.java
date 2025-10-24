package co.edu.uniquindio.poo.parcial2.model;

//Builder design pattern

public class Property {
    private String id;
    private PropertyType propertyType;
    private String city;
    private int rooms;
    private int floors;
    private double price;

    private Property(Builder builder) {
        this.propertyType= builder.propertyType;
        this.city = builder.city;
        this.rooms = builder.rooms;
        this.floors = builder.floors;
        this.price = builder.price;
        this.id= builder.id;
    }


    public static class Builder {
        private PropertyType propertyType;
        private String city;
        private int rooms;
        private int floors;
        private double price;
        private String id;


        public Builder propertyType(PropertyType propertyType) {
            this.propertyType = propertyType;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder rooms(int rooms) {
            this.rooms = rooms;
            return this;
        }
        public Builder floors(int floors) {
            this.floors = floors;
            return this;
        }
        public Builder price(double price) {
            this.price = price;
            return this;
        }
        public Property build() {
            return new Property(this);
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
