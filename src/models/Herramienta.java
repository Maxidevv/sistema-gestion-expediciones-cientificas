package src.models;

/**
 * @author Maxi Moncada, Matias Moyano, Maximo Zalazar
 * @version 2.4
 */

public class Herramienta {
    private String nombre;
    private String tipo;
    private String estado;
    private int cantidad;

    public Herramienta() {
        this.nombre = "";
        this.tipo = "";
        this.estado = "disponible";
        this.cantidad = 0;
    }

    public Herramienta(String nombre, String tipo, String estado, int cantidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.estado = estado;
        this.cantidad = cantidad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstado() {
        return estado;
    }

    public int getCantidad() {
        return cantidad;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Métodos
    public void aumentarCantidad(int cantidad) {
        this.cantidad += cantidad;
        System.out.println("Cantidad aumentada a: " + this.cantidad);
    }

    public void disminuirCantidad(int cantidad) {
        if (this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
            System.out.println("Cantidad disminuida a: " + this.cantidad);
        } else {
            System.out.println("Cantidad insuficiente.");
        }
    }

    @Override
    public String toString() {
        return nombre + " (" + tipo + ") - " + cantidad + " unidades - Estado: " + estado;
    }
}
