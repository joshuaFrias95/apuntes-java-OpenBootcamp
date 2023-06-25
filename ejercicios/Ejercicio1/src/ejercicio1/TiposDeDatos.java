package ejercicio1;

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
     *      - Float: Es un tipo de dato para almacenar números decimales con precisión simple de 32 bits. Se declara con una "f" al final del valor. Ejemplo: 3.4f;
     *      - Double: Es un tipo de dato para almacenar números decimales con precisión simple de 64 biys. Se declara con una "d" al final del valor. Ejemplo: 43.70d;
     * 
     * 
     *      BOOLEANOS
     * 
     *      Sirve para definir tipos de datos booleanos, es decir, aquellos que solamente tienen un valor de "true" o "false". Ocupan 1 bit de información.
     * 
     *      TEXTO:
     * 
     *      - Character: Es un tipo de dato que representa a un caracter Unicode sencillo de 16 bits.
     *      - String: Conjunto de caracteres Unicode que permite almacenar cadenas de texto. Su equivalencia varía según la suma de los caracteres.
     */

    public static void main(String[] args) {
        
        //Numéricos

        //Enteros
        byte var1 = 1;
        short var2 = 5;
        int var3 = 10;
        long var4 = 100;

        //Decimales
        float var5 = 3.5f;
        double var6 = 33.99d;

        //Booleanos
        boolean var7 = false;
        boolean var8 = true;

        //Texto
        char var9 = 'a';
        String var10 = "Hola, soy un String";


        System.out.println("*** Tipos de datos ***\n"); 
        System.out.println("Numéricos\n\n" + "\nEnteros:\n");
        System.out.println("Byte: " + var1);
        System.out.println("Short: " + var2);
        System.out.println("Int: " + var3);
        System.out.println("Long: " + var4);
        System.out.println("\n\nDecimales:\n");
        System.out.println("Floar: " + var5);
        System.out.println("Double: " + var6);
        System.out.println("\n\nBooleanos:\n");
        System.out.println("Booleano (False): " + var7);
        System.out.println("Booleano (True): " + var8);
        System.out.println("\n\nTexto:\n");
        System.out.println("Char: " + var9);
        System.out.println("String: " + var10+"\n");
    }
}
