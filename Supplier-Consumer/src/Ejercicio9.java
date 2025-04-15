import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ejercicio9 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Perro", "Casa", "Playa", "Sol", "Pelota", "Hola");

        Predicate<String> noEmpiezaPorP = palabra -> !palabra.startsWith("P");

        List<String> resultado = palabras.stream()
                .filter(noEmpiezaPorP)
                .collect(Collectors.toList());

        System.out.println("Elementos que no empiezan por 'P': " + resultado);
    }
}