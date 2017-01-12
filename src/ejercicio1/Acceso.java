package ejercicio1;

import java.util.Date;

public class Acceso {

    private Date fecha;
    private TipoAcceso tipo;
    private Profesional profesional;
    private Expediente expediente;

    public Acceso(Date fecha, TipoAcceso tipo, Profesional profesional, Expediente expediente) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.profesional = profesional;
        this.expediente = expediente;
        profesional.addAcceso(this);
        expediente.addAcceso(this);
    }

    public void remove(){
        getProfesional().removeAcceso(this);
        getExpediente().removeAcceso(this);
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public TipoAcceso getTipo() {
        return tipo;
    }

    public void setTipo(TipoAcceso tipo) {
        this.tipo = tipo;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional accesor) {
        this.profesional = accesor;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }


}
