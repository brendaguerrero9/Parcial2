/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificacion;

import static Edificacion.EdificacionConstruct.edif;
/**
 *
 * @author Brenda
 */
public class GeneradorRecurso3 implements Edificacion {

    @Override
    public void Agregar(int id, String nombre, int vida) {
        edif.agregar(id, nombre, vida);
    }
    
}
