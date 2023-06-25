import java.util.Vector;

public class Vectores {
    /**
     *  Un vector funciona de la misma manera que un Array, sin embargo, estos no deben tener por obligación un
     *  tamaño especifico al declararlos.
     *  Para utilizar Vectores es necesario importar la libreria "java.util.Vector"
     *  Los vectores van creando internamente Arrays dentro de ellos con capacidad de 10 elementos cada uno,
     *  al pasar esta capacidad se crea un nuevo Array interno y se amplia su capacidad de 10 en 10
     */
    public static void main(String[] args) {

        // Sintaxis para crear un vector de enteros
        Vector<Integer> vector = new Vector(20, 5);
        // Agregando valores al vector
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        // Imprimiedo los valores dentro del vector
        System.out.println("Datos del vector: " + vector);
        System.out.println("Tamaño del Vector: " + vector.size());
        System.out.println("Capacidad del Vector: " + vector.capacity() + "\n");

        // Eliminando un valor del vector a partir de su índice
        vector.remove(2);
        System.out.println("Datos del vector: " + vector);
        System.out.println("Tamaño del Vector: " + vector.size());
        System.out.println("Capacidad del Vector: " + vector.capacity() + "\n");

        // Ampliando la capacidad del vector
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        System.out.println("Datos del vector: " + vector);
        System.out.println("Tamaño del Vector: " + vector.size());
        System.out.println("Capacidad del Vector: " + vector.capacity() + "\n");

        Vector<Integer> vector2 = new Vector();
        vector2.add(1);
        vector2.add(2);
        vector2.add(3);
        vector2.add(4);
        vector2.add(5);

        // Comparando dos vectores
        boolean resultado = vector.equals(vector2);
        System.out.println(vector);
        System.out.println(vector2);
        if (resultado) {
            System.out.println("Vector 1 y Vector dos son iguales");
        } else {
            System.out.println("Vector 1 y Vector dos no son iguales");
        }

        System.out.println("\nRecorriendo el Vector 1");
        // Recorriendo un vector
        for (int i : vector) {
            System.out.println("Valor actual del vector 1: " + i);
        }

        System.out.println("\nRecorriendo el Vector 2");
        for (int i = 0; i < vector2.size(); i++) {
            System.out.println("Valor actual del Vector 2 es" + vector2.get(i) + " en su posición " + i);
        }

        Vector<Integer> vector3 = new Vector(16);
        vector3.add(1);
        vector3.add(2);
        vector3.add(3);
        vector3.add(4);

        System.out.println("\nCapacidad del Vector: " + vector3.capacity() + " y su tamaño es de: " + vector3.size());
        // Reduciendo la capacidad al tamaño que tiene el vector
        vector3.trimToSize();
        System.out.println("\nCapacidad del Vector: " + vector3.capacity() + " y su tamaño es de: " + vector3.size());
    }
}
