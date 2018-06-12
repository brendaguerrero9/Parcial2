/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;

import Milicia.Milicia;
import Vehiculos.Vehiculos;
import juegoparcial.AbstractFactory;

/**
 *
 * @author Brenda
 */
public class FactoryRazas implements AbstractFactory {

    @Override
    public Vehiculos getVehiculo(String type) {
        return null;
    }

    @Override
    public Razas getRaza(String type) {
        switch(type){
            case "enanos":
                return new Enanos();
            case "hechicero":
                return new Hechicero();
            case "luchador":
                return new Luchador();
                
    }
        return null;
    }

    @Override
    public Milicia getMilicia(String type) {
        return null;
    }


    
}
