import java.util.function.BiPredicate;

public class Ejercicio5 {
    public static void main(String[] args) {
        BiPredicate<String, String> sonIguales = (str1, str2) -> str1.equals(str2);

        System.out.println(sonIguales.test("hola", "hola")); // true
        System.out.println(sonIguales.test("Hola", "hola")); // false
        System.out.println(sonIguales.test("java", "python")); // false
    }
}