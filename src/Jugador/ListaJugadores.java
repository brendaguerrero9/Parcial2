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
    Scanner leer = new Scanner(System.in);
    String Jugador1,Jugador2;
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
        
    }




