public class Arquero extends Heroe {
    private int precision;

    public Arquero(String nombre, int nivel, int puntosDeVida, ArmaEspecial armaEspecial, int precision) {
        super(nombre, nivel, puntosDeVida, armaEspecial);
        this.precision = precision;
    }

    @Override
    public void mostrarHabilidadUnica() {
        System.out.println(getNombre() + " dispara con su arco. Precisión: " + precision);
    }

   /* private String evaluarNivel(int valor) {
        if (valor == 69) return "NICE";
        if (valor > 69) return "Maestro";
        if (valor >= 40) return "Maestro";
        if (valor >= 20) return "Excepcional";
        if (valor >= 10) return "Competente";
        if (valor >= 5) return "En prácticas";
        if (valor > 0) return "Aprendiz";
        return "Inutil";
    } */
}
