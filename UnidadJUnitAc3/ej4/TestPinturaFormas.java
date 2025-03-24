package ej4;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

public class TestPinturaFormas {

    @Test
    public void testToString() {
        Forma rectangulo = new Rectangulo(20, 35);
        Forma esfera = new Esfera(15);
        Forma cilindro = new Cilindro(10, 30);

        assertEquals("Rectángulo", rectangulo.toString(), "Rectángulo falló en toString()");
        assertEquals("Esfera", esfera.toString(), "Esfera falló en toString()");
        assertEquals("Cilindro", cilindro.toString(), "Cilindro falló en toString()");
    }

    @Test
    public void testDevolverArea() {
        Forma rectangulo = new Rectangulo(20, 35);
        Forma esfera = new Esfera(15);
        Forma cilindro = new Cilindro(10, 30);

        DecimalFormat df = new DecimalFormat("#.###");

        assertEquals(df.format(700), df.format(rectangulo.area()), "Rectángulo falló en devolverArea()");
        assertEquals(df.format(4 * Math.PI * Math.pow(15, 2)), df.format(esfera.area()), "Esfera falló en devolverArea()");
        assertEquals(df.format(2 * Math.PI * 10 * (10 + 30)), df.format(cilindro.area()), "Cilindro falló en devolverArea()");
    }

    @Test
    public void testCalcularPintura() {
        Pintura pintura = new Pintura(250);

        Forma rectangulo = new Rectangulo(20, 35);
        Forma esfera = new Esfera(15);
        Forma cilindro = new Cilindro(10, 30);

        DecimalFormat df = new DecimalFormat("#.###");

        assertEquals(df.format(2.8), df.format(pintura.cantidadNecesaria(rectangulo)), "Rectángulo falló en calcularPintura()");
        assertEquals(df.format(11.31), df.format(pintura.cantidadNecesaria(esfera)), "Esfera falló en calcularPintura()");
        assertEquals(df.format(10.053), df.format(pintura.cantidadNecesaria(cilindro)), "Cilindro falló en calcularPintura()");
    }
}
