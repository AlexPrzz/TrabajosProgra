import java.util.function.BiFunction;
import java.util.function.Function;

public class Ejer8 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Double> calcularPotencia = (base, exponente) -> Math.pow(base, exponente);
        Function<Double, String> mostrarResultado = numero -> "Resultado: " + numero;

        int num1 = 2;
        int num2 = 4;
        String resultado = mostrarResultado.apply(calcularPotencia.apply(num1, num2));

        System.out.println(resultado);
    }
}