/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import java.util.ArrayList;

/**
 *
 * @author Brenda
 */
public class ListaVehiculos {
    private ArrayList<VehiculosConstruct> vehiculos;
    
    public ListaVehiculos(){
        vehiculos = new ArrayList<>();
    }
    
    public void adjuntar(int id,int tipoVeh){
        VehiculosConstruct veh = new VehiculosConstruct();
        veh.setId(id);
        veh.setTipoVeh(tipoVeh);
        vehiculos.add(veh);
        
    }
    
}
