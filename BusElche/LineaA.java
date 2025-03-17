import java.util.LinkedHashMap;
import java.util.Map;

public class LineaA {
    private Map<String, Integer> tiempos;

    public LineaA() {
        this.tiempos = new LinkedHashMap<>();
        inicializarTramos();
    }

    private void inicializarTramos() {
        tiempos.put("001-002", 75);
        tiempos.put("002-003", 60);
        tiempos.put("003-004", 40);
        tiempos.put("004-005", 50);
        tiempos.put("005-001", 80);
    }

    public Map<String, Integer> getTiempos() {
        return tiempos;
    }

    public int calcularTrayecto(String paradaInicio, String paradaFin) {
        int tiempoTotal = 0;
        boolean encontrado = false;

        for (Map.Entry<String, Integer> tramo : tiempos.entrySet()) {
            String[] paradasTramo = tramo.getKey().split("-");
            if (paradasTramo[0].equals(paradaInicio)) {
                encontrado = true;
            }
            if (encontrado) {
                tiempoTotal += tramo.getValue();
                if (paradasTramo[1].equals(paradaFin)) {
                    return tiempoTotal;
                }
            }
        }

        for (Map.Entry<String, Integer> tramo : tiempos.entrySet()) {
            String[] paradasTramo = tramo.getKey().split("-");
            tiempoTotal += tramo.getValue();
            if (paradasTramo[1].equals(paradaFin)) {
                return tiempoTotal;
            }
        }

        return -1;
    }
}
