import java.util.function.BiFunction;
import java.util.function.Function;

public class Ejer9 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 4;
        System.out.println(calcularYMostrar(num1, num2));
    }

    public static String calcularYMostrar(int base, int exponente) {
        BiFunction<Integer, Integer, Double> calcularPotencia = (b, e) -> Math.pow(b, e);
        Function<Double, String> mostrarResultado = numero -> "Resultado: " + numero;

        return mostrarResultado.apply(calcularPotencia.apply(base, exponente));
    }
}