public class Asesino extends Heroe {
    private int sigilo;

    public Asesino(String nombre, int nivel, int puntosDeVida, ArmaEspecial armaEspecial, int sigilo) {
        super(nombre, nivel, puntosDeVida, armaEspecial);
        this.sigilo = sigilo;
    }

    @Override
    public void mostrarHabilidadUnica() {
        System.out.println(getNombre() + " asesina en las sombras. Sigilo: " + sigilo);
    }

    /*private String evaluarNivel(int valor) {
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
