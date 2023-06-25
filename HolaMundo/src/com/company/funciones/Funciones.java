package com.company.funciones;

public class Funciones {
    
    
    /** 
     *  -- FUNCIONES --
     * 
     *  Una función es un bloque de código que vamos a poder utilizar a lo largo de nuestro programa.
     *  Esto nos va a permitir no repetir código y reutilizarlo con los datos que necesitemos.
     * 
     *  --- CÓMO SE CREA UNA FUNCIÓN
     *      
     *      * Estructura de una funcipon en Java:
     *        
     *          [Tipo de retorno (Si tiene, se indica el tipo de valor que va a retornar (Int, float,
     *           char,etc..), si no, su retorno será Void)] [identificador (El nombre de la función)]() {
     * 
     *             }
     * 
     *            Ejemplo:
     *                  
     *              static void showMenu() {
     *                  // El programa va aqui...
     *              }
     * 
     *          Como podemos apreciar, esta función es del tipo vacío ya que no retorna ningún valor.
     *          La palabra reservada static será revisada más adelante al estudiar POO.
     * 
     *          Para declarar nuestra función dentro de nuestro programa main solamnte escribimos 
     *          el identificador con sus paréntesis y sus parámetros si corresponden
     * 
     */
    public static void main(String[] args) {
        
        
        // 1
        // Función sin parámetros y sin retorno
        showMenu();
    
        
        // 2
        // Función sin parámetros y con retorno
        // No es posible únicamente llamar a la función, es necesario hacer algo con ese valor,
        //  por ejemplo, guardarlo en una variable, imprimirlo en consola, etc.

        String menu = getMenu();
        System.out.println(menu);
        System.out.println(getMenu());

        double price = getPrice();
        System.out.println(price);

        
        // 3
        // Función con parámetros y sin retorno
        // Al llamarla dentro del programa ponemos el valor que indicamos al declarar la función
        imprimirSaludoBuenosDias("Joshua");


        // 4
        // Función con varios parametros y tipo de retorno
        String nombre = "Joshua";
        String apellido = "Frías";
        String saludo = obtenerSaludo(nombre, apellido);
        System.out.println(saludo);

        int suma = suma(50, 200);
        System.out.println(suma);


    }

    static int suma(int num1, int num2) {
        return num1 + num2;
    }

    static String obtenerSaludo(String nombre, String apellido) {
        return "Buenas tardes " + nombre + " " + apellido;
    }


    // declaramos la función y le indicamos que como parámetro debe obtener la variable String name
    static void imprimirSaludoBuenosDias(String name) {

        // Llamamos la variable "name" al que se le dará un valor al ser llamada en la función principal 
        System.out.println("Buenos días " + name);
    }



    static double getPrice() {
        return 100.99;
    }


    // Las funciones se declaran por fuera de la función main     
    static void showMenu() {
        System.out.println("\nBienvenido al E-commerce de zapatillas\n");
        System.out.println("1 - Ver zapatillas");
        System.out.println("2 - Comprar zapatillas");
        System.out.println("3 - Salir");
    }

    
    // Función que va a retornar un valor del tipo string
    static String getMenu() {

        // Utilizamos return para indicar qué se va a retornar
        return "\nBienvenido al E-commerce de zapatillas\n1 - Ver zapatillas...";
    }

}
