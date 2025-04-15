import java.util.*;
import java.util.function.Function;

public class Ejer4 {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("Java", "Lambda", "Programación", "Código");

        Function<String, Integer> obtenerLongitud = s -> s.length();

        Map<String, Integer> mapa = convertirListaEnMap(lista, obtenerLongitud);

        System.out.println("Mapa generado: " + mapa);
    }

    public static Map<String, Integer> convertirListaEnMap(List<String> lista, Function<String, Integer> funcion) {
        Map<String, Integer> mapa = new HashMap<>();
        lista.forEach(s -> mapa.put(s, funcion.apply(s)));
        return mapa;
    }
}