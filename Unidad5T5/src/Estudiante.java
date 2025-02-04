class Estudiante implements Comparable<Estudiante> {
    String nombre;
    int edad;
    int altura;

    public Estudiante(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    @Override
    public int compareTo(Estudiante otro) {
        if (this.altura != otro.altura) {
            return Integer.compare(otro.altura, this.altura);
        } else {
            return Integer.compare(otro.edad, this.edad);
        }
    }

    @Override
    public String toString() {
        return nombre + " - Altura: " + altura + " - Edad: " + edad;
    }
}
