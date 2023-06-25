package com.company.datosYOperadores;


public class TiposDeDatos {
    
    /**
     * -- TIPOS DE DATOS
     * 
     *  NUMÉRICOS
     * 
     *      ENTEROS
     * 
     *      - Byte: Representa un tipo de dato de 8 bits con signo. Puede almacenar valores numéricos de -128 a 127.
     *      - Short: Representa un tipo de dato de 16 bits con signo. Puede almacenar valores numéricos de -32.768 a 32.767.
     *      - Int: Representa un tipo de dato de 32 bits con signo. Puede almacenar valores numéricos de -2**32 a 2**31-1.
     *      - Long: Representa un tipo de dato de 64 bits con signo. Puede almacenar valores numéricos de -2**63 a 2**63-1.
     * 
     * 
     *      DECIMALES
     * 
     *      - Float: Es un tipo de dato para almacenar números decimales con precisión simple de 32 bits. Se declara con una "f" al final del valor. E>
     *      - Double: Es un tipo de dato para almacenar números decimales con precisión simple de 64 biys. Se declara con una "d" al final del valor. >
     * 
     * 
     *      BOOLEANOS
     * 
     *      Sirve para definir tipos de datos booleanos, es decir, aquellos que solamente tienen un valor de "true" o "false". Ocupan 1 bit de informa>
     * 
     *      TEXTO:
     * 
     *      - Character: Es un tipo de dato que representa a un caracter Unicode sencillo de 16 bits.
     *      - String: Conjunto de caracteres Unicode que permite almacenar cadenas de texto. Su equivalencia varía según la suma de los caracteres.
     */

    public static void main(String[] args) {
        
        //Numéricos

            // Enteros
            byte variable1 = 5;
            short variable2 = 10;
            int variable3 = 30;
            long variable4 = 400;

            // Decimales
            float variable5 = 5.5f;
            double variable6 = 10.5d;


        //Booleanos
            boolean variable7 = false;
            boolean variable8 = true;

        //Texto
            char variable9 = 'a';
            String variable10 = "Lorem Ipsum...";
    }
}
