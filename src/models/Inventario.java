package src.models;
import java.util.ArrayList;

/**
 * @author Maxi Moncada
 * @version 1.0
 * @see InventarioCritico
 * @see GestionExpedicion
 */

public class Inventario {
    private ArrayList <herramienta> herramientas;

    public Inventario() {
        this.herramientas = new ArrayList<>();
    }
}
