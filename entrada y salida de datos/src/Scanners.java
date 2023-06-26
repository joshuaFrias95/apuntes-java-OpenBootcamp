import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanners {
    /**
     *  Utilizamos scanner para hacer lectura de datos, ya sea desde un fichero o desde un teclado por parte de un usuario.
     *  En este ejercicio se piden dos números dentro de un bucle Do while que no termina hasta que se hayan ingresado valores enteros
     */
    public static void main(String[] args) {

        boolean ok = false;

        do {

            // Instanciamos un scanner
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa dos números");

            try {

                // Utilizamos el método .nextInt() para pausar el programa hasta obtener un entero que será almacenado en una variable
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                ok = true;

                System.out.println("Los valores fueron " + a + " y " + b);

            } catch (InputMismatchException e) {    // Atrapamos la excepción correspondiente a ingresar valores erroneos

                System.out.println("Valores inválidos");

            }
        } while (!ok);
    }
}
