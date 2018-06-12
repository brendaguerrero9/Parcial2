/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

/**
 *
 * @author Brenda
 */
public class Especialistas implements Milicia{

    @Override
    public void AtacarTorre() {
        System.out.println("ATACANDO TORRE CON ESPECIALISTA");
    }

    @Override
    public void AtacarTropa() {
        System.out.println("Que raza desea atacar?");
    }
    
}
