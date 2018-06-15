/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoparcial;


import Edificacion.Edificacion;
import Jugador.Jugador;
import Milicia.Milicia;
import Vehiculos.Vehiculos;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author Brenda
 */
public class Menu {

    String Jugador1, Jugador2;
    //String idJugador = Jugador1;
    int raza1, raza2;
    Scanner leer = new Scanner(System.in);
    AbstractFactory factory;
   
    public void Registrar(){
       System.out.println("\033[36m***********BRENDA GUERRERO'S WORLD**********");
       System.out.println("Nombre jugador1:");
       Jugador1 = leer.nextLine();
       System.out.println("RAZAS DISPONIBLES: 1.Enanos, 2.Hechiceros, 3.Luchadores, 4.Duende");
       raza1 = leer.nextInt();
       leer.nextLine();
       factory = FactoryProducer.getFactory(4);
       Jugador jugador = factory.getJugador(1);
       jugador.Registrar(Jugador1, raza1, 1);
       //jugador.Mostrar(1);
       jugador.Raza(1);
       
       System.out.println("Nombre jugador2:");
       Jugador2 = leer.nextLine();
       System.out.println("RAZAS DISPONIBLES: 1.Enanos, 2.Hechiceros, 3.Luchadores, 4.Duende");
       raza2 = leer.nextInt();
       leer.nextLine();
       factory = FactoryProducer.getFactory(4);
       Jugador jugador2 = factory.getJugador(2);
       jugador2.Registrar(Jugador2, raza2, 2);
       //jugador2.Mostrar(2);
       jugador.Raza(2);
       Random();
       CambiarFase();
}
    public void opciones() {
        System.out.println("\033[35m--------MENU--------");
        System.out.println("1.Crear edificaciones");
        System.out.println("2.Atacar para J1:");
        System.out.println("3.Atacar para J2:");
        System.out.println("4.Entrenar");
        System.out.println("5.Defender");
        System.out.println("6.Salir");
    } 
    public void mostrar() {
        int ne = 0;
        int opcion = 0;
        opciones();
        while (opcion != 6) {

            try {
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Creando edificaciones");
                        System.out.println("1.Taller 1. \n2.Taller 2. \n3.Entrenar \n4.Recolectar 1.\n5.Recolectar 2");
                        ne = leer.nextInt();
                        factory = FactoryProducer.getFactory(5);
                        Edificacion edificacion = factory.getEdificacion(1);
                        edificacion.Agregar(opcion, Jugador1, opcion);
                        System.out.println("Construyendo...");
                        //edificacion.View(ne);
                        System.out.println("\n");
                        System.out.println("Jugador 2:");
                        opciones();
                        Edificacion edificacion2 = factory.getEdificacion(2);
                        edificacion.Agregar(opcion, Jugador2, opcion);
                        //edificacion.View(2);
                        System.out.println("Construyendo...");
                        break;
                    case 2:
                        System.out.println("Atacar para J1:");
                        System.out.println("1.Escuadrones\n2.Especialistas");
                        ne = leer.nextInt();
                        factory = FactoryProducer.getFactory(3);
                        Milicia milicia = factory.getMilicia(1);
                        milicia.Adding(1, Jugador1);
                        //milicia.Viewing(1);
                        System.out.println("Vehiculos para jugador1: ");
                        System.out.println("1.Tanque\n2.Truck\n3.Herbie");
                        ne = leer.nextInt();
                        factory = FactoryProducer.getFactory(1);
                        Vehiculos vehiculos = factory.getVehiculo(1);
                        vehiculos.adjunt(ne, Jugador1);
                        System.out.println("Jugador 1");
                        opciones();
                        //vehiculos.print(1);
                        break;
                    case 3:
                        System.out.println("Atacar para J2");
                        System.out.println("1.Escuadrones\n2.Especialistas");
                        ne = leer.nextInt();
                        factory = FactoryProducer.getFactory(3);
                        Milicia milicia2 = factory.getMilicia(2);
                        milicia2.Adding(2, Jugador1);
                        //milicia2.Viewing(2);
                        System.out.println("Vehiculos para jugador2: ");
                        System.out.println("1.Tanque\n2.Truck\n3.Herbie");
                        ne = leer.nextInt();
                        factory = FactoryProducer.getFactory(1);
                        Vehiculos vehiculos2 = factory.getVehiculo(2);
                        vehiculos2.adjunt(ne, Jugador2);
                        opciones();
                        //vehiculos2.print(2);
                        
                        break;
                    case 4:
                        System.out.println("Entrenando");
                        opciones();
                        break;
                    case 5:
                        System.out.println("Defendiendo");
                        opciones();

                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese una de las opciones.");
                leer.nextLine();
            }
        }
    }
    
    public void Random(){
       double random1 = Math.random();
            double numeroRandom = random1;
            if(numeroRandom<0.5){
                System.out.println("\033[31mRANDOM: Turno de " + Jugador1);
            }else{
                System.out.println("\033[31mRANDOM : Turno de "+ Jugador2);
            }
    }
    public void CambiarFase(){   
    }
}

    

