package model;

public class ServicioTuristico {

    //Atributos
    protected String servicio;
    protected int tiempoServicio;

    //Constructores
    public ServicioTuristico() {
    }

    public ServicioTuristico(String servicio, int tiempoServicio) {
        this.servicio = servicio;
        this.tiempoServicio = tiempoServicio;
    }

    //Getters y Setters
    public String getServicio() {
        return servicio;
    }
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public int getTiempoServicio() {
        return tiempoServicio;
    }
    public void setTiempoServicio(int tiempoServicio) {
        this.tiempoServicio = tiempoServicio;
    }

    //toString
    @Override
    public String toString() {
        return "ServicioTuristico{" +
                "servicio='" + servicio + '\'' +
                ", tiempoServicio=" + tiempoServicio +
                '}';
    }
}
