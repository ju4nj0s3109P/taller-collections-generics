package ejercicio02;

import java.util.Stack;

public class Pila {

    private Stack<Object> elementos;

    /**
     * Constructor de Pila.
     */
    public Pila() {
        elementos = new Stack<>();
    }

    /**
     * Inserta un elemento si coincide con el tipo de la cima.
     */
    public boolean insertar(Object elemento) {
        if (elementos.isEmpty() || elementos.peek().getClass() == elemento.getClass()) {
            elementos.push(elemento);
            return true;
        }
        return false;
    }

    /**
     * Retira el elemento de la cima.
     */
    public Object retirar() {
        if (!elementos.isEmpty()) {
            return elementos.pop();
        }
        return null;
    }

    /**
     * Muestra el elemento de la cima.
     */
    public Object cima() {
        if (!elementos.isEmpty()) {
            return elementos.peek();
        }
        return null;
    }
}
