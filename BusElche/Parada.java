public class Parada {
    private String numero;
    private String nombre;
    private String direccion;

    public Parada(String numero, String nombre, String direccion) {
        this.numero = numero;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero + " - " + nombre + " - " + direccion;
    }
}
