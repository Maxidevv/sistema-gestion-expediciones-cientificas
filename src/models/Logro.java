package src.models;

/**
 * @author Maxi Moncada, Matias Moyano, Maximo Zalazar
 * @version 2.1
 */

public class Logro {
    private String descripcion;
    private String fecha;
    private String tipo;

    public Logro() {
        this.descripcion = "";
        this.fecha = "";
        this.tipo = "";
    }

    public Logro(String descripcion, String fecha, String tipo) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.tipo = tipo;
    }

    // Getters
    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTipo() {
        return tipo;
    }

    // Setters
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Métodos
    public void mostrarLogro() {
        System.out.println("Logro [" + tipo + "] - Fecha: " + fecha);
        System.out.println("Descripción: " + descripcion);
    }
}
