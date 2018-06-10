/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

/**
 *
 * @author Brenda
 */
public abstract class AbstractFactory {
    abstract Jugador getJugador(String jugador);
    
        /*int opc =0;   
        switch (opc) {
                    case 1:
                        return Jugador1;
                    case 2 :
                        return Jugador2;
                    default:
                        System.out.println("Por favor ingrese una opcion valida.");
                       
   }    */
}
