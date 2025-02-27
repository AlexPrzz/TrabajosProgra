public class Mago extends Heroe {
    private int mana;

    public Mago(String nombre, int nivel, int puntosDeVida, ArmaEspecial armaEspecial, int mana) {
        super(nombre, nivel, puntosDeVida, armaEspecial);
        this.mana = mana;
    }

    @Override
    public void mostrarHabilidadUnica() {
        System.out.println(getNombre() + " hechiza con un hechizo. Mana: " + mana);
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
    }*/
}
