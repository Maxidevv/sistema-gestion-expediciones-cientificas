package src.models;

/**
 * Modulo de seguridad de una expedicion, 
 * 1 a 4 buen tiempo, 5 a 6 precaucion, 7 a 8 alerta, 9 a 10 cancelar mision
 * 
 * @author Maxi Moncada, Matias Moyano, Maximo Zalazar
 * @version 2.9
 */

public class ModuloSeguridad {
    private int estado; // 0 nulo, 1 a 4 buen tiempo, 5 a 6 precaucion, 7 a 8 alerta, 9 a 10 cancelar mision

    public ModuloSeguridad() {
        this.estado = 0;
    }

    public void setModuloSeguridad(int estado) {
        try {
            if (estado == 0) {
                throw new IllegalArgumentException("Estado nulo.");
            } else if (estado >= 1 && estado <= 10) {
                this.estado = estado;
            } else {
                throw new IllegalArgumentException("Estado no parametrado. Use valores entre 1 y 10.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Por favor, revise el modulo de seguridad en caso de estar dañado o revise los datos cargados. " + e.getMessage());
        }
    }

    public int getModuloSeguridad() {
        return this.estado;
    }

    public String obtenerEstadoSeguridad() {
        if (estado >= 1 && estado <= 4) {
            return "Buen tiempo";
        } else if (estado >= 5 && estado <= 6) {
            return "Precaución";
        } else if (estado >= 7 && estado <= 8) {
            return "Alerta";
        } else if (estado >= 9 && estado <= 10) {
            return "Cancelar misión";
        } else {
            return "Desconocido";
        }
    }
}
