/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Brenda
 */
public class ListaJugadores {
    private ArrayList<JugadorConstruct> jugadores;
    
    public ListaJugadores(){
    jugadores = new ArrayList<>();
    }
    
    public void add(){
        JugadorConstruct jug = new JugadorConstruct();
        jugadores.add(jug);
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese jugador");
        jug.setNombre(leer.nextLine());
        System.out.println("Id de jugador");
        jug.setId(leer.nextInt());
        System.out.println("Ingrese raza");
        jug.setRaza(leer.nextInt());
    }
    
    public void add(JugadorConstruct jug) throws Exception{
          if(jug != null) {
            if (!jugadores.contains(jug)) {
                jugadores.add(jug);
            }
            Exception e = new Exception("No se permiten datos duplicados");
            throw e;
        } else {
            throw new Exception("No se puede agregar un jugador nulo");
        }
        
       }
    
        public void mostrar() {
        for ( JugadorConstruct e : jugadores) {
            System.out.println(e.toString());
        }
    }
}



