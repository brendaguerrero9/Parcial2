/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import static Vehiculos.VehiculosConstruct.veh;
/**
 *
 * @author Brenda
 */
public class Truck implements Vehiculos {

    @Override
    public void adjunt(int id, int tipoVeh) {
        veh.adjuntar(id, tipoVeh);
    }
}
