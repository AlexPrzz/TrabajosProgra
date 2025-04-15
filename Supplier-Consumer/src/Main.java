import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        System.out.println("----1)Consumer que muestra un String----");

        Consumer<String> printer1 = message -> System.out.println(message);
        printer1.accept("Estoy en clase de programación");

        System.out.println();

        System.out.println("----2)Lista de 10 enteros----");
        List<Integer> numbers = Arrays.asList(5, 12, 8, 20, 3, 17, 1, 9, 14, 6);

        System.out.println();

        System.out.println("----Consumer que muestra un número----");
        Consumer<Integer> printer2 = number -> System.out.println(number);
        printer2.accept(42);

        System.out.println();

        System.out.println("----2)Muestra los 10 enteros de la lista----");
        numbers.forEach(printer2);

        System.out.println();

        System.out.println("----3)Lista de 10 Strings----");
        List<String> words = Arrays.asList("Hola", "Mundo", "Lambda", "Java", "Ejercicio", "Lista", "Código", "Programación", "Clase", "Computadora");

        System.out.println();

        System.out.println("----3)Consumer que muestra la última letra de cada palabra----");
        Consumer<String> printer3 = word -> System.out.println(word.charAt(word.length() - 1));
        words.forEach(printer3);

        System.out.println();

        System.out.println("----7)Expresión lambda que multiplica dos enteros----");
        BiConsumer<Integer, Integer> multiplier = (a, b) -> System.out.println("Multiplicación: " + (a * b));
        multiplier.accept(-9, 7);

        System.out.println();

        System.out.println("----8)Expresiones lambda para suma, resta y división----");
        BiConsumer<Integer, Integer> sum = (a, b) -> System.out.println("Suma: " + (a + b));
        BiConsumer<Integer, Integer> subtract = (a, b) -> System.out.println("Resta: " + (a - b));
        BiConsumer<Integer, Integer> divide = (a, b) -> {
            if (b != 0) {
                System.out.println("División: " + (a / (double) b));
            } else {
                System.out.println("División: No se puede dividir por cero.");
            }
        };

        sum.accept(-9, 7);
        subtract.accept(-9, 7);
        divide.accept(-9, 7);

        System.out.println();

        System.out.println("----10)Mapa de tipo LinkedHashMap con 5 elementos----");
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        map.put(4, "JavaScript");
        map.put(5, "Kotlin");

        System.out.println();

        System.out.println("----10)Consumer que imprime cada par clave-valor----");
        BiConsumer<Integer, String> printer4 = (key, value) -> System.out.println("Clave: " + key + " - Valor: " + value);
        map.forEach(printer4);

        System.out.println();

        System.out.println("----4)Supplier que inicializa un String y lo imprime----");
        Supplier<String> supplier = () -> "Java es un lenguaje de programación";
        System.out.println(supplier.get());

        System.out.println();

        System.out.println("----5)Supplier que genera un número aleatorio tipo double----");
        Supplier<Double> randomDouble = () -> Math.random();
        System.out.println("Número aleatorio: " + randomDouble.get());

        System.out.println();

        System.out.println("----11) Provee la fecha actual en formato europeo (dd/MM/yyyy)----");
        Supplier<String> currentDate = () -> LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Fecha actual: " + currentDate.get());





        System.out.println("----12----");
    }
}