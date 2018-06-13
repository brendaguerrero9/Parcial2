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
    
    public void adding(int id,int tipoMilicia){
        MiliciaConstruct mili = new MiliciaConstruct();
        mili.setId(id);
        mili.setTipoMilicia(tipoMilicia);
        milicias.add(mili);
    }
  }

    
