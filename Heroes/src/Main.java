import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static ArrayList<Heroe> heroes = new ArrayList<>();
    private static ArrayList<ArmaEspecial> arsenal = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;

        arsenal.add(new ArmaEspecial("Hacha", 70));
        arsenal.add(new ArmaEspecial("Arco", 40));
        arsenal.add(new ArmaEspecial("Bastón", 50));
        arsenal.add(new ArmaEspecial("Daga", 30));

        while (!salir) {
            imprimirMenu();
            int opcion = -1;

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, introduce un número.");
                scanner.next();
            }

            switch (opcion) {
                case 1:
                    anadirHeroe();
                    break;
                case 2:
                    anadirArma();
                    break;
                case 3:
                    eliminarHeroe();
                    break;
                case 4:
                    buscarHeroe();
                    break;
                case 5:
                    listarHeroes();
                    break;
                case 6:
                    verYModificarArsenal();
                    break;
                case 7:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    if (opcion != -1) {
                        System.out.println("Opción no válida.");
                    }
            }
        }
    }

    private static void imprimirMenu() {
        System.out.println("Bienvenido a Héroes 1J");
        System.out.println("1. Añadir Héroe");
        System.out.println("2. Añadir Arma");
        System.out.println("3. Eliminar Héroe");
        System.out.println("4. Buscar Héroe");
        System.out.println("5. Listar Héroes");
        System.out.println("6. Ver y Modificar Arsenal");
        System.out.println("7. Salir");
        System.out.print("Elige una opción: ");
    }

    private static void anadirHeroe() {
        System.out.println("¿Qué tipo de héroe deseas añadir?");
        System.out.println("1: Guerrero/a");
        System.out.println("2: Mago/a");
        System.out.println("3: Arquero/a");
        System.out.println("4: Asesino/a");
        System.out.print("Elige una opción: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nombre del héroe: ");
        String nombre = scanner.nextLine();

        for (Heroe heroe : heroes) {
            if (heroe.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("El nombre del héroe ya existe. Por favor, elige otro nombre.");
                return;
            }
        }

        System.out.print("Nivel: ");
        int nivel = scanner.nextInt();
        System.out.print("Puntos de Vida: ");
        int puntosDeVida = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Elige un arma para " + nombre + ":");
        for (int i = 0; i < arsenal.size(); i++) {
            System.out.println((i + 1) + ". " + arsenal.get(i).toString());
        }

        int armaOpcion = -1;
        while (armaOpcion < 1 || armaOpcion > arsenal.size()) {
            try {
                System.out.print("Elige una opción: ");
                armaOpcion = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, introduce un número.");
                scanner.next();
            }
        }

        ArmaEspecial armaEspecial = arsenal.get(armaOpcion - 1);

        switch (tipo) {
            case 1:
                System.out.print("Fuerza: ");
                int fuerza = scanner.nextInt();
                heroes.add(new Guerrero(nombre, nivel, puntosDeVida, armaEspecial, fuerza));
                break;
            case 2:
                System.out.print("Mana: ");
                int mana = scanner.nextInt();
                heroes.add(new Mago(nombre, nivel, puntosDeVida, armaEspecial, mana));
                break;
            case 3:
                System.out.print("Precisión: ");
                int precision = scanner.nextInt();
                heroes.add(new Arquero(nombre, nivel, puntosDeVida, armaEspecial, precision));
                break;
            case 4:
                System.out.print("Sigilo: ");
                int sigilo = scanner.nextInt();
                heroes.add(new Asesino(nombre, nivel, puntosDeVida, armaEspecial, sigilo));
                break;
            default:
                System.out.println("Tipo de héroe no válido.");
        }
        System.out.println(nombre + " ha sido añadido al gremio con su " + armaEspecial.getNombre() + "!");
    }

    private static void anadirArma() {
        System.out.print("Nombre del arma: ");
        String nombre = scanner.nextLine();
        System.out.print("Daño que infringe: ");
        int dano = scanner.nextInt();
        scanner.nextLine();

        arsenal.add(new ArmaEspecial(nombre, dano));
        System.out.println("Arma " + nombre + " ha sido añadida al arsenal.");
    }

    private static void eliminarHeroe() {
        System.out.print("Nombre del héroe a eliminar: ");
        String nombre = scanner.nextLine();

        for (int i = 0; i < heroes.size(); i++) {
            if (heroes.get(i).getNombre().equalsIgnoreCase(nombre)) {
                heroes.remove(i);
                System.out.println(nombre + " ha sido eliminado del gremio.");
                return;
            }
        }
        System.out.println("Héroe no encontrado.");
    }

    private static void buscarHeroe() {
        System.out.print("Nombre del héroe a buscar: ");
        String nombre = scanner.nextLine();
        for (Heroe heroe : heroes) {
            if (heroe.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(heroe);
                return;
            }
        }
        System.out.println("Héroe no encontrado.");
    }

    private static void listarHeroes() {
        if (heroes.isEmpty()) {
            System.out.println("No hay héroes en el gremio.");
        } else {
            for (Heroe heroe : heroes) {
                System.out.println(heroe);
            }
        }
    }

    private static void verYModificarArsenal() {
        System.out.println("Arsenal:");
        for (int i = 0; i < arsenal.size(); i++) {
            System.out.println((i + 1) + ". " + arsenal.get(i).toString());
        }

        System.out.println("1. Modificar arma");
        System.out.println("2. Eliminar arma");
        System.out.println("3. Volver al menú principal");
        System.out.print("Elige una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                modificarArma();
                break;
            case 2:
                eliminarArma();
                break;
            case 3:
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private static void modificarArma() {
        System.out.print("Elige el número del arma a modificar: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index >= 0 && index < arsenal.size()) {
            System.out.print("Nuevo nombre del arma: ");
            String nombre = scanner.nextLine();
            System.out.print("Nuevo daño que infringe: ");
            int dano = scanner.nextInt();
            scanner.nextLine();

            ArmaEspecial arma = arsenal.get(index);
            arma = new ArmaEspecial(nombre, dano);
            arsenal.set(index, arma);

            System.out.println("El arma ha sido modificada.");
        } else {
            System.out.println("Número de arma no válido.");
        }
    }

    private static void eliminarArma() {
        System.out.print("Elige el número del arma a eliminar: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index >= 0 && index < arsenal.size()) {
            ArmaEspecial arma = arsenal.remove(index);
            System.out.println("El arma " + arma.getNombre() + " ha sido eliminada.");
        } else {
            System.out.println("Número de arma no válido.");
        }
    }
}
