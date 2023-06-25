package ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {

        String[] nombres = {"Nick Cave & The bad seeds", "Arctic Monkeys", "Jamiroquai", "Red Hot Chilli Peppers"};
        String nombre = "Ahora estoy escuchando: ";

        for (int i = 0; i < nombres.length; i++) {

            nombre = nombre + nombres[i] + ", ";
        }

        System.out.println(nombre + "¿Qué te parece?");
    }
}
