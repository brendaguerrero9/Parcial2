/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import static Vehiculos.VehiculosConstruct.veh;
import static Vehiculos.VehiculosConstruct.veh2;

/**
 *
 * @author Brenda
 */
public class Tanque implements Vehiculos {

    @Override
    public void print(int id) {
        if(id == 1){
            veh.imprimir(id);   
        }else
            veh2.imprimir(id);
    }

    @Override
    public void adjunt(int id, String tipoVeh) {
        if(id == 1){
            veh.adjuntar(id, "Tanque"); 
        }else
            veh2.adjuntar(id, "Tanque");
    }

    @Override
    public void Enemigo1(int id) {
        if(id == 1){
            veh.Enemigo1(id);
        }else
            veh2.Enemigo1(id);
    }

    @Override
    public void Enemigo2(int id) {
        if(id == 1){
            veh.Enemigo2(id);
        }else
            veh2.Enemigo2(id);
    }
        
}
