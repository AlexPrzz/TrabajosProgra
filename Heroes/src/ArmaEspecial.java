public class ArmaEspecial {
    private String nombre;
    private int dano;

    public ArmaEspecial(String nombre, int dano) {
        this.nombre = nombre;
        this.dano = dano;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDano() {
        return dano;
    }

    @Override
    public String toString() {
        return nombre + " (Daño: " + dano + ")";
    }
}
