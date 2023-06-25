package com.company.estructurasControl.deRepeticion;

/**
 *  -- CICLOS DE CONTROL DE REPETICIÓN
 *  Los ciclos de control de repetición nos permiten, como dice su nombre, repetir constantemente un fragmento
 *  de código hasta que cierta condición se cumpla.
 */
public class CicloFor {

    public static void main(String[] args) {

        // Ciclo For para imprimir una cantidad de veces un "Hola mundo" enliastado numericamente
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " Hola Mundo");
        }


        // Ciclo For para imprimir el contenido de un Array

                // INDICES:   0        1           2
        String[] nombres = {"Pepe", "Juanito", "Roberta"}; // length: 3

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
}
