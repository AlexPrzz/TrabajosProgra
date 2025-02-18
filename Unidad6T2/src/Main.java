import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();

        Album album1 = new Album("Thriller", "Michael Jackson");
        album1.addSong("Wanna Be Startin' Somethin'", 6.03);
        album1.addSong("Thriller", 5.57);
        album1.addSong("Beat It", 4.18);
        album1.addSong("Billie Jean", 4.54);
        albums.add(album1);

        Album album2 = new Album("The Dark Side of the Moon", "Pink Floyd");
        album2.addSong("Speak to Me", 1.30);
        album2.addSong("Breathe", 2.43);
        album2.addSong("Time", 7.04);
        album2.addSong("Money", 6.22);
        albums.add(album2);

        Album album3 = new Album("Abbey Road", "The Beatles");
        album3.addSong("Come Together", 4.20);
        album3.addSong("Something", 3.03);
        album3.addSong("Here Comes the Sun", 3.06);
        album3.addSong("Golden Slumbers", 1.31);
        albums.add(album3);

        LinkedList<Cancion> playList = new LinkedList<>();
        album1.addToPlayList("Thriller", playList);
        album1.addToPlayList("Billie Jean", playList);
        album2.addToPlayList(3, playList);
        album3.addToPlayList("Come Together", playList);
        album3.addToPlayList(2, playList);

        printPlayList(playList);
        play(playList, albums);
    }

    private static void printPlayList(LinkedList<Cancion> playList) {
        ListIterator<Cancion> iterator = playList.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void play(LinkedList<Cancion> playList, ArrayList<Album> albums) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Cancion> iterator = playList.listIterator();

        if (playList.size() == 0) {
            System.out.println("No hay canciones en la lista.");
            return;
        } else {
            System.out.println("Reproduciendo " + iterator.next().toString());
        }
        try {
            while (!quit) {
                printMenu();
                int action = scanner.nextInt();
                scanner.nextLine();

                switch (action) {
                    case 0:
                        System.out.println("Saliendo de la lista de reproducción.");
                        quit = true;
                        break;
                    case 1:
                        if (!goingForward) {
                            if (iterator.hasNext()) {
                                iterator.next();
                            }
                            goingForward = true;
                        }
                        if (iterator.hasNext()) {
                            System.out.println("Reproduciendo " + iterator.next().toString());
                        } else {
                            System.out.println("Fin de la lista de reproducción.");
                            goingForward = false;
                        }
                        break;
                    case 2:
                        if (goingForward) {
                            if (iterator.hasPrevious()) {
                                iterator.previous();
                            }
                            goingForward = false;
                        }
                        if (iterator.hasPrevious()) {
                            System.out.println("Reproduciendo " + iterator.previous().toString());
                        } else {
                            System.out.println("Estamos al principio de la lista de reproducción.");
                            goingForward = true;
                        }
                        break;
                    case 3:
                        if (goingForward) {
                            if (iterator.hasPrevious()) {
                                System.out.println("Reproduciendo " + iterator.previous().toString());
                                iterator.next();
                            }
                        } else {
                            if (iterator.hasNext()) {
                                System.out.println("Reproduciendo " + iterator.next().toString());
                                iterator.previous();
                            }
                        }
                        break;
                    case 4:
                        printPlayList(playList);
                        break;
                    case 5:
                        printMenu();
                        break;
                    case 6:
                        if (playList.size() > 0) {
                            iterator.remove();
                            if (iterator.hasNext()) {
                                System.out.println("Reproduciendo " + iterator.next().toString());
                            } else if (iterator.hasPrevious()) {
                                System.out.println("Reproduciendo " + iterator.previous().toString());
                            }
                        }
                        break;
                    case 7:
                        printSongsByAlbum(albums);
                        break;
                    case 8:
                        printSpecificAlbum(albums);
                        break;
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Introduce un número para seleccionar una opción del menú");

        }
    }

    private static void printMenu() {
        System.out.println("Opciones del menú:");
        System.out.println("0 – Salir de la lista de reproducción");
        System.out.println("1 – Reproducir siguiente canción en la lista");
        System.out.println("2 – Reproducir la canción previa de la lista");
        System.out.println("3 – Repetir la canción actual");
        System.out.println("4 – Imprimir la lista de canciones en la playlist");
        System.out.println("5 – Volver a imprimir el menú");
        System.out.println("6 – Eliminar canción actual de la playlist");
        System.out.println("7 – Imprimir todos los álbums y sus canciones");
        System.out.println("8 – Imprimir canciones de un álbum específico");
    }

    private static void printSongsByAlbum(ArrayList<Album> albums) {
        for (Album album : albums) {
            System.out.println("Álbum: " + album.getNombre() + " - Artista: " + album.getArtista());
            ArrayList<Cancion> canciones = album.getCanciones();
            for (Cancion cancion : canciones) {
                System.out.println("\t" + cancion.toString());
            }
        }
    }

    private static void printSpecificAlbum(ArrayList<Album> albums) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre del álbum que quieres imprimir:");
        String albumName = scanner.nextLine();

        for (Album album : albums) {
            if (album.getNombre().equalsIgnoreCase(albumName)) {
                System.out.println("Álbum: " + album.getNombre() + " - Artista: " + album.getArtista());
                ArrayList<Cancion> canciones = album.getCanciones();
                for (Cancion cancion : canciones) {
                    System.out.println("\t" + cancion.toString());
                }
                return;
            }
        }
        System.out.println("Álbum no encontrado.");
    }
}
