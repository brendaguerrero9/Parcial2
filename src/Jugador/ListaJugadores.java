/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

import java.util.ArrayList;

/**
 *
 * @author Brenda
 */
public class ListaJugadores {
    private ArrayList<JugadorConstruct> jugadores;
    
    public ListaJugadores(){
        jugadores = new ArrayList<>();
    }
    
    public void add(int id,String nombre, int raza){
        JugadorConstruct jug = new JugadorConstruct();
        jug.setNombre(nombre);
        jug.setId(id);
        jug.setRaza(raza);
        jugadores.add(jug);
    }
    
    public void imprimir(){
        int count = 1;
        for(JugadorConstruct jug : jugadores) {
            System.out.println(jug.getNombre());
            count += 1;
        }
    }
}



