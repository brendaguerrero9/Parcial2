/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

/**
 *
 * @author Brenda
 */
public interface Jugador {
   void Registrar(String nombre, int raza, int id);
   void Mostrar(int id);
   int Raza(int id);
   void Enemigo1(int id);
   void Enemigo2(int id);
}
 