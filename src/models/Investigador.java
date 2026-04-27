package src.models;

/**
 * @author Maxi Moncada, Matias Moyano, Maximo Zalazar
 * @version 2.3
 */

public class Investigador {
    private String nombre;
    private String rango;
    private String especialidad;

    public Investigador() {
        nombre = "";
        rango = "";
        especialidad = "";
    }

    public Investigador(String nombre, String rango, String especialidad) throws IllegalArgumentException {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre del investigador no puede estar vacío.");
        }
        if (rango == null || rango.isEmpty()) {
            throw new IllegalArgumentException("El rango del investigador no puede estar vacío.");
        }
        if (especialidad == null || especialidad.isEmpty()) {
            throw new IllegalArgumentException("La especialidad del investigador no puede estar vacía.");
        }
        
        this.nombre = nombre;
        this.rango = rango;
        this.especialidad = especialidad;
    }

    // SETTERS
    public void setNombre(String nombre) throws IllegalArgumentException {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public void setRango(String rango) throws IllegalArgumentException {
        if (rango == null || rango.isEmpty()) {
            throw new IllegalArgumentException("El rango no puede estar vacío.");
        }
        this.rango = rango;
    }

    public void setEspecialidad(String especialidad) throws IllegalArgumentException {
        if (especialidad == null || especialidad.isEmpty()) {
            throw new IllegalArgumentException("La especialidad no puede estar vacía.");
        }
        this.especialidad = especialidad;
    }

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getRango() {
        return rango;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}
