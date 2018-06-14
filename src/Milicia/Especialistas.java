/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

import static Milicia.MiliciaConstruct.mili;


/**
 *
 * @author Brenda
 */
public class Especialistas implements Milicia{

    @Override
    public void Viewing(int id) {
        mili.imprimir(id);
    }

    @Override
    public void Adding(int id, String tipoMilicia) {
        mili.adding(id, "Especialistas");      
    }

}
