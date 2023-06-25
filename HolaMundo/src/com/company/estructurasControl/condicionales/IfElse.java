package com.company.estructurasControl.condicionales;

/**
 *  -- IF / ELSE
 * Utilizamos las sentencias de control IF y ELSE para realizar ciertas acciones únicamente si se cumplen algunas condiciones.
 *      Ejemplo:
 *          Si [sucede algo] haz esto...
 *          Si no, haz esto otro...
 * Es posible utilizar if sin else, permitiendo al programa realizar alguna acción solamente si se completa una condición
 */
public class IfElse {

    public static void main(String[] args) {

        int edad = 16;

        if (edad > 18) { //Si edad (19) es mayor que 18...

            System.out.println("Es mayor de edad");
        } else {  // Si no...

            System.out.println("Es menor de edad");
        }




    }
}
