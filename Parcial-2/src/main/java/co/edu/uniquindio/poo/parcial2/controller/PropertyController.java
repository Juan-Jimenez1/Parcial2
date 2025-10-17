package co.edu.uniquindio.poo.parcial2.controller;

import co.edu.uniquindio.poo.parcial2.model.Property;
import co.edu.uniquindio.poo.parcial2.model.RealEstate;

import java.util.List;

public class PropertyController {
    RealEstate realEstate;
    public PropertyController(RealEstate realEstate) {
        this.realEstate = realEstate;
    }


    public List<Property> getProperties() {
        return realEstate.getProperties();
    }


}
