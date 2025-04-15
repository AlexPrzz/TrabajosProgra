import java.util.function.BiFunction;

public class Ejer6 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Double> calcularPotencia = (base, exponente) -> Math.pow(base, exponente);

        int num1 = 2;
        int num2 = 4;
        System.out.println(num1 + " elevado a " + num2 + " es: " + calcularPotencia.apply(num1, num2));
    }
}