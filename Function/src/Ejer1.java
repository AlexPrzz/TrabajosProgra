import java.util.function.Function;

public class Ejer1 {
    public static void main(String[] args) {
        Function<String, Integer> longitudCadena = s -> s.length();

        String palabra = "Programación";
        System.out.println("La longitud de la cadena \"" + palabra + "\" es: " + longitudCadena.apply(palabra));
    }
}