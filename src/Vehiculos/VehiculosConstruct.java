/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

/**
 *
 * @author Brenda
 */
public class VehiculosConstruct {
    int id;
    String tipoVeh;
    static ListaVehiculos veh = new ListaVehiculos();
    static ListaVehiculos veh2 = new ListaVehiculos();
    
    public VehiculosConstruct(){}
    
    public VehiculosConstruct(int id, String tipoVeh){
        this.id = id;
        this.tipoVeh = tipoVeh;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipoVeh(String tipoVeh) {
        this.tipoVeh = tipoVeh;
    }

    public int getId() {
        return id;
    }

    public String getTipoVeh() {
        return tipoVeh;
    }
    
}
