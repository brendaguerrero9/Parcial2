/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificacion;

import java.util.ArrayList;

/**
 *
 * @author Brenda
 */
public class ListaEdificacion {
    private ArrayList<EdificacionConstruct> edificaciones;
    
    public ListaEdificacion(){
        edificaciones = new ArrayList<>();
    }
    public void agregar(int id,String nombre, int vida){
        EdificacionConstruct edif = new EdificacionConstruct();
        edif.setId(id);
        edif.setNombre(nombre);
        edif.setVida(vida);
        edificaciones.add(edif);

        
        

  
    }
}
