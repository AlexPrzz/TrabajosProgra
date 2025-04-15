import java.util.*;
import java.util.function.BiFunction;

public class Ejer12 {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("Java", "Lambda", "Programación", "Código");

        BiFunction<String, String, String> filtrarPorPrefijo = (texto, prefijo) ->
                texto.startsWith(prefijo) ? texto : null;

        String condicion = "L";
        lista.forEach(texto -> System.out.println(filtrarPorPrefijo.apply(texto, condicion)));
    }
}