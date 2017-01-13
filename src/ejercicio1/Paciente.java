package ejercicio1;


import java.util.ArrayList;
import java.util.List;

public class Paciente {

    private List<Expediente> expedientes;
    private Expediente expedienteAbierto;

    public Paciente() {
        expedientes = new ArrayList<>();
        expedienteAbierto = null;
        new Expediente(this);
    }

    public List<Expediente> getExpedientes() {
        return expedientes;
    }

    public void addExpediente(Expediente e) {
        if (!e.getPaciente().equals(this)){
            throw new RuntimeException("Se ha intentado añadir un expediente asignado a otro paciente");
        }
        expedientes.add(e);

    }

    public Expediente getExpedienteAbierto() {
        return expedienteAbierto;
    }

    public void setExpedienteAbierto(Expediente expedienteAbierto) {
        this.expedienteAbierto = expedienteAbierto;
    }
}
