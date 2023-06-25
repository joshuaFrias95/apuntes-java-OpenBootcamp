import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapas {
    /**
     * A un mapa se le conoce de dos formas: "Mapas" o "Array Asociativo".
     * Un mapa es similar a un diccionario en donde tengo una clave y un valor en donde el valor puede ser
     * cualquier tipo de dato.
     * La forma más primitiva de un mapa es el "Hashmap" y es necesario importar el paquete java.util.HashMap.
     * En un HashMap no podemos tener la clave duplicada
     *
     */
    public static void main(String[] args) {

        //       Clave   Valor
        HashMap<String, Integer> map = new HashMap<>();
        map.put("clave1", 10);
        map.put("clave2", 20);
        map.put("clave3", 30);

        // Imprimiendo el mapa completo
        System.out.println(map);
        // Imprimiendo un solo valor del mapa
        System.out.println(map.get("clave1"));

        // Reemplazando un elemento del mapa
        map.replace("clave3", 90);
        System.out.println(map);

        // Removiendo un elemento del mapa
        map.remove("clave2");
        System.out.println(map);

        // Recorriendo un HashMap
        for (Map.Entry elemento : map.entrySet()) {
            // Obteniendo la clave
            System.out.println("Elemento clave es " + elemento.getKey());
            // Obteniendo el valor
            System.out.println("Elemento valor es " + elemento.getValue());
        }

        // Mapa TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        map.put("clave1", 10);
        map.put("clave2", 20);
        map.put("clave3", 30);

        System.out.println(treeMap);
    }
}
