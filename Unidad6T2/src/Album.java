import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String nombre;
    private String artista;
    private ArrayList<Cancion> canciones;

    public Album(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
        this.canciones = new ArrayList<>();
    }

    private Cancion findSong(String titulo) {
        for (Cancion cancion : canciones) {
            if (cancion.getTitulo().equals(titulo)) {
                return cancion;
            }
        }
        return null;
    }

    public boolean addSong(String titulo, double duracion) {
        if (findSong(titulo) == null) {
            canciones.add(new Cancion(titulo, duracion));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Cancion> playList) {
        int index = trackNumber - 1;
        if (index >= 0 && index < canciones.size()) {
            playList.add(canciones.get(index));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String titulo, LinkedList<Cancion> playList) {
        Cancion cancion = findSong(titulo);
        if (cancion != null) {
            playList.add(cancion);
            return true;
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public String getArtista() {
        return artista;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }
}
