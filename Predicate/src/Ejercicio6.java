import java.util.List;
import java.util.function.Predicate;

public class Ejercicio6 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(10, 20, 25, 27, 30, 35, 40, 50, 60, 70);

        Predicate<Integer> estaEntre25Y30 = numero -> numero >= 25 && numero <= 30;

        boolean resultado = numeros.stream().anyMatch(estaEntre25Y30);

        System.out.println("¿Algún número está entre 25 y 30? " + resultado);
    }
}