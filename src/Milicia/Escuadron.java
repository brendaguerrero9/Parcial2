/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

import static Milicia.MiliciaConstruct.mili;
import static Milicia.MiliciaConstruct.mili2;

/**
 *
 * @author Brenda
 */
public class Escuadron implements Milicia {

    @Override
    public void Viewing(int id) {
        if(id == 1){
            mili.imprimir(id);   
        }else
            mili2.imprimir(id);
    }

    @Override
    public void Adding(int id, String tipoMilicia) {
        if(id == 1){
            mili.adding(id, "Escuadrones"); 
        }else
            mili2.adding(id, "Escuadrones");
        
    }

    @Override
    public void Enemigo1(int id) {
        if(id == 1){
            mili.Enemigo1(id);   
        }else
            mili2.Enemigo1(id);
    }

    @Override
    public void Enemigo2(int id) {
        if(id == 1){
            mili.Enemigo2(id);   
        }else
            mili2.Enemigo2(id);
    }
  
}
