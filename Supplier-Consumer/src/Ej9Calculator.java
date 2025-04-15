import java.util.function.BiConsumer;

public class Ej9Calculator {
    public static void main(String[] args) {
        System.out.println("----9)Calculator----");


        System.out.println("----7) Expresión lambda que multiplica dos enteros----");
        BiConsumer<Integer, Integer> multiplier = (a, b) -> System.out.println("Multiplicación: " + (a * b));

        System.out.println();

        System.out.println("----8) Expresiones lambda para suma, resta y división----");
        BiConsumer<Integer, Integer> sum = (a, b) -> System.out.println("Suma: " + (a + b));
        BiConsumer<Integer, Integer> subtract = (a, b) -> System.out.println("Resta: " + (a - b));
        BiConsumer<Integer, Integer> divide = (a, b) -> {
            if (b != 0) {
                System.out.println("División: " + (a / (double) b));
            } else {
                System.out.println("División: No se puede dividir por cero.");
            }
        };

        calculator(-9, 7, multiplier);
        calculator(-9, 7, sum);
        calculator(-9, 7, subtract);
        calculator(-9, 7, divide);
    }

    public static void calculator(int a, int b, BiConsumer<Integer, Integer> operation) {
        operation.accept(a, b);
    }
}