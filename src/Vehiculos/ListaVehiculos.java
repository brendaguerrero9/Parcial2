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
    
    public void adjuntar(int id,String tipoVeh){
        VehiculosConstruct veh = new VehiculosConstruct();
        veh.setId(id);
        veh.setTipoVeh(tipoVeh);
        vehiculos.add(veh);        
    }
    public void imprimir(int id){
        int count = 1;
        for(VehiculosConstruct veh : vehiculos) {
            if(id == veh.id){
                System.out.println("ESTAS OCUPANDO: " + veh.getTipoVeh());
            } else {
                System.out.println("ESTAS OCUPANDO: " + veh.getTipoVeh());
            }
            System.out.println(veh.getId());
            count += 1;
            
        }
    }
    
}
