/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;

import Edificacion.Edificacion;
import Jugador.Jugador;
import Milicia.Milicia;
import Vehiculos.Vehiculos;
import juegoparcial.AbstractFactory;

/**
 *
 * @author Brenda
 */
public class FactoryRazas implements AbstractFactory {

    @Override
    public Razas getRaza(String type) {
        switch(type){
            case "enanos":
                return new Enanos();
            case "hechicero":
                return new Hechicero();
            case "luchador":
                return new Luchador();
            case "duende":
                return new Duende();
                
    }
        return null;
    }

    @Override
    public Jugador getJugador(int opcion) {
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
