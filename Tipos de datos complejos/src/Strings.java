public class Strings {
    /**
     * Las cadenas de texto o String son un tipo de dato complejo que se compone de una serie de caracteres que
     * forman un texto complejo.
     * Un String es una clase y el texto que contienen son sus instancias, es por eso que pueden tener métodos,
     * dichos métodos nos van a permitir realizar diferentes acciones en ellos, sin embargo, es importante resaltar
     * que, a diferencia de otros lenguajes, el valor de un String es inmutable y para asignarles métodos es necesario
     * agregarlos en variables nuevas.
     */
    public static void main(String[] args) {

        // Un String es un tipo de dato complejo que contiene una cadena de texto hecha con caracteres
        String cadena = "Hola, soy una cadena de texto o String";
        System.out.println(cadena);

        //  El método .length() permite conocer la longitud de nuestr String
        int cadenalngth = cadena.length();
        System.out.println("La longitud de mi cadena es de " + cadenalngth);

        // El método .toLowerCase() nos va a permitir pasar nuestro mensaje a minúscula
        //
        String cadenaminus = cadena.toLowerCase();
        String cadenaMayus = cadena.toUpperCase();

        System.out.println("Mi cadena en minúscula es " + cadenaminus);
        System.out.println("Mi cadena en mayúscula es " + cadenaMayus);

        // El método .startsWith() nos retorna un valor booleano que nos dirá si nuesta cadena inicia o no con el valor que le demos
        // Lo guardamos en una variable boolean por el valor que retorna
        boolean resultado = cadena.startsWith("Hola");

        // Si nuestra cadena comienza con el mismo valor que le asignamos al método .startsWith() nos dará coo resultado true
        if (resultado) {
            System.out.println("¿Mi cadena empieza con ¿\"Hola\"? " + resultado);
        } else {
            System.out.println("¿Mi cadena empieza con ¿\"Hola\"? " + resultado);
        }

        // Del mismo modo tenemos el método .endsWith() que actua igual que .startsWith() pero con el final del string
        resultado = cadena.endsWith("o");

        if (resultado) {
            System.out.println("¿Mi cadena termina con ¿\"o\"? " + resultado);
        } else {
            System.out.println("¿Mi cadena termina con ¿\"o\"? " + resultado);
        }

        // El método .charAt() nos devuelve un valor char y nos va a decir cuál es el caracter que está en la posición que le indiquemos dentro de nuestro String

        // Recorriendo un String por medio de un ciclo for
        cadena = "Soy un texto";
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println("caracter actual " + cadena.charAt(i));
        }



    }
}
