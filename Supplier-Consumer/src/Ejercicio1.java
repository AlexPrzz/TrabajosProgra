import java.util.function.Predicate;

public class Ejercicio1 {
    public static void main(String[] args) {
        Predicate<Integer> esMayorA100 = numero -> numero > 100;

        System.out.println(esMayorA100.test(150)); // true
        System.out.println(esMayorA100.test(50));  // false
    }
}