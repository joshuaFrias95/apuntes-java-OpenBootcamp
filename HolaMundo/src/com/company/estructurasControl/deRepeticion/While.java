package com.company.estructurasControl.deRepeticion;

/**
 *  -- CICLO WHILE --
 *  A diferencia del ciclo For que está limitado a una cierta cantidad de repeticiones, el ciclo while
 *  va a repetirse continua y progresivamente hasta que una condición se cumpla o el programa concluya.
 */
public class While {

    public static void main(String[] args) {

        int contador = 0;
        while (contador < 10) {
            System.out.println("Valor de contador: " + contador);
            contador++;

            if (contador == 5) {
                System.out.println("Saltamos en 5");
                continue;
            }

            if (contador == 8) {
                System.out.println("Utilizamos break para romper un ciclo. Valor de contador es: " + contador);
                break;
            }
        }
    }
}
