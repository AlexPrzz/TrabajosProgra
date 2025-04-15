import java.util.function.Predicate;

public class Ejercicio3 {
    public static void main(String[] args) {
        Predicate<Integer> esMayorA100OMenorA50 = numero -> numero > 100 || numero < 50;

        System.out.println(esMayorA100OMenorA50.test(150)); // true
        System.out.println(esMayorA100OMenorA50.test(75));  // false
        System.out.println(esMayorA100OMenorA50.test(30));  // true
    }
}