/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import Edificacion.Edificacion;
import Jugador.Jugador;
import Milicia.Milicia;
import Razas.Razas;
import juegoparcial.AbstractFactory;

/**
 *
 * @author Brenda
 */
public class FactoryVehiculos implements AbstractFactory {


    @Override
    public Razas getRaza(String type) {
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

    @Override
    public Milicia getMilicia(int opt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vehiculos getVehiculo(int option) {
         switch(option){
            case 1:
                return new Tanque();
            case 2:
                return new Truck();
        }
        return null;
    }
        
    }
   
