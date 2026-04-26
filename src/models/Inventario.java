package src.models;
import java.util.ArrayList;

/**
 * @author Maxi Moncada, Matias Moyano, Maximo Zalazar
 * @version 2.2
 * @see InventarioCritico
 * @see GestionExpedicion
 */

public class Inventario {
    private ArrayList<Herramienta> herramientas;

    public Inventario() {
        this.herramientas = new ArrayList<>();
    }

    public void agregar(Herramienta herramienta) {
        if (herramienta != null) {
            this.herramientas.add(herramienta);
        }
    }

    public void eliminar(Herramienta herramienta) {
        this.herramientas.remove(herramienta);
    }

    public ArrayList<Herramienta> obtenerHerramientas() {
        return this.herramientas;
    }

    public int cantidadHerramientas() {
        return this.herramientas.size();
    }

    public boolean contiene(Herramienta herramienta) {
        return this.herramientas.contains(herramienta);
    }
}
