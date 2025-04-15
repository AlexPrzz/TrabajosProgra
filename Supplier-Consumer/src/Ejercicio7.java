import java.util.List;
import java.util.function.Predicate;

public class Ejercicio7 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(10, 15, 33, 30, 33, 50, 33, 75, 80, 90);

        Predicate<Integer> esIgualA33 = numero -> numero == 33;

        boolean existe33 = numeros.stream().anyMatch(esIgualA33);
        long contador33 = numeros.stream().filter(esIgualA33).count();

        System.out.println("¿Existe al menos un 33 en la lista? " + existe33);
        System.out.println("El número 33 aparece " + contador33 + " veces en la lista.");

        System.out.println("Me repites ese numerín?"+ " 33!");
    }
}