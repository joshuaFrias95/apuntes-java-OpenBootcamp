import java.math.BigDecimal;

public class ValorBigDecimals {
    /**
     * En ocasiones es necesario el obtener números decimales de alta presición y al utilizar datos double o float
     * podemos perderla, lo que puede resultar en grandes errores en sistemas financieros o similares.
     * Para eso utilizamos la clase BigDecimal, es necesario importar el paquete java.math.BigDecimal. Para poder
     * realizar operaciones con esta clase es necesario utilizar sus métodos propios
     */
    public static void main(String[] args) {
        BigDecimal valorA = new BigDecimal(0.1f);
        BigDecimal valorB = new BigDecimal(0.1f);

        // Suma valorA + valorB
        BigDecimal resultado = valorA.add(valorB);
        
        System.out.println(resultado.toString());
    }
}
