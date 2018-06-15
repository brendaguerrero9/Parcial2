/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificacion;

import static Edificacion.EdificacionConstruct.edif;
import static Edificacion.EdificacionConstruct.edif2;



/**
 *
 * @author Brenda
 */

public class ConstruirVeh1 implements Edificacion {
    int Recurso1 = 65;
    int Recurso2 = 5;
    int Recurso3 = 0;
         
    @Override
    public void Agregar(int id, String nombre, int vida) {
        if(id == 1){
            edif.agregar(id, "Construyendo Vehiculo 1", vida);
        }else
            edif2.agregar(id, "", vida);
        
    }

    @Override
    public void View(int id) {
        if(id == 1){
            edif.imprimir(id);   
        }else
            edif2.imprimir(id);
    }

    @Override
    public void Enemigo1(int id) {
        if(id == 1){
            edif.Enemigo1(id);
        }else
            edif2.Enemigo1(id);    
    }

    @Override
    public void Enemigo2(int id) {
        if(id == 1){
            edif.Enemigo2(id);
        }else
            edif2.Enemigo2(id);

    }
    
}
