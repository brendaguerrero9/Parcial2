/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

/**
 *
 * @author Brenda
 */
public class MiliciaConstruct {
    int id;
    int tipoMilicia;
    static ListaMilicias mili = new ListaMilicias();
    public MiliciaConstruct(){}
    
    public MiliciaConstruct(int id, int tipoMilicia){
        this.id = id;
        this.tipoMilicia = tipoMilicia;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipoMilicia(int tipoMilicia) {
        this.tipoMilicia = tipoMilicia;
    }

    public int getId() {
        return id;
    }

    public int getTipoMilicia() {
        return tipoMilicia;
    }
    
     
}
    
