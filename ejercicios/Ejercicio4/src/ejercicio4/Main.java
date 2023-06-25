package ejercicio4;

import ejercicio4.clases.SmartPhone;
import ejercicio4.clases.SmartWatch;


public class Main {
    /**
     *
     * -- EJERCICIO 4 --
     * - Instrucciones:
     * - Crear una clase padre llamada SmartDevices
     * - De esta clase instanciar dos clases hijas llamadas "SmartPhone" y "SmartWatch"
     * - Agregarles atributos a estas tres clases
     * - Crear un constructor vacío y uno con todas sus propiedades en cada clase
     * - Desde una clase Main crear objetos de las dos clases hijas e imprimir valores en consola
     *
     */
    public static void main(String[] args) {


        System.out.println("\n~~~ SMARTPHONES ~~~\n");
        SmartPhone iphone6 = new SmartPhone("Iphone", 2012, 5.3, "Blanco", 4, true, 4.3, 3.5, 100);
        SmartPhone iphone13 = new SmartPhone("Iphone");
        System.out.println(iphone13.marca + " 13");
        iphone13.cargaRapida(true);

        System.out.println("\nIphone 6\nAño: " + iphone6.year);
        iphone6.cargaRapida(false);

        SmartPhone galaxyS6 = new SmartPhone("Samsung");
        System.out.println("\n" + galaxyS6.marca + "Galaxy S6");
        galaxyS6.cargaRapida(false);

        System.out.println("\n\n~~~ SMARTWATCHES ~~~\n");
        SmartWatch appleWatch = new SmartWatch("Apple", 2020, 0.3, "Black", 4, true, "White", 1);
        System.out.println("\n" + appleWatch.marca);
        appleWatch.carcasaGratis(2020);
        SmartWatch googleWatch = new SmartWatch("Google", "Red", "Android");
        System.out.println("\nGoogle Watch");
        System.out.println("Marca:" + googleWatch.marca);
        googleWatch.carcasaGratis(2023);





    }



}
