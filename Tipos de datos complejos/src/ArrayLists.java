import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLists {
    /**
     * Un ArrayList utiliza la implementación de la interfaz o super clase List, funciona de forma similar al un vector, sin embargo,
     * el ArrayList no crece su capacidad al doble si no en un 50%.
     * La super clase List es madre de diferentes clases entre las cuales se destacan "ArrayList" y "LinkedList". Para poder
     * utilzarlas es necesario importar el paquete "java.util.ArrayList".
     * A diferencia de un vector, es imposible modificar o alterar dos ArrayList al mismo tiempo al crear programación multihilo
     */
    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Elemento A");
        lista.add("Elemento B");
        lista.add("Elemento C");

        System.out.println("Contenido del ArrayList: " + lista);

        // Eliminando elementos de un ArrayList
        lista.remove("Elemento B");
        System.out.println("Contenido del ArrayList: " + lista);

        // Convirtiendo un ArrayList en un Array e imprimiendo
        for (Object arrayObjeto : lista.toArray()) {
            System.out.println(arrayObjeto.toString());
        }



        //LinkedList
        // Se declara del mismo modo que un ArrayList ya que ambos son listas
        // La diferencia es que la ArrayList es más rápida para agregar o eliminar elementos mientras que
        // la LinkedList es más rápida para modificar sus datos.
        LinkedList<String> listaEnlazada = new LinkedList<String>();

    }
}
