import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class EntradaDeDatos {
    /**
     *  Es posible leer ficheros específicos a partir de Java, para eso podemos utilizar los paquetes que provengan
     *  de java.io. Aunque no es tan necesario, este método nos va a permitir leer ficheros que no estén en bases de datos
     *  propiamente establecidas.
     * 
     */
    public static void main(String[] args)  {

        // Lectura de un fichero
        try {
            InputStream fichero = new FileInputStream("/etc/passwd");

            try {

                // Almacenamos la información del fichero en una variable
                byte []datos = fichero.readAllBytes();

                // Utilizamos un ciclo for each para imprimir en pantalla lo valores guardados
                for (byte dato : datos) {
                    System.out.print((char)dato);
                }

                // Lectura de datos caracter por caracter
                int datos2 = fichero.read();

                System.out.println("\n");
                while (datos2 != -1) {
                    // EOF (End Of File) = -1
                    System.out.print((char)datos2);
                    datos2 = fichero.read();

                }


            } catch (IOException e) {
                System.out.println("No se ha podido leer el fichero " + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el fichero " + e.getMessage());
        }
    }
}
