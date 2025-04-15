import java.util.function.BiFunction;

public class Ejer5 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> suma = (a, b) -> a + b;

        int num1 = 8;
        int num2 = 7;
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma.apply(num1, num2));
    }
}