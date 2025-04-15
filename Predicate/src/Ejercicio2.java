import java.util.function.Predicate;

public class Ejercicio2 {
    public static void main(String[] args) {
        Predicate<Integer> estaEntre100Y300 = numero -> numero >= 100 && numero <= 300;

        System.out.println(estaEntre100Y300.test(150)); // true
        System.out.println(estaEntre100Y300.test(50));  // false
        System.out.println(estaEntre100Y300.test(350)); // false
    }
}