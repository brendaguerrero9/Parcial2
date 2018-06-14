/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

import java.util.ArrayList;

/**
 *
 * @author Brenda
 */
public class ListaMilicias {
    private ArrayList<MiliciaConstruct> milicias;
    
    public ListaMilicias(){
        milicias = new ArrayList<>();
    }
    
    public void adding(int id,String tipoMilicia){
        MiliciaConstruct mili = new MiliciaConstruct();
        mili.setId(id);
        mili.setTipoMilicia(tipoMilicia);
        milicias.add(mili);
    }
        public void imprimir(int id){
        int count = 1;
        for(MiliciaConstruct mili : milicias) {
            if(id == mili.id){
                System.out.println("HAS ELEGIDO: " + mili.getId());
            } else {
                System.out.println("HAS ELEGIDO: " + mili.getId());
            }
            System.out.println(mili.getId());
            count += 1;
            
        }
    }
  }

    
