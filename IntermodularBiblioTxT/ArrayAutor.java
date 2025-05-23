import java.util.ArrayList;

public class ArrayAutor {
    private ArrayList<Autor> autores;

    public ArrayAutor() {
        this.autores = new ArrayList<>();

       autores.add(new Autor(1, "Española", "Premio Cervantes", "Miguel", "de Cervantes", "Saavedra"));
       autores.add(new Autor(2, "Británica", "Premio Nobel", "William", "Shakespeare", ""));
       autores.add(new Autor(3, "Rusa", "Premio Pushkin", "Aleksandr", "Púshkin", ""));
    }

    public boolean addNewAutor(Autor autor) {
        if (findAutorById(autor.getIdAutor()) != null) {
            return false;
        }
        autores.add(autor);
        return true;
    }

    public boolean removeAutor(int idAutor) {
        Autor autor = findAutorById(idAutor);
        if (autor != null) {
            autores.remove(autor);
            return true;
        }
        return false;
    }

    public boolean updateAutor(Autor autor) {
        Autor existingAutor = findAutorById(autor.getIdAutor());
        if (existingAutor != null) {
            int index = autores.indexOf(existingAutor);
            autores.set(index, autor);
            return true;
        }
        return false;
    }

    public Autor findAutorById(int idAutor) {
        for (Autor autor : autores) {
            if (autor.getIdAutor() == idAutor) {
                return autor;
            }
        }
        return null;
    }

    public void printAutor() {
        for (Autor autor : autores) {
            autor.mostrarInformacion();
            //System.out.println("-----------");
        }
    }
    public ArrayList<Autor> getAutores() {
        return autores;
    }

}
