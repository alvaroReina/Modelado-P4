package ejercicio1;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Ejercicio1Test {
    Paciente paciente;
    Profesional profesional;
    @Before public void initialize() {
        paciente = new Paciente();
        profesional = new Profesional();
    }

    @After public void delete(){
        paciente = null;
        profesional = null;
    }


    @Test
    public void ExpedienteCreadoPorPacienteEsElEsperado() {
        assertEquals(paciente.getExpedientes().get(0).getPaciente(), paciente);
    }


    @Test
    public void SeAñadeExpedienteAPacienteAlConstruirUnExpediente(){
        Expediente e = new Expediente(paciente);
        assertTrue(paciente.getExpedientes().contains(e));
    }

    @Test(expected = RuntimeException.class)
    public void PacienteAlAñadirExpedienteDebeCoincidirConElAsignado(){
        Paciente p = new Paciente();
        paciente.addExpediente(p.getExpedientes().get(0));

    }
}
