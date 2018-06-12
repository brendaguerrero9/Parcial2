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
public interface AbstractFactory {
    Vehiculos getVehiculo(String type);
    Razas getRaza(String type);
    Milicia getMilicia(String type);
}
