package src.models;

/**
 * @author Maxi Moncada, Matias Moyano, Maximo Zalazar
 * @version 2.5
 * @see Expedicion
 */

public class ControlRequisito {
    private boolean equipoCompleto;
    private boolean inventarioDisponible;
    private boolean cronogramaValido;
    private boolean seguridadAprobada;

    public ControlRequisito() {
        this.equipoCompleto = false;
        this.inventarioDisponible = false;
        this.cronogramaValido = false;
        this.seguridadAprobada = false;
    }

    // Getters
    public boolean esEquipoCompleto() {
        return equipoCompleto;
    }

    public boolean esInventarioDisponible() {
        return inventarioDisponible;
    }

    public boolean esCronogramaValido() {
        return cronogramaValido;
    }

    public boolean esSeguridadAprobada() {
        return seguridadAprobada;
    }

    // Setters
    public void setEquipoCompleto(boolean equipoCompleto) {
        this.equipoCompleto = equipoCompleto;
    }

    public void setInventarioDisponible(boolean inventarioDisponible) {
        this.inventarioDisponible = inventarioDisponible;
    }

    public void setCronogramaValido(boolean cronogramaValido) {
        this.cronogramaValido = cronogramaValido;
    }

    public void setSeguridadAprobada(boolean seguridadAprobada) {
        this.seguridadAprobada = seguridadAprobada;
    }

    // Métodos de validación
    public boolean verificarRequisitosExpedicion(Expedicion expedicion) {
        if (expedicion == null) {
            System.out.println("Error: Expedición nula.");
            return false;
        }

        // Verificar equipo
        if (expedicion.cantidadEquipos() == 0) {
            System.out.println("Requisito no cumplido: Sin equipos de trabajo.");
            equipoCompleto = false;
        } else {
            equipoCompleto = true;
        }

        // Verificar inventario
        if (expedicion.getInventarioCritico().cantidadHerramientas() == 0) {
            System.out.println("Requisito no cumplido: Inventario vacío.");
            inventarioDisponible = false;
        } else {
            inventarioDisponible = true;
        }

        // Verificar cronograma
        if (expedicion.getCronograma() != null && !expedicion.getCronograma().isEmpty()) {
            cronogramaValido = true;
        } else {
            System.out.println("Requisito no cumplido: Cronograma no definido.");
            cronogramaValido = false;
        }

        // Verificar seguridad
        if (expedicion.getModuloSeguridad() != null) {
            seguridadAprobada = true;
        } else {
            System.out.println("Requisito no cumplido: Módulo de seguridad no configurado.");
            seguridadAprobada = false;
        }

        return equipoCompleto && inventarioDisponible && cronogramaValido && seguridadAprobada;
    }

    public void mostrarRequisitos() {
        System.out.println("=== Control de Requisitos ===");
        
        if (equipoCompleto) {
            System.out.println("Equipo completo: Cumplido");
        } else {
            System.out.println("Equipo completo: No cumplido");
        }
        
        if (inventarioDisponible) {
            System.out.println("Inventario disponible: Cumplido");
        } else {
            System.out.println("Inventario disponible: No cumplido");
        }
        
        if (cronogramaValido) {
            System.out.println("Cronograma válido: Cumplido");
        } else {
            System.out.println("Cronograma válido: No cumplido");
        }
        
        if (seguridadAprobada) {
            System.out.println("Seguridad aprobada: Cumplido");
        } else {
            System.out.println("Seguridad aprobada: No cumplido");
        }
    }
}
