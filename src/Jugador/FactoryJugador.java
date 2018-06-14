/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;
import Edificacion.Edificacion;
import Milicia.Milicia;
import Razas.Razas;
import Vehiculos.Vehiculos;
import juegoparcial.AbstractFactory;

/**
 *
 * @author Brenda
 */
public class FactoryJugador implements AbstractFactory{
    
    @Override
    public Jugador getJugador(int opcion){
        switch(opcion){
            case 1:
                return new Jugador1();
            case 2:
                return new Jugador2();
        }
        return null;
    }

    @Override
    public Razas getRaza(String type) {
        return null;
    }

    @Override
    public Edificacion getEdificacion(int opc) {
        return null;
    }

    @Override
    public Milicia getMilicia(int opt) {
        return null;
    }

    @Override
    public Vehiculos getVehiculo(int option) {
        return null;
    }
}
    
                       

       