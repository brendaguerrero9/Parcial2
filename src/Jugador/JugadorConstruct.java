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
public class JugadorConstruct {
    String nombre;
    int id,raza;
    
    public JugadorConstruct(int id,String nombre, int raza){
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(){
        this.nombre = nombre;
    }
    public int getRaza(){
        return raza;
    }
    public void setRaza(){
        this.raza = raza;
    }
}
