package Ejercicio2;

public class CalcularIva {

    public static void main(String[] args) {

        float precioInicial = 100.00f;
        float iva = 0.15f;
        float precioTotal = precioConIva(precioInicial, iva);
        System.out.println("\nEl precio inicial era de: "+ precioInicial + ".\n El precio final más IVA es de: " + precioTotal + ".");

    }

    static float precioConIva(float precioInicial, float iva) {
        float precioFinal = precioInicial + (precioInicial * iva);

        return precioFinal;
    }

}
