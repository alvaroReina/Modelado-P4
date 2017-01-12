package ejercicio1;


import java.util.ArrayList;
import java.util.List;

public class Profesional {
    private List<Acceso> accesos;

    public Profesional() {
        accesos = new ArrayList<>();
    }

    void addAcceso(Acceso a) {
        accesos.add(a);
    }

    void removeAcceso(Acceso a) {
        accesos.remove(a);
    }

    public List<Expediente> getExpedientes() {
        ArrayList<Expediente> resultado = new ArrayList<>();
        for (Acceso a : accesos) {
            resultado.add(a.getExpediente());
        }
        return resultado;
    }
}
