/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;
import static Jugador.JugadorConstruct.jug;
import static Jugador.JugadorConstruct.jugEnemigo;

/**
 *
 * @author Brenda
 */
public class Jugador2 implements Jugador {


    @Override
    public void Mostrar(int id) {
        if(id == 1){
            jug.imprimir(id);   
        }else
            jugEnemigo.imprimir(id);
    }

    @Override
    public int Raza(int id) {
        if(id == 1){
            jug.raza(id);
            return jug.raza(id);
        }else
            jugEnemigo.raza(id);
        return jug.raza(id);
    }

    @Override
    public void Enemigo1(int id) {
        if(id == 1){
            jug.Enemigo1(id);
        }else
            jugEnemigo.Enemigo1(id);
    }

    @Override
    public void Enemigo2(int id) {
        if(id == 1){
            jug.Enemigo2(id);
        }else
            jugEnemigo.Enemigo2(id);
    }

    @Override
    public void Registrar(String nombre, int raza, int id) {
        if(id == 1){
            jug.add(id, nombre, raza);
        }else{
            jugEnemigo.add(id, nombre, raza);
        }
    }
}
