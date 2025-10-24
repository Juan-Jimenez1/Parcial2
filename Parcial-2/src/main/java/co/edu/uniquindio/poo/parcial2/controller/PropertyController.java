package co.edu.uniquindio.poo.parcial2.controller;

import co.edu.uniquindio.poo.parcial2.model.Property;
import co.edu.uniquindio.poo.parcial2.model.RealEstate;
import co.edu.uniquindio.poo.parcial2.model.RealEstateFacade;

import java.util.List;

public class PropertyController {
    RealEstate realEstate;
    RealEstateFacade realEstateFacade;
    public PropertyController(RealEstate realEstate, RealEstateFacade realEstateFacade) {
        this.realEstate = realEstate;
        this.realEstateFacade = realEstateFacade;
    }


    public List<Property> getProperties() {
        return realEstate.getProperties();
    }

    public void deleteProperty(String id){
        realEstateFacade.deleteProperty(id);
    }


}
