/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificacion;

import Jugador.Jugador;
import Milicia.Milicia;
import Razas.Razas;
import Vehiculos.Vehiculos;
import juegoparcial.AbstractFactory;

/**
 *
 * @author Brenda
 */
public class FactoryEdificacion implements AbstractFactory{

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
        switch(opc){
            case 1:
                return new ConstruirVeh1();
            case 2:
                return new ConstruirVeh2();
            case 3:
                return new Entrenar();
            case 4:
                return new RecolectorRecurso1();
            case 5:
                return new RecolectorRecurso2();
            case 6:
                return new GeneradorRecurso3();
        }
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
