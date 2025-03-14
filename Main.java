import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, CuerpoCeleste> sistemaSolar = new HashMap<>();
    private static Set<CuerpoCeleste> planetas = new HashSet<>();

    public static void main(String[] args) {
        CuerpoCeleste mercurio = new Planeta("Mercurio", 88, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put(mercurio.getNombre(), mercurio);
        planetas.add(mercurio);

        CuerpoCeleste venus = new Planeta("Venus", 225, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put(venus.getNombre(), venus);
        planetas.add(venus);

        CuerpoCeleste tierra = new Planeta("Tierra", 365, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put(tierra.getNombre(), tierra);
        planetas.add(tierra);

        CuerpoCeleste marte = new Planeta("Marte", 687, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put(marte.getNombre(), marte);
        planetas.add(marte);

        CuerpoCeleste jupiter = new Planeta("Jupiter", 4332, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put(jupiter.getNombre(), jupiter);
        planetas.add(jupiter);

        CuerpoCeleste saturno = new Planeta("Saturno", 10759, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put(saturno.getNombre(), saturno);
        planetas.add(saturno);

        CuerpoCeleste urano = new Planeta("Urano", 30660, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put(urano.getNombre(), urano);
        planetas.add(urano);

        CuerpoCeleste neptuno = new Planeta("Neptuno", 165, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put(neptuno.getNombre(), neptuno);
        planetas.add(neptuno);

        CuerpoCeleste pluton = new PlanetaEnano("Pluton", 248, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put(pluton.getNombre(), pluton);
        planetas.add(pluton);

        CuerpoCeleste luna = new Luna("Lunaa", 27, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put(luna.getNombre(), luna);
        tierra.addSatelite(luna);

        CuerpoCeleste deimos = new Luna("Deimos", 1.3, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put(deimos.getNombre(), deimos);
        marte.addSatelite(deimos);

        CuerpoCeleste phobos = new Luna("Phobos", 0.3, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put(phobos.getNombre(), phobos);
        marte.addSatelite(phobos);

        CuerpoCeleste io = new Luna("IO", 1.8, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put(io.getNombre(), io);
        jupiter.addSatelite(io);

        CuerpoCeleste europa = new Luna("Europa", 3.5, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put(europa.getNombre(), europa);
        jupiter.addSatelite(europa);

        CuerpoCeleste ganimedes = new Luna("Ganimedes", 7.1, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("Ganimedes", ganimedes);
        jupiter.addSatelite(ganimedes);

        CuerpoCeleste calisto = new Luna("Calisto", 16.7, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put(calisto.getNombre(), calisto);
        jupiter.addSatelite(calisto);

        CuerpoCeleste pluton2 = new PlanetaEnano("Pluton 2", 884, CuerpoCeleste.TipoCuerpoCeleste.PLANETA_ENANO);
        sistemaSolar.put(pluton2.getNombre(), pluton2);
        planetas.add(pluton2);


        for (CuerpoCeleste planeta : planetas) {
            System.out.println(planeta.getNombre());
        }


        System.out.println("===========");
        Set<CuerpoCeleste> lunas = new HashSet<>();
        for (CuerpoCeleste planeta : planetas) {
            lunas.addAll(planeta.getSatelites());
        }
        System.out.println(lunas);

        System.out.println("===========");

        for (CuerpoCeleste martee : marte.getSatelites()){
            System.out.println(martee);
        }


        CuerpoCeleste pluton3 = new Planeta("Pluton", 884, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put(pluton3.getNombre(), pluton3);
        planetas.add(pluton3);

        System.out.println("===========");
        System.out.println("X");
        for (CuerpoCeleste planeta : planetas) {
            System.out.println(planeta);
        }

        CuerpoCeleste pluton4 = new PlanetaEnano("Pluton", 884, CuerpoCeleste.TipoCuerpoCeleste.PLANETA_ENANO);
        sistemaSolar.put(pluton4.getNombre(), pluton4);
        planetas.add(pluton4);

        System.out.println("===========");
        System.out.println("XI");
        for (CuerpoCeleste planeta : planetas) {
            System.out.println(planeta);
        }


        System.out.println("===========");
        System.out.println("XII");
        Set<CuerpoCeleste> diferencia = new HashSet<>(planetas);
        diferencia.removeAll(sistemaSolar.values());

        Set<CuerpoCeleste> interseccion = new HashSet<>(planetas);
        interseccion.retainAll(sistemaSolar.values());

        System.out.println("Diferencia " + diferencia);
        System.out.println("Intersección " + interseccion);



    }


}