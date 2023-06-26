import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BuffersImputStreams {
    /**
     * A diferencia de los InputStream, el buffer imput stream no trabaja con ficheros si no con entradas,
     * es decir, que no carga todo el fichero en memoria si no que lo va leyendo y cargando  poco a poco y
     * conforme se use. Su función principal es segmentar cada sección del fichero para no cargar excesivamente la memoria
     * y permitir una lectura más fluida
     *
     */
    public static void main(String[] args) {

        try {
            InputStream fichero = new FileInputStream("/etc/passwd");
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);

            try {
                int dato = ficheroBuffer.read();

                while(dato != 1) {
                    System.out.print((char)dato);
                    dato = ficheroBuffer.read();
                }
            } catch (IOException e) {
                System.out.println("No se pudo leer el fichero");
            }

        } catch (Exception e) {
            System.out.println("No se pudo acceder al fichero");
        }
    }
}
