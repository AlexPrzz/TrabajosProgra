import java.util.*;
import java.util.function.Predicate;

class Ciudad {
    private String nombre;
    private int habitantes;

    public Ciudad(String nombre, int habitantes) {
        this.nombre = nombre;
        this.habitantes = habitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    @Override
    public String toString() {
        return nombre + " - " + habitantes + " habitantes";
    }
}

public class Ejercicio11 {
    public static void main(String[] args) {
        List<Ciudad> ciudades = Arrays.asList(
                new Ciudad("Elche", 230000),
                new Ciudad("Madrid", 3300000),
                new Ciudad("Barcelona", 1600000),
                new Ciudad("Eibar", 27000),
                new Ciudad("Ibiza", 50000),
                new Ciudad("Alicante", 345000),
                new Ciudad("Essen", 580000),
                new Ciudad("Estambul", 15500000),
                new Ciudad("Valencia", 800000),
                new Ciudad("Sevilla", 700000)
        );

        Predicate<Ciudad> filtro = ciudad -> ciudad.getNombre().startsWith("E") && ciudad.getHabitantes() > 100000;

        imprimirCiudades(ciudades, filtro);
    }

    public static void imprimirCiudades(List<Ciudad> lista, Predicate<Ciudad> predicado) {
        lista.stream().filter(predicado).forEach(System.out::println);
    }
}
