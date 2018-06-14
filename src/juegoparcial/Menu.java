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
   String Jugador1,Jugador2;
   String idJugador = Jugador1 ;
   int raza1,raza2;
   Scanner leer = new Scanner(System.in);
   AbstractFactory factory;
   
    public void Registrar(){
       System.out.println("**********BRENDA'S WORLD**********");
       System.out.println("Nombre jugador1: ");
       Jugador1 = leer.nextLine();
       System.out.println("RAZAS DISPONIBLES: 1.Enanos, 2.Hechiceros, 3.Luchadores");
       raza1 = leer.nextInt();
       leer.nextLine();
       factory = FactoryProducer.getFactory(4);
       Jugador jugador = factory.getJugador(1);
       jugador.Registrar(Jugador1, raza1);
       //jugador.Mostrar(1);
       jugador.Raza(1);
       
       System.out.println("Nombre jugador2: ");
       Jugador2 = leer.nextLine();
       System.out.println("RAZAS DISPONIBLES: 1.Enanos, 2.Hechiceros, 3.Luchadores");
       raza2 = leer.nextInt();
       leer.nextLine();
       factory = FactoryProducer.getFactory(4);
       Jugador jugador2 = factory.getJugador(2);
       jugador2.Registrar(Jugador2, raza2);
       //jugador2.Mostrar(2);
       jugador.Raza(2);
       Random();
}
    public void opciones() {
        System.out.println("--------MENU--------");
        System.out.println("1. Crear edificaciones");
        System.out.println("2.Atacar");
        System.out.println("3.Entrenar");
        System.out.println("4.Defender");
    }
    public void mostrar() {
        int ne = 0;
        int opcion = 0;
        opciones();
        while (opcion != 5) {

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
                        edificacion.View(1);

                        break;
                    case 2:
                        System.out.println("Atacando jugado conr");
                        System.out.println("1.Escuadrones\n2.Especialistas");
                        ne = leer.nextInt();
                        factory = FactoryProducer.getFactory(3);
                        Milicia milicia = factory.getMilicia(1);
                        milicia.Adding(ne, idJugador);
                        milicia.Viewing(1);
                        System.out.println("Vehiculos para atacar: ");
                        System.out.println("1.Tanque\n2.Truck");
                        ne = leer.nextInt();
                        factory = FactoryProducer.getFactory(1);
                        Vehiculos vehiculos = factory.getVehiculo(1);
                        vehiculos.adjunt(ne, Jugador1);
                        vehiculos.print(1);

                        break;
                    case 3:
                        System.out.println("Entrenando");
                        break;
                    case 4:
                        System.out.println("Defendiendo");
                        break;
                    default:
                        System.out.println("Por favor ingrese una opcion valida.");

                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, ingrese una de las opciones.");
                leer.nextLine();
            }
        }
    }
    public void Random(){
        Math.random();
            double numeroRandom = Math.random();
            if(numeroRandom<0.5){
                System.out.println("RANDOM: Turno de " + Jugador1);
            }else{
                System.out.println("RANDOM : Turno de "+ Jugador2);
            }
    }
}
