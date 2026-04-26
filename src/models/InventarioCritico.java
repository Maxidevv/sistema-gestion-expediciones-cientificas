package src.models;

import java.util.ArrayList;

/**
 * @author Maxi Moncada, Matias Moyano, Maximo Zalazar
 * @version 2.6
 */

public class InventarioCritico {
    private boolean gps;
    private ArrayList<Herramienta> herramientas;

    public InventarioCritico() {
        this.gps = false;
        this.herramientas = new ArrayList<>();
    }

    // Getter
    public boolean tieneGps() {
        return gps;
    }

    // Setter
    public void setGps(boolean gps) {
        this.gps = gps;
        if (gps) {
            System.out.println("GPS habilitado en el inventario crítico.");
        } else {
            System.out.println("GPS deshabilitado en el inventario crítico.");
        }
    }

    // Método para rastrear ubicación si GPS está habilitado
    public void rastrearUbicacion() {
        if (gps) {
            System.out.println("Rastreando ubicación mediante GPS...");
        } else {
            System.out.println("GPS no disponible. No se puede rastrear.");
        }
    }

    // Métodos de gestión de herramientas
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

    public void mostrarInventarioCritico() {
        System.out.println("=== Inventario Crítico ===");
        System.out.println("Cantidad de herramientas: " + cantidadHerramientas());
        System.out.println("GPS disponible: " + gps);
        obtenerHerramientas().forEach(h -> System.out.println("- " + h));
    }
}
