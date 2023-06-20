import java.util.Date;

public class Capacitacion {
    //día hora lugar duración
    private String rut_cliente;

    private String dia;
    private String hora;
    private String lugar;
    private String duracion;

    private int cant_asistentes;

    public Capacitacion() {

    }

    public Capacitacion(String rut_cliente, String dia, String hora, String lugar, String duracion , int cant_asistentes) {

        this.rut_cliente = rut_cliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cant_asistentes = cant_asistentes;

    }

    public String getRut_cliente() {
        return rut_cliente;
    }

    public void setRut_cliente(String rut_cliente) {
        this.rut_cliente = rut_cliente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getCant_asistentes() {
        return cant_asistentes;
    }

    public void setCant_asistentes(int cant_asistentes) {
        this.cant_asistentes = cant_asistentes;
    }

    @Override
    public String toString() {
        return "Datos de la apacitacion:\n" +
                "rut cliente='" + rut_cliente + '\'' +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", duracion='" + duracion + '\'' +
                ", cant asistentes=" + cant_asistentes ;
    }
}
