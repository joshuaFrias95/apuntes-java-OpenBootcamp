public class Arrays {
    /**
     * Un Array es una variabe que contiene múltiples valores consecutivos con el mismo tipo.
     * La sintaxis de este tipo de valor complejo es similar que la de cualquier valor, salvo que es necesario
     * agregar [] al final del identificador.
     * Ejemplo: int estoEsUnArray[].
     * Hay diferentes formas de declarar arrays y se verán en esta clase.
     * En el caso de los Arrays y a diferencia de los String se utilizan propiedades en vez de métodos.
     * Estas propiedades nos van a permitir manejar los Arrays de cualquier manera.
     * Es posible realizar Arrays con cualquier tipo de datos, incluso con objetos;
     */
    public static void main(String[] args) {

        // Creando un Array con un tamaño estático
        int array1[] = new int[5];
        // Llenamos cada posición una por una
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        array1[4] = 5;

        // Creando un Array con posiciones estáticas en una sola línea
        int array2[] = {1, 2, 3, 4, 5};

        // Creando un Array de Strings
        String nombres[] = {
                "Pepe",
                "Juan",
                "Franciso"
        };

        // Propiedad .length
        System.out.println("Longitud del array \"nombres\" es: " + nombres.length);


        // Recorremos el Array

        // Forma 1 -- For each
        for(int i : array1) {
            System.out.println(i);
        }
        
        // Forma 2 -- For int i
        for (int i = 0; i < nombres.length ; i++) {
            System.out.println((i + 1) + " " + nombres[i]);
        }


        // Creando Array bidimensional - El primer número son filas y el segundo columnas
        int arraybidi[][] = {
                { 1, 2, 3, 4 },
                { 10, 20, 30, 40}
        };

        try {
            for(int x = 0;x < arraybidi.length; x++) {
                for (int j = 0; j < arraybidi[x].length; j++) {
                    System.out.println("Valor de x es " + x + " y valor de j es " + j);
                    System.out.println(arraybidi[x][j]);
                }
            }

        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }

    }
}
