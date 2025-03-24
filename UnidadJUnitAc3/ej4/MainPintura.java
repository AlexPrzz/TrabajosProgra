package ej4;

import java.text.DecimalFormat;

public class MainPintura {
    public static void main(String[] args) {
        Pintura pintura = new Pintura(250);

        Rectangulo rectangulo = new Rectangulo(20, 35);
        Esfera esfera = new Esfera(15);
        Cilindro cilindro = new Cilindro(10, 30);

        DecimalFormat df = new DecimalFormat("#.###");

        System.out.println("Cantidad de pintura necesaria para pintar el rectángulo: " + df.format(pintura.cantidadNecesaria(rectangulo)));
        System.out.println("Cantidad de pintura necesaria para pintar la esfera: " + df.format(pintura.cantidadNecesaria(esfera)));
        System.out.println("Cantidad de pintura necesaria para pintar el cilindro: " + df.format(pintura.cantidadNecesaria(cilindro)));
    }
}
