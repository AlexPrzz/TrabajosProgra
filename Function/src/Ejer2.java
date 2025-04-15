import java.util.function.Function;

public class Ejer2 {
    public static void main(String[] args) {
        Function<Integer, Integer> potenciaDos = n -> (int) Math.pow(n, 2);

        int numero = 4;
        System.out.println("La potencia de dos de " + numero + " es: " + potenciaDos.apply(numero));
    }
}