/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CMando;

/**
 *
 * @author Brenda
 */
public class CMandoConstruct {
    int id;
    String nombre;
    int Recurso1;
    int Recurso2;
    int Recurso3;
    static ListaCMando mando = new ListaCMando();
    
    public CMandoConstruct(){}

    public CMandoConstruct(int id, String nombre, int Recurso1, int Recurso2, int Recurso3) {
        this.id = id;
        this.nombre = nombre;
        this.Recurso1 = Recurso1;
        this.Recurso2 = Recurso2;
        this.Recurso3 = Recurso3;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRecurso1() {
        return Recurso1;
    }

    public void setRecurso1(int Recurso1) {
        this.Recurso1 = Recurso1;
    }

    public int getRecurso2() {
        return Recurso2;
    }

    public void setRecurso2(int Recurso2) {
        this.Recurso2 = Recurso2;
    }

    public int getRecurso3() {
        return Recurso3;
    }

    public void setRecurso3(int Recurso3) {
        this.Recurso3 = Recurso3;
    }
   

   
}


