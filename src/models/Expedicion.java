package src.models;

import java.util.ArrayList;

/**
 * @author Maxi Moncada, Matias Moyano, Maximo Zalazar
 * @version 2.8
 * @see GestionExpedicion
 * @see EquipoDeTrabajo
 * @see Bitacora
 * @see InventarioCritico
 * @see ModuloSeguridad
 */

public class Expedicion {
    private int id;
    private int cupo;
    private String destino;
    private String estado;
    private String cronograma;
    private String hito;
    private ArrayList<EquipoDeTrabajo> equipos;
    private Bitacora bitacora;
    private InventarioCritico inventarioCritico;
    private ModuloSeguridad moduloSeguridad;

    public Expedicion(int id, int cupo, String destino, String estado, String cronograma, String hito) {
        this.id = id;
        this.cupo = cupo;
        this.destino = destino;
        this.estado = estado;
        this.cronograma = cronograma;
        this.hito = hito;
        this.equipos = new ArrayList<>();
        this.bitacora = new Bitacora();
        this.inventarioCritico = new InventarioCritico();
        this.moduloSeguridad = new ModuloSeguridad();
    }

    // Getters
    public int getId() {
        return id;
    }

    public int getCupo() {
        return cupo;
    }

    public String getDestino() {
        return destino;
    }

    public String getEstado() {
        return estado;
    }

    public String getCronograma() {
        return cronograma;
    }

    public String getHito() {
        return hito;
    }

    public ArrayList<EquipoDeTrabajo> getEquipos() {
        return equipos;
    }

    public Bitacora getBitacora() {
        return bitacora;
    }

    public InventarioCritico getInventarioCritico() {
        return inventarioCritico;
    }

    public ModuloSeguridad getModuloSeguridad() {
        return moduloSeguridad;
    }

    // Setters
    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCronograma(String cronograma) {
        this.cronograma = cronograma;
    }

    public void setHito(String hito) {
        this.hito = hito;
    }

    // Métodos
    public void agregarEquipo(EquipoDeTrabajo equipo) {
        if (equipos.size() < cupo && equipo != null) {
            equipos.add(equipo);
            System.out.println("Equipo agregado a la expedición.");
        } else {
            System.out.println("No se puede agregar más equipos. Cupo alcanzado.");
        }
    }

    public void eliminarEquipo(EquipoDeTrabajo equipo) {
        equipos.remove(equipo);
        System.out.println("Equipo eliminado de la expedición.");
    }

    public int cantidadEquipos() {
        return equipos.size();
    }

    public void mostrarExpedicion() {
        System.out.println("Expedición ID: " + id);
        System.out.println("Destino: " + destino);
        System.out.println("Estado: " + estado);
        System.out.println("Cupo: " + cupo + " - Equipos: " + cantidadEquipos());
        System.out.println("Cronograma: " + cronograma);
        System.out.println("Hito: " + hito);
    }

    public boolean iniciarExpedicion() {
        if (!inventarioCritico.tieneGps()) {
            System.out.println("No se puede iniciar la expedición #" + id + ". GPS no disponible en inventario crítico.");
            return false;
        }
        this.estado = "Iniciada";
        System.out.println("Expedición #" + id + " iniciada exitosamente.");
        return true;
    }
}
