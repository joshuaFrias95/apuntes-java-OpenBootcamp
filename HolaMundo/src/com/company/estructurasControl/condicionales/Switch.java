package com.company.estructurasControl.condicionales;

/**
 *  -- SWITCH
 *  Las condicionales SWITCH nos dan la misma funcionalidad que usar IF/ELSE IF, salvo que tenemos mayor control
 *  y orden para ejecutar lo que necesitemos.
 */
public class Switch {

    public static void main(String[] args) {

        String dia = "dia";

        switch (dia) {
            case "Lunes": // Cada case funciona igual que un else if
                System.out.println("Hoy es Lunes");
                break; // Al terminar de comparar con cada caso agregamos un break para que, en caso de cumplirse la condición, la comparación termine
            case "Martes":
                System.out.println("Hoy es Martes");
                break;
            case "Miércoles":
                System.out.println("Hoy es Miércoles");
                break;
            case "Jueves":
                System.out.println("Hoy es Jueves");
                break;
            case "Viernes":
                System.out.println("Hoy es Viernes");
                break;
            case "Sábado":
                System.out.println("Hoy es Sábado");
                break;
            case "Domingo":
                System.out.println("Hoy es Domingo");
                break;
            default:    // Equivalente a else
                System.out.println("No es un día valido");
        }
    }
}
