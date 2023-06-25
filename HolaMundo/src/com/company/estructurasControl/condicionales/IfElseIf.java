package com.company.estructurasControl.condicionales;

/**
 *  -- IF / ELSE IF
 *  Las sentencias de control IF / ELSE IF nos permiten agregar más condiciones y poder mapear más posibilidades que solo
 *  con if / else.
 */
public class IfElseIf {

    public static void main(String[] args) {

        String dia = "Día";

        // Ejemplos de comparación
        boolean resultadoCompararNum = 5 == 5; // En Java se comparan números de esta manera
        boolean resultado = dia.equals(""); // En Java se comparan strings de esta manera

        if (dia.equals("Lunes")) {
            System.out.println("Hoy es Lunes");

        } else if (dia.equals("Martes")) {
            System.out.println("Hoy es Martes");

        } else if (dia.equals("Miércoles")) {
            System.out.println("Hoy es Miércoles");

        } else if (dia.equals("Jueves")) {
            System.out.println("Hoy es Jueves");

        } else if (dia.equals("Viernes")) {
            System.out.println("Hoy es Viernes");

        } else if (dia.equals("Sábado") || dia.equals("Domingo")){
            System.out.println("Es fin de semana");
        } else {
            System.out.println("Ese día no existe");
        }

    }
}
