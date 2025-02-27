public class Guerrero extends Heroe {
    private int fuerza;

    public Guerrero(String nombre, int nivel, int puntosDeVida, ArmaEspecial armaEspecial, int fuerza) {
        super(nombre, nivel, puntosDeVida, armaEspecial);
        this.fuerza = fuerza;
    }

    @Override
    public void mostrarHabilidadUnica() {
        System.out.println(getNombre() + " ataca con un golpe fuerte. Fuerza: " + fuerza);
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
    }*/
}
