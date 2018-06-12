/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoparcial;


import Jugador.Jugador;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author Brenda
 */
public class Menu {
   
   String Jugador1,Jugador2;
   Scanner leer = new Scanner(System.in);
   AbstractFactory factory;
    public void Registrar(){
     
       int raza1,raza2;
       System.out.println("**********BRENDA'S WORLD**********");
       System.out.println("Nombre jugador1: ");
       Jugador1 = leer.nextLine();
       System.out.println("RAZAS DISPONIBLES: 1.Enanos, 2.Hechiceros, 3.Luchadores");
       raza1 = leer.nextInt();
       leer.nextLine();
       factory = FactoryProducer.getFactory(4);
       Jugador jugador = factory.getJugador(1);
       jugador.Registrar(Jugador1, raza1);
       
       System.out.println("Nombre jugador2: ");
       Jugador2 = leer.nextLine();
       System.out.println("RAZAS DISPONIBLES: 1.Enanos, 2.Hechiceros, 3.Luchadores");
       raza2 = leer.nextInt();
       leer.nextLine();
       factory = FactoryProducer.getFactory(4);
       Jugador jugador2 = factory.getJugador(2);
       jugador2.Registrar(Jugador1, raza2);
     
}
   public void opciones(){
   System.out.println("--------MENU--------");
   System.out.println("1. Crear edificaciones");
   System.out.println("2.Atacar");
   System.out.println("3.Entrenar");
   System.out.println("4.Defender");
}
   public void mostrar()  {
        int opcion = 0;
         opciones();
            while (opcion != 5) {
               
            try {
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Creando edificaciones");
                        break;
                    case 2 :
                        System.out.println("Atacando jugador");
                        break;
                    case 3 :
                        System.out.println("Entrenando");
                        break;
                    case 4 :
                        System.out.println("Defendiendo");
                        break;
                    default:
                        System.out.println("Por favor ingrese una opcion valida.");
                       
   }    
        }catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese una de las opciones.");
                leer.nextLine();
            }
            }
   }
   
   public void turno(){
       Math.random();
       double numRandom = Math.random();
       if(numRandom < 0.5){
           System.out.println("TURNO DE " + Jugador1);
       } else {
           System.out.println("TURNO DE  " + Jugador2);
       }
       
   }
   public void CambiarTurno(){
       String turno = Jugador1;
       if (turno == Jugador1){
               System.out.println("TURNO DE " + Jugador2);
       } else {
           System.out.println("TURNO DE  " + Jugador1);
       }
       }
    
}






   

