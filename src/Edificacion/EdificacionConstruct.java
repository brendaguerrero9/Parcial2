/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificacion;

/**
 *
 * @author Brenda
 */
public class EdificacionConstruct {
    int id;
    String nombre;
    int vida;
    
    static ListaEdificacion edif = new ListaEdificacion();
    public EdificacionConstruct(){}
    
    public EdificacionConstruct(int id,String nombre, int vida){
        this.id = id;
        this.nombre = nombre;
        this.vida = vida;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public int getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getVida() {
        return vida;
    }


}
