package ejercicio1;

import java.util.ArrayList;
import java.util.List;


public class Expediente {

    private List<Acceso> accesos;
    private Paciente paciente;


    public Expediente(Paciente p) {
        accesos = new ArrayList<>();
        this.paciente = p;
        p.addExpediente(this);
    }
    void addAcceso(Acceso a) {
        accesos.add(a);
    }

    void removeAcceso(Acceso a) {
        accesos.remove(a);
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public List<Profesional> getProfesionales() {
        ArrayList<Profesional> resultado = new ArrayList<>();
        for (Acceso a : accesos) {
            resultado.add(a.getProfesional());
        }
        return resultado;
    }

}
