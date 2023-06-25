package com.company.datosYOperadores;

public class Operadores {
    
    
    /** 
     *  -- OPERADORES ARITMÉTICOS --
     * 
     *  +   SUMA
     *  -   RESTA
     *  *   MULTIPLICACIÓN
     *  /   DIVISIÓN
     *  %   RESTO O RESIDUO
     * 
     * 
     *  -- OPERADORES DE COMPARACIÓN --
     * 
     *  >   MAYOR QUE
     *  <   MENOR QUE
     *  >=  MAYOR O IGUAL QUE
     *  <=  MENOR O IGUAL QUE
     *  ==  IGUAL QUE
     *      
     *  -- OPERADORES LÓGICOS --
     * 
     *  &&  and -- Nos permite comparar si una condición está dentro de un rango. Si x es esto y (&&) es esto otro, entonces...
     *  ||  or -- Nos permite comparar si una condición es una u otra condición. Si x es esto o (||) es esto otro, entonces...
     *
     *
     *  -- INCREMENTO --
     *
     *  ++  SUMA 1 AL VALOR ORIGINAL
     *      int numero++;
     *
     *  -- DECREMENTO --
     *
     *  -- RESTA 1 AL VALOR ORIGINAL
     *      int numero--;
     * 

     */
    public static void main(String[] args) {
        
        // Aritméticos
        int numero1 = 10;
        int numero2 = 20;
        int resultadoSuma = numero1 + numero2;

        System.out.println(resultadoSuma);
        System.out.println(resultadoSuma + 5.77);

        int resultadoResta = numero1 - numero2;



         // Operadores de comparación

         boolean resultado1 = numero1 > numero2; // False
         boolean resultado2 = numero1 < numero2; // True


         boolean resultado3 = numero1 > 5 && numero1 < 30;

         int edad = 17;
         // Si la edad está entre 16 y 26 años
         boolean carnet = edad > 15 && edad < 27; // True
    }
}
