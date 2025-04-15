import java.util.function.Function;

public class Ejer7 {
    public static void main(String[] args) {
        Function<Double, String> mostrarResultado = numero -> "Resultado: " + numero;

        double valor = 9.5;
        System.out.println(mostrarResultado.apply(valor));
    }
}