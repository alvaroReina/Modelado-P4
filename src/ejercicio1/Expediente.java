package ejercicio1;

import java.util.ArrayList;
import java.util.List;


public class Expediente {

    private List<Acceso> accesos;

    public Expediente() {
        accesos = new ArrayList<>();
    }

    void addAcceso(Acceso a) {
        accesos.add(a);
    }

    void removeAcceso(Acceso a) {
        accesos.remove(a);
    }

    public List<Profesional> getProfesionales() {
        ArrayList<Profesional> resultado = new ArrayList<>();
        for (Acceso a : accesos) {
            resultado.add(a.getProfesional());
        }
        return resultado;
    }
}
