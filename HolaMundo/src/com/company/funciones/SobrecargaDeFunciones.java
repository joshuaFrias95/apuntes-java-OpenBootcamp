package com.company.funciones;

public class SobrecargaDeFunciones {
    
    
    /** 
     *  -- SOBRECARGA DE FUNCIONES
     * 
     *  La sobrecarga de funciones se logra cuando declaramos dos funciones con el mismo identificador
     *  pero le asignamos parámetros diferentes. Por ejemplo, declaramos dos funciones suma() que van
     *  a tener como parámetros los int num1 y num2, sin embargo, la segunda declaración lleva un tercer
     *  parámetro que lo diferencía de la primera.
     * 
     *  Nos va a permitir duplicar una función SIEMPRE Y CUANDO TENGAMOS TIPO/VALOR DEL PARÁMETRO.
     */
    public static void main(String[] args) {


        
    }

    static int suma(int num1, int num2) {
        return num1 + num2;
    }

    static int suma(int num1, int num2, int num3) {
        return num1 + num2;
    }
}
