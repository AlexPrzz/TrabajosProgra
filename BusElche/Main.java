import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LineaA lineaA = new LineaA();

        Parada[] paradas = {
                new Parada("001", "Centre-Doctor Caro", "C / Doctor Caro"),
                new Parada("002", "Vicente Blasco Ibáñez, 22", "C / Vicente Blasco Ibáñez, 22"),
                new Parada("003", "Vicente Blasco Ibáñez, 80", "C / Vicente Blasco Ibáñez, 80"),
                new Parada("004", "Inem Carrús", "Plaza Carrús"),
                new Parada("005", "Pedro Moreno Sastre, 62", "C / Pedro Moreno Sastre, 62")
        };

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Usar el programa");
            System.out.println("2. Salir");
            System.out.print("Selecciona una opción: ");
            String opcion = scanner.nextLine().trim();

            switch (opcion) {
                case "1":
                    ejecutarPrograma(scanner, lineaA, paradas);
                    break;
                case "2":
                    continuar = false;
                    System.out.println("¡Gracias por usar el programa! Hasta la próxima.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona 1 o 2.");
                    break;
            }
        }

        scanner.close();
    }

    private static void ejecutarPrograma(Scanner scanner, LineaA lineaA, Parada[] paradas) {
        System.out.println("\n¡Bienvenido al programa de BusElche!");
        System.out.println("Este programa calcula el tiempo de trayecto en la línea A.");

        System.out.println("\nAquí tienes la lista de paradas disponibles:");
        for (Parada parada : paradas) {
            System.out.println(parada);
        }

        String paradaInicial = null;
        while (true) {
            System.out.print("\nElige la parada inicial (introduce el número): ");
            paradaInicial = scanner.nextLine().trim().toUpperCase();

            if (!esParadaValida(paradas, paradaInicial)) {
                System.out.println("Error: La parada no existe. Por favor, selecciona una parada válida.");
            } else {
                break;
            }
        }

        String paradaFinal = null;
        while (true) {
            System.out.print("Elige la parada final (introduce el número): ");
            paradaFinal = scanner.nextLine().trim().toUpperCase();

            if (!esParadaValida(paradas, paradaFinal)) {
                System.out.println("Error: La parada no existe. Por favor, selecciona una parada válida.");
            } else if (paradaFinal.equals(paradaInicial)) {
                System.out.println("El trayecto recorrerá todas las paradas hasta regresar a la inicial.");
                break;
            } else {
                break;
            }
        }

        int tiempo = lineaA.calcularTrayecto(paradaInicial, paradaFinal);
        if (tiempo != -1) {
            System.out.println("\nEl tiempo estimado para el trayecto entre " + paradaInicial + " y " + paradaFinal + " es de " +
                    tiempo + " segundos (" + (tiempo / 60) + " minutos y " + (tiempo % 60) + " segundos).");
        } else {
            System.out.println("No se encontró un trayecto válido entre las paradas seleccionadas.");
        }

        while (true) {
            System.out.print("\n¿Deseas realizar otro cálculo? (S/N): ");
            String continuar = scanner.nextLine().trim().toUpperCase();

            if (continuar.equals("S")) {
                return; 
            } else if (continuar.equals("N")) {
                System.out.println("¡Gracias por usar el programa! Hasta la próxima.");
                System.exit(0); 
            } else {
                System.out.println("Opción no válida. Por favor, introduce 'S' o 'N'.");
            }
        }
    }

    private static boolean esParadaValida(Parada[] paradas, String paradaIngresada) {
        for (Parada parada : paradas) {
            if (parada.getNumero().equals(paradaIngresada)) {
                return true;
            }
        }
        return false;
    }
}
