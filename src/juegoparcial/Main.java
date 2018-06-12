/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoparcial;

import Milicia.Milicia;
import Razas.Razas;
import Vehiculos.Vehiculos;

/**
 *
 * @author Brenda
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractFactory factory;
        factory = FactoryProducer.getFactory("vehiculos");
        Vehiculos tanque = factory.getVehiculo("tanque");
        tanque.Atacar();
        Vehiculos truck = factory.getVehiculo("truck");
        truck.Atacar();
        factory = FactoryProducer.getFactory("razas");
        Razas enanos = factory.getRaza("enanos");
        enanos.raza();
        Razas hechicero = factory.getRaza("hechicero");
        hechicero.raza();
        Razas luchador = factory.getRaza("luchador");
        luchador.raza();
        factory = FactoryProducer.getFactory("milicias");
        Milicia escuadrones = factory.getMilicia("escuadrones");
        escuadrones.AtacarTorre();
        escuadrones.AtacarTropa();
        Milicia especialistas = factory.getMilicia("especialistas");
        especialistas.AtacarTorre();
        especialistas.AtacarTropa();
        
        
                
        
        Menu n = new Menu();
        n.Registrar();
        

    }
    
}
