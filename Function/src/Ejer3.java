import java.util.function.Function;

public class Ejer3 {
    public static void main(String[] args) {
        Function<String, Integer> longitudCadena = s -> s.length();
        Function<Integer, Integer> potenciaDos = n -> (int) Math.pow(n, 2);

        String palabra = "Programación";
        int longitud = longitudCadena.apply(palabra);
        int resultado = potenciaDos.apply(longitud);

        System.out.println("La potencia de dos de la longitud de \"" + palabra + "\" es: " + resultado);
    }
}