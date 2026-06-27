package model;

public class PaseoLacustre extends ServicioTuristico {

    //Atributos
    private String tipoBarco;
    private int cupos;

    //Constructores
    public PaseoLacustre() {
    }

    public PaseoLacustre(String tipoBarco, int cupos) {
        this.tipoBarco = tipoBarco;
        this.cupos = cupos;
    }

    public PaseoLacustre(String servicio, int tiempoServicio, String tipoBarco, int cupos) {
        super(servicio, tiempoServicio);
        this.tipoBarco = tipoBarco;
        this.cupos = cupos;
    }

    //Getters y Setters
    public String getTipoBarco() {
        return tipoBarco;
    }
    public void setTipoBarco(String tipoBarco) {
        this.tipoBarco = tipoBarco;
    }

    public int getCupos() {
        return cupos;
    }
    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    //toString
    @Override
    public String toString() {
        return "PaseoLacustre{" +
                "Nombre Experiencia = '" + servicio + '\'' +
                ", Duracion = " + tiempoServicio + " hrs" +
                ", Tipo De Embarcacion = '" + tipoBarco + '\'' +
                ", Cupos Disponibles = " + cupos +
                '}';
    }
}
