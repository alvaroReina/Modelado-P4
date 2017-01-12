package ejercicio1;


import java.util.ArrayList;
import java.util.List;

public class Paciente {

    private List<Expediente> expedientes;
    private Expediente expedienteAbierto;

    public Paciente(Expediente e){
        expedientes = new ArrayList<>();
        expedientes.add(e);
        expedienteAbierto = null;
    }

    public List<Expediente> getExpedientes() {
        return expedientes;
    }

    public void addExpediente(Expediente e) {
        expedientes.add(e);
    }

    public void removeExpediente(Expediente e){
        expedientes.remove(e)
    }

    public Expediente getExpedienteAbierto() {
        return expedienteAbierto;
    }

    public void setExpedienteAbierto(Expediente expedienteAbierto) {
        this.expedienteAbierto = expedienteAbierto;
    }
}
