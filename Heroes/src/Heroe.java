public abstract class Heroe {
    private String nombre;
    private int nivel;
    private int puntosDeVida;
    private ArmaEspecial armaEspecial;

    public Heroe(String nombre, int nivel, int puntosDeVida, ArmaEspecial armaEspecial) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosDeVida = puntosDeVida;
        this.armaEspecial = armaEspecial;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public ArmaEspecial getArmaEspecial() {
        return armaEspecial;
    }

    public abstract void mostrarHabilidadUnica();

    private String evaluarNivelHeroe() {
        if (nivel == 69) return "NICE";
        if (nivel > 69) return "Maestro";
        if (nivel >= 40) return "Maestro";
        if (nivel >= 20) return "Excepcional";
        if (nivel >= 10) return "Competente";
        if (nivel >= 5) return "En prácticas";
        if (nivel > 0) return "Aprendiz";
        return "Inutil";
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " - " + nombre + " - Nivel: " + nivel + " (" + evaluarNivelHeroe() + ") - Puntos de Vida: " + puntosDeVida + " - Arma: " + armaEspecial;
    }
}
