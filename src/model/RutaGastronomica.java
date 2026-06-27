package model;

public class RutaGastronomica extends ServicioTuristico {

    //Atributos
    private int cantidadLugares;
    private String talleres;

    //Constructores
    public RutaGastronomica() {
    }

    public RutaGastronomica(int cantidadLugares, String talleres) {
        this.cantidadLugares = cantidadLugares;
        this.talleres = talleres;
    }

    public RutaGastronomica(String servicio, int tiempoServicio, int cantidadLugares, String talleres) {
        super(servicio, tiempoServicio);
        this.cantidadLugares = cantidadLugares;
        this.talleres = talleres;
    }

    //Getters y Setters
    public int getCantidadLugares() {
        return cantidadLugares;
    }
    public void setCantidadLugares(int cantidadLugares) {
        this.cantidadLugares = cantidadLugares;
    }

    public String getTalleres() {
        return talleres;
    }
    public void setTalleres(String talleres) {
        this.talleres = talleres;
    }

    //toString
    @Override
    public String toString() {
        return "Ruta Gatronomica {" +
                "Nombre Experiencia = '" + servicio + '\'' +
                ", Duracion = " + tiempoServicio + " hrs" +
                ", Cantidad De Lugares = " + cantidadLugares + '\'' +
                ", Talleres = '" + talleres +
                '}';
    }

}
