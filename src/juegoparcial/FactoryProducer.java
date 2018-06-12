/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoparcial;

import Milicia.FactoryMilicia;
import Razas.FactoryRazas;
import Vehiculos.FactoryVehiculos;

/**
 *
 * @author Brenda
 */
public interface FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch(type){
            case "vehiculos":
                return new FactoryVehiculos();
            case "razas":
                return new FactoryRazas();
            case "milicias":
                return new FactoryMilicia();
        }
        return null;
    }
}
