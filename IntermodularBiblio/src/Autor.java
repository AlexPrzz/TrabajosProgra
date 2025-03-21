public class Autor {
    private int idAutor;
    private String nacionalidad;
    private String premios;
    private String nombre;
    private String apellido1;
    private String apellido2;

    public Autor(int idAutor, String nacionalidad, String premios, String nombre, String apellido1, String apellido2) {
        if (idAutor <= 0) {
            throw new IllegalArgumentException("El ID del autor no puede ser cero o negativo.");
        }
        this.idAutor = idAutor;
        this.nacionalidad = nacionalidad;
        this.premios = premios;
        if (nombre.isEmpty()) {
            this.nombre = "Anónimo";
        } else {
            this.nombre = nombre;
        }
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    // Getters y Setters
    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        if (idAutor <= 0) {
            throw new IllegalArgumentException("El ID del autor no puede ser cero o negativo.");
        }
        this.idAutor = idAutor;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPremios() {
        return premios;
    }

    public void setPremios(String premios) {
        this.premios = premios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.isEmpty()) {
            this.nombre = "Anónimo";
        } else {
            this.nombre = nombre;
        }
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void mostrarInformacion() {
        System.out.println("  <Autor>");
        System.out.println("    <ID>" + idAutor + "</ID>");
        System.out.println("    <Nacionalidad>" + nacionalidad + "</Nacionalidad>");
        System.out.println("    <Premios>" + premios + "</Premios>");
        System.out.println("    <Nombre>" + nombre + "</Nombre>");
        System.out.println("    <Apellido1>" + apellido1 + "</Apellido1>");
        System.out.println("    <Apellido2>" + apellido2 + "</Apellido2>");
        System.out.println("  </Autor>");
    }
}
