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
public class Jugador2 implements Jugador {

    @Override
    public void Registrar(String nombre, int raza) {
        jug.add(2, nombre, raza);
    }

    @Override
    public void Mostrar(int id) {
       jug.imprimir(id);
    }

    @Override
    public int Raza(int id) {
        return jug.raza(id);
    }


}
