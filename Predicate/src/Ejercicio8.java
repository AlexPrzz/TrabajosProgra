import java.util.List;
import java.util.function.Predicate;

public class Ejercicio8 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Avión", "Casa", "Amigo", "Sol", "Animal", "Hola");

        Predicate<String> empiezaPorA = palabra -> palabra.startsWith("A");
        Predicate<String> tieneLongitud5 = palabra -> palabra.length() == 5;

        boolean algunaEmpiezaPorA = palabras.stream().anyMatch(empiezaPorA);
        boolean algunaTieneLongitud5 = palabras.stream().anyMatch(tieneLongitud5);

        System.out.println("¿Alguna cadena empieza por 'A'? " + algunaEmpiezaPorA);
        System.out.println("¿Alguna cadena tiene longitud 5? " + algunaTieneLongitud5);
    }
}