/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import Milicia.Milicia;
import Razas.Razas;
import juegoparcial.AbstractFactory;

/**
 *
 * @author Brenda
 */
public class FactoryVehiculos implements AbstractFactory {

    @Override
    public Vehiculos getVehiculo(String type) {
        switch(type){
            case "tanque":
                return new Tanque();
            case "truck" :
                return new Truck();
        }
        return null;
    }

    @Override
    public Razas getRaza(String type) {
        return null;
    }

    @Override
    public Milicia getMilicia(String type) {
        return null;
    }
    
}
