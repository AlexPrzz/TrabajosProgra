import java.io.*;

public class GestionJugadores {
    public static void main(String[] args) {
        String inputFileName = "C:\\Users\\aleja\\OneDrive\\Escritorio\\Ejercicio Ficheros Ajedrez\\jugadores.txt";
        String outputFileName = "C:\\Users\\aleja\\OneDrive\\Escritorio\\Ejercicio Ficheros Ajedrez\\alojados.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            writer.write("Lista de jugadores alojados en Hotel Melià");
            writer.newLine();
            writer.newLine();
            writer.write("Ranking        Nombre");
            writer.newLine();
            writer.write("---------------------------------------");
            writer.newLine();

            String Cadena;
            boolean firstLine = true;
            while ((Cadena = reader.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }

                String[] campo = Cadena.split(";");
                String lastField = campo[campo.length - 1].trim();
                if (lastField.contains("H")) {
                    String ranking = campo[0];
                    String nombre = campo[2];
                    writer.write(String.format("%5s  -- %s", ranking, nombre));
                    writer.newLine();
                }

                System.out.println(campo[0]+" "+campo[2]);
            }

            System.out.println("Archivo '" + outputFileName + "' creado exitosamente con formato adecuado.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al procesar los archivos: " + e.getMessage());
        }

    }

}