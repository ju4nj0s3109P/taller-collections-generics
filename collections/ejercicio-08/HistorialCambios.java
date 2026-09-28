package ejercicio08;

import java.util.Vector;

public class HistorialCambios {

    private Vector<String> cambios;

    /**
     * Constructor de HistorialCambios.
     */
    public HistorialCambios() {
        cambios = new Vector<>();
    }

    /**
     * Agrega un cambio al historial.
     */
    public void agregarCambio(String cambio) {
        cambios.add(cambio);
    }

    /**
     * Deshace el último cambio realizado.
     */
    public String deshacer() {
        if (!cambios.isEmpty()) {
            return cambios.remove(cambios.size() - 1);
        }
        return null;
    }

    /**
     * Muestra el historial de cambios.
     */
    public void mostrarHistorial() {
        for (String cambio : cambios) {
            System.out.println(cambio);
        }
    }
}