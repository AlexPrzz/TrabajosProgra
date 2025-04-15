import java.util.*;
import java.util.function.BiFunction;

public class Ejer11 {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("Java", "Lambda", "Programación", "Código");

        BiFunction<String, Integer, String> filtrarPorLongitud = (texto, limite) ->
                texto.length() > limite ? texto : null;

        int tamañoReferencia = 5;
        lista.forEach(texto -> System.out.println(filtrarPorLongitud.apply(texto, tamañoReferencia)));
    }
}