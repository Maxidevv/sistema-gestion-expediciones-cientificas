package src.models;

import java.util.ArrayList;

/**
 * @author Maxi Moncada, Matias Moyano, Maximo Zalazar
 * @version 2.2
 * @see Logro
 */

public class Bitacora {
    private String archivo;
    private ArrayList<Logro> logros;

    public Bitacora() {
        this.archivo = "bitacora.txt";
        this.logros = new ArrayList<>();
    }

    // Getters
    public String getArchivo() {
        return archivo;
    }

    public ArrayList<Logro> getLogros() {
        return logros;
    }

    // Setters
    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    // Métodos
    public void registrarLogro(Logro logro) {
        if (logro != null) {
            logros.add(logro);
            System.out.println("Logro registrado en la bitácora.");
        }
    }

    public void eliminarLogro(Logro logro) {
        logros.remove(logro);
        System.out.println("Logro eliminado de la bitácora.");
    }

    public int cantidadLogros() {
        return logros.size();
    }

    public void mostrarBitacora() {
        System.out.println("Bitácora: " + archivo);
        System.out.println("Total de logros: " + cantidadLogros());
        for (Logro logro : logros) {
            logro.mostrarLogro();
        }
    }
}
