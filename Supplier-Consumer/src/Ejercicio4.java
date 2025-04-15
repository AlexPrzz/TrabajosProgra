import java.util.function.Predicate;

public class Ejercicio4 {
    public static void main(String[] args) {
        Predicate<Integer> noEsIgualA100 = numero -> numero != 100;

        System.out.println(noEsIgualA100.test(150)); // true
        System.out.println(noEsIgualA100.test(100)); // false
        System.out.println(noEsIgualA100.test(50));  // true
    }
}