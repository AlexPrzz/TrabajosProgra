package ej4;

public class Pintura {
    private double cobertura;

    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double cantidadNecesaria(Forma forma) {
        return forma.area() / cobertura;
    }
}
