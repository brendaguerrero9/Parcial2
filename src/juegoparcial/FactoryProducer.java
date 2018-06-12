/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoparcial;

import Edificacion.FactoryEdificacion;
import Jugador.FactoryJugador;
import Milicia.FactoryMilicia;
import Razas.FactoryRazas;
import Vehiculos.FactoryVehiculos;

/**
 *
 * @author Brenda
 */
public interface FactoryProducer {
    public static AbstractFactory getFactory(int n){
        switch(n){
            case 1:
                return new FactoryVehiculos();
            case 2:
                return new FactoryRazas();
            case 3:
                return new FactoryMilicia();
            case 4:
                return new FactoryJugador();
            case 5:
                return new FactoryEdificacion();
        }
        return null;
    }
}
