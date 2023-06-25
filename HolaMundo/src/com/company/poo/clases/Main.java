package com.company.poo.clases;

import com.company.poo.clases.Motor.Motor;
import com.company.poo.herencia.Camion;
import com.company.poo.herencia.Coche;
import com.company.poo.herencia.Motocicleta;

/**
 *  -- CLASES --
 *  Las clases y objetos nos van a permitir abstraer y traer objetos de la realidad a nuestro programa en Java.
 *  Una clase funciona como una plantilla base para generar objetos.
 *  Ejemplo:
 *  CLASE: Coche
 *  Objetos: cocheRojo, cocheAzul, cocheVerte
 *  CLASE: Ropa
 *  Objetos: camisa, pantalon, zapatos, blusa, blusaChica, tacones, taconesRojos
 */
public class Main {

    /**
     *
     * -- STATIC --
     *
     * El método static nos indica que este método solamente pertenece a la clase Main y no a los objetos
     * de la misma.
     */
    public static void main(String[] args) {

        // Creando objeto.
        //Estructura:
        // clase + identificador = new + Clase();

        // Creando objeto con constructor vacío
        Vehiculo toyotaPrius = new Vehiculo();

        // Creación de objeto motor con parámetros
        Motor motorGTI = new Motor("GTI", 190, 459.0, 6);

        // Creando objeto con constructor con parámetros || Utilizamos el objeto motor como parte de propiedad del objeto
        Vehiculo fordMondeo = new Vehiculo("Ford", "Mondeo", 2.1, 2010, false, 0, motorGTI);
        // Imprimimos propiedades de un objeto con esta sintaxis:
        //objeto.propiedad
        System.out.println(fordMondeo.fabricante);
        System.out.println(fordMondeo.year);
        System.out.println(fordMondeo.speed);   // speed = 0;
        //Asignamos un valor a velocidad
        fordMondeo.acelerar(50);
        System.out.println(fordMondeo.speed);   // speed = 50;

        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = "Kawasaki";

        System.out.println("Fin de programa");


        // POLIMORFISMO:
        // Un objeto que funciona como variable y a la cuál se le pueden asignar diferentes valores y diferente comportamiento
        Vehiculo vehiculo;

        vehiculo = new Motocicleta();
        vehiculo.acelerar(50);

        vehiculo = new Coche();
        vehiculo.acelerar(50);

        vehiculo = new Camion();
        vehiculo.acelerar(50);


        // Clases abstractas
        // No pueden ser instanciadas(crear objetos), solo pueden instanciar las clases hijas

    }
}
