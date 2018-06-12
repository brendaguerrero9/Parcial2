/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;
import static Jugador.JugadorConstruct.jug;

/**
 *
 * @author Brenda
 */
public class Jugador1 implements Jugador {

    @Override
    public void Registrar(String nombre, int raza) {
        jug.add(1, nombre, raza);
    }

}
