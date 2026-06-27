package model;

public class ExcursionCultural extends ServicioTuristico {

    //Atributos
    private String nombreLugar;
    private int antiguedad;

    //Constructores
    public ExcursionCultural() {
    }

    public ExcursionCultural(String nombreLugar, int antiguedad) {
        this.nombreLugar = nombreLugar;
        this.antiguedad = antiguedad;
    }

    public ExcursionCultural(String servicio, int tiempoServicio, String nombreLugar, int antiguedad) {
        super(servicio, tiempoServicio);
        this.nombreLugar = nombreLugar;
        this.antiguedad = antiguedad;
    }

    //Getters y Setters
    public String getNombreLugar() {
        return nombreLugar;
    }
    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }

    public int getAntiguedad() {
        return antiguedad;
    }
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    //toString
    @Override
    public String toString() {
        return "Excursion Cultural {" +
                "Nombre Experiencia = '" + servicio + '\'' +
                ", Duracion = " + tiempoServicio + " hrs" +
                ", Nombre Del Lugar = '" + nombreLugar + '\'' +
                ", Fundado En = " + antiguedad +
                '}';
    }
}
