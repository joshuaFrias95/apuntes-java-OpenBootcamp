

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

import static java.util.Collections.*;

public class Main {
    /**
     * +++ EJERCICIOS 7,8 y 9 +++
     */
    public static void main(String[] args) {

        System.out.println("\nEjercicio 1:\n------------------------");
        System.out.println("Poner un string al revez");
        System.out.println("Hola mundo al revez es " + reverse("Hola mundo"));


        System.out.println("\nEjercicio 2 Parte 1:\n------------------------");
        System.out.println("Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores\n");
        String[] array1 = new String[]{
                "Este es un elemento de un array",
                "Este es otro elemento de un array",
                "Este es el último elemento de un array"
        };

        for (String elemento : array1) {
            System.out.println(elemento);
        }

        System.out.println("\nEjercicio 2 Parte 2:\n------------------------");
        System.out.println("Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones\n");

        int[][] array2 = new int[][]{
                {1, 2},
                {5, 4}
        };

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                System.out.println("Posición " + i + "/" + j + ", contenido: " + array2[i][j]);
            }
        }

        System.out.println("\nEjercicio 2 Parte 3:\n------------------------");
        System.out.println("Crea un \"Vector\" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final\n");
        Vector<String> vector = new Vector<>();
        vector.add("Elemento 1");
        vector.add("Elemento 2");
        vector.add("Elemento 3");
        vector.add("Elemento 4");
        vector.add("Elemento 5");

        System.out.println("Contenido original del vector: " + vector);
        // Al ser eliminado el segundo elemento el tercero pasa a estar en su lugar
        vector.remove(1);
        vector.remove(1);
        System.out.println("Contenido actualizado del vector: " + vector);

        System.out.println("\nEjercicio 2 Parte 4:\n------------------------");
        System.out.println("Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.\n");

        ArrayList<String> al = new ArrayList<>();
        al.add("Primer valor en el AL");
        al.add("Segundo valor en el AL");
        al.add("Tercer valor en el AL");
        al.add("Cuarto valor en el AL");

        System.out.println("Elementos en el ArrayList");
        for (String elemento : al) {
            System.out.println(elemento);
        }

        LinkedList<String> linked = new LinkedList<>(al);
        System.out.println("Elementos del ArrayList copiado en una LinkedList");
        for (String ls : linked) {
            System.out.println("Elementos del LinkedList: " + ls);
        }

        System.out.println("\nEjercicio 2 Parte 5:\n------------------------");
        System.out.println("Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.");
        System.out.println("A continuación, con otro bucle, recórrelo y elimina los numeros pares.");
        System.out.println("Por último, vuelve a recorrerlo y muestra el ArrayList final.\n");

        ArrayList<Integer> array3 = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            array3.add(i);
        }

        System.out.println("Contenido del array3: " + array3);

        for (int i = 0; i < array3.size(); i++) {
            int elemento = array3.get(i);

            if (elemento % 2 == 0) {
                array3.remove(i);
            };
        }

        System.out.println("Contenido del array3 al eliminar números pares: " + array3);

        System.out.println("\nEjercicio 2 Parte 6:\n------------------------");
        System.out.println("Crea una función DividePorCero. Esta, debe generar una excepción (\"throws\") a su llamante del tipo ArithmeticException");
        System.out.println("que será capturada por su llamante (desde \"main\", por ejemplo). Si se dispara la excepción, mostraremos el mensaje \"Esto no puede hacerse\". Finalmente, mostraremos en cualquier caso: \"Demo de código\n");

        try {

            int resultado = DividePorcero();
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {

            System.out.println("No es posible dividir entre 0");
            e.printStackTrace();

        }
    }
    /**
     * Método que invierte el sentido de un String
     * @param texto
     * @return invertida
     */
    public static String reverse(String texto) {

        String invertida = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }
        return invertida;
    }

    public static int DividePorcero() throws ArithmeticException {
        int val1 = 5;
        int val2 = 0;

        return val1 / val2;
    }
}
