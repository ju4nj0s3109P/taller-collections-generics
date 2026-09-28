package ejercicio09;

import java.util.Stack;

public class Navegador {

    private Stack<String> historial;

    /**
     * Constructor de Navegador.
     */
    public Navegador() {
        historial = new Stack<>();
    }

    /**
     * Agrega una página al historial.
     */
    public void visitar(String pagina) {
        historial.push(pagina);
    }

    /**
     * Regresa a la página anterior.
     */
    public String volver() {
        if (historial.size() > 1) {
            historial.pop();
            return historial.peek();
        }
        return historial.isEmpty() ? null : historial.peek();
    }

    /**
     * Muestra la página actual.
     */
    public String paginaActual() {
        return historial.isEmpty() ? null : historial.peek();
    }
}