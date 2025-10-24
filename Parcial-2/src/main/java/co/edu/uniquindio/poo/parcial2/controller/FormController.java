package co.edu.uniquindio.poo.parcial2.controller;

import co.edu.uniquindio.poo.parcial2.model.RealEstate;
import co.edu.uniquindio.poo.parcial2.model.RealEstateFacade;

public class FormController {
    RealEstateFacade realEstateFacade;
    public FormController(RealEstateFacade realEstateFacade) {
        this.realEstateFacade = realEstateFacade;
    }

    public void addProperty(String type, String city, int rooms, int floors, double price, String id){
        realEstateFacade.registerProperty(type, city, rooms, floors, price, id);
    }
}
