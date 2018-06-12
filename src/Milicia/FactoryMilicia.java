/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

import Edificacion.Edificacion;
import Jugador.Jugador;
import Razas.Razas;
import Vehiculos.Vehiculos;
import juegoparcial.AbstractFactory;

/**
 *
 * @author Brenda
 */
public class FactoryMilicia implements AbstractFactory {

    @Override
    public Vehiculos getVehiculo(String type) {
        return null;
    }

    @Override
    public Razas getRaza(String type) {
        return null;
    }

    @Override
    public Milicia getMilicia(String type) {
        switch(type){
            case "escuadrones":
                return new Escuadron();
            case "especialistas":
                return new Especialistas();
        }
        return null;
    }

    @Override
    public Jugador getJugador(int opcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Edificacion getEdificacion(int opc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
