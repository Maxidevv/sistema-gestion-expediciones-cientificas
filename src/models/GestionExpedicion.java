package src.models;

import java.util.ArrayList;

/**
 * @author Maxi Moncada, Matias Moyano, Maximo Zalazar
 * @version 2.0
 * @see Expedicion
 * @see Inventario
 * @see EquipoDeTrabajo
 */

public class GestionExpedicion {
    private ArrayList<Expedicion> expediciones;
    private Inventario inventario;
    private int proximoIdExpedicion;

    public GestionExpedicion() {
        this.expediciones = new ArrayList<>();
        this.inventario = new Inventario();
        this.proximoIdExpedicion = 1;
    }

    // Getters
    public ArrayList<Expedicion> getExpediciones() {
        return expediciones;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public int getProximoIdExpedicion() {
        return proximoIdExpedicion;
    }

    // Métodos de Expedición
    public void crearExpedicion(int cupo, String destino, String estado, String cronograma, String hito) {
        Expedicion nueva = new Expedicion(proximoIdExpedicion, cupo, destino, estado, cronograma, hito);
        expediciones.add(nueva);
        System.out.println("Expedición n" + proximoIdExpedicion + " creada exitosamente.");
        proximoIdExpedicion++;
    }

    public Expedicion obtenerExpedicion(int id) {
        for (Expedicion exp : expediciones) {
            if (exp.getId() == id) {
                return exp;
            }
        }
        return null;
    }

    public void eliminarExpedicion(int id) {
        Expedicion exp = obtenerExpedicion(id);
        if (exp != null) {
            expediciones.remove(exp);
            System.out.println("Expedición n" + id + " eliminada.");
        } else {
            System.out.println("Expedición n" + id + " no encontrada.");
        }
    }

    public int cantidadExpediciones() {
        return expediciones.size();
    }

    // Métodos de Inventario
    public void agregarHerramientaAlInventario(Herramienta herramienta) {
        inventario.agregar(herramienta);
        System.out.println("Herramienta agregada al inventario general.");
    }

    public void mostrarInventarioGeneral() {
        System.out.println("--- Inventario General ---");
        System.out.println("Total de herramientas: " + inventario.cantidadHerramientas());
    }

    // Métodos de administración
    public void agregarEquipoAExpedicion(int idExpedicion, EquipoDeTrabajo equipo) {
        Expedicion exp = obtenerExpedicion(idExpedicion);
        if (exp != null) {
            exp.agregarEquipo(equipo);
        } else {
            System.out.println("Expedición no encontrada.");
        }
    }

    public void mostrarGestion() {
        System.out.println("--- Gestión de Expediciones ---");
        System.out.println("Total de expediciones: " + cantidadExpediciones());
        System.out.println("\nExpediciones:");
        for (Expedicion exp : expediciones) {
            exp.mostrarExpedicion();
            System.out.println("---");
        }
    }

    public boolean iniciarExpedicion(int idExpedicion) {
        Expedicion exp = obtenerExpedicion(idExpedicion);
        if (exp != null) {
            return exp.iniciarExpedicion();
        } else {
            System.out.println("Expedición n" + idExpedicion + " no encontrada.");
            return false;
        }
    }
}
