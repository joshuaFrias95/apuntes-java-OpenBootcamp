package com.company.estructurasControl.deRepeticion;

public class ForEach {
    public static void main(String[] args) {

        String[] nombres = {"Pepe", "Juanito", "Roberta"};

        // La estructura foreach funciona del mismo modo que un ciclo for, salvo que aquí únicamente declaramos una
        // variable temporal que va a almacenar los valores a recorrer  del array

        // Foreach con array de String
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        int[] numeros = {5, 10, 15};
        int suma = 0;

        // Foreach con array de números
        for (int numero: numeros) {
            suma += numero;
        }

        System.out.println(suma);
    }
}
