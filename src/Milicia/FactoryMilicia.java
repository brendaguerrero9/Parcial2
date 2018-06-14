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
    public Razas getRaza(String type) {
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
        switch(opt){
            case 1:
                return new Escuadron();
            case 2:
                return new Especialistas();
            }
        return null;
        } 

    @Override
    public Vehiculos getVehiculo(int option) {
        return null;
    }
    }

  
    

