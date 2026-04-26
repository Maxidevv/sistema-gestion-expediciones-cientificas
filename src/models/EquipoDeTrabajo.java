package src.models;

import java.util.ArrayList;

/**
 * @author Maxi Moncada, Matias Moyano, Maximo Zalazar
 * @version 2.2
 */

public class EquipoDeTrabajo {
    private String nombreEquipo;
    private ArrayList<Investigador> integrantes;
    private Investigador lider;

    public EquipoDeTrabajo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.integrantes = new ArrayList<>();
        this.lider = null;
    }

    // Añadir investigador
    public void agregarInvestigador(Investigador inv) {
        if (lider == null) {
            lider = inv;//el primero en ser agregado va a ser lider
            integrantes.add(inv);
            System.out.println(inv.getNombre() + " es el líder del equipo.");
        } else {
            // Si el nuevo investigador tiene mismo rango que el líder, se degrada
            if (inv.getRango().equalsIgnoreCase(lider.getRango())) {
                inv.setRango("Sub-" + inv.getRango());
                System.out.println(inv.getNombre() + " fue degradado a " + inv.getRango() + " porque ya existe un líder con ese rango.");
            }
            integrantes.add(inv);
        }
    }

    public void quitarInvestigador(Investigador inv) {
        integrantes.remove(inv);
        if (inv == lider) {
            lider = null;
            System.out.println("El líder fue eliminado. El equipo queda sin líder.");
        }
    }

    public Investigador buscarPorNombre(String nombre) {
        for (Investigador inv : integrantes) {
            if (inv.getNombre().equalsIgnoreCase(nombre)) {
                return inv;
            }
        }
        return null;
    }

    public void mostrarEquipo() {
        System.out.println("Equipo: " + nombreEquipo);
        for (Investigador inv : integrantes) {
            System.out.println("- " + inv.getNombre() + " (" + inv.getRango() + ", " + inv.getEspecialidad() + ")");
        }
        if (lider != null) {
            System.out.println("Líder actual: " + lider.getNombre() + " (" + lider.getRango() + ")");
        } else {
            System.out.println("El equipo no tiene líder.");
        }
    }
}
