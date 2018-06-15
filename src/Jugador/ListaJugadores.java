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
    
    public void imprimir(int id){
        int count = 1;
        for(JugadorConstruct jug : jugadores) {
            if(id == jug.id){
                System.out.println(jug.getNombre());
            } else {
                System.out.println(jug.getNombre());
            }
            System.out.println(jug.getNombre());
            count += 1;
            
        }
    }
    public int raza(int id){
        int Raza = 0;
        int count = 1;
        for (JugadorConstruct jug: jugadores ){
            if(id == jug.id){
                Raza= jug.getId();
            }else{
                
            }
            count+= 1;           
        } 
        return Raza;
    }
    public void Enemigo1(int id){
        int count = 1;
        for(JugadorConstruct jugEnemigo : jugadores) {
            if(id == 1){
                System.out.println("jug" + jugEnemigo.getNombre());
            } else {
                System.out.println("j2 " + jugEnemigo.getNombre());
            }
            System.out.println(jugEnemigo.getNombre());
            count += 1;    
        }  
    } 
    public void Enemigo2(int id) {
        int count = 1;
        for (JugadorConstruct jugEnemigo : jugadores) {
            if (id == 2) {
                System.out.println("jug" + jugEnemigo.getNombre());
            } else {
                System.out.println("j2 " + jugEnemigo.getNombre());
            }
            System.out.println(jugEnemigo.getNombre());
            count += 1;
        }
    }
    
  }




