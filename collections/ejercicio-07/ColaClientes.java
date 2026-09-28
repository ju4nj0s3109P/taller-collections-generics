package ejercicio07;

import java.util.LinkedList;
import java.util.Queue;

public class ColaClientes {

    private LinkedList<String> clientes;

    /**
     * Constructor de ColaClientes.
     */
    public ColaClientes() {
        clientes = new LinkedList<>();
    }

    /**
     * Agrega un cliente al final de la cola.
     */
    public void agregarCliente(String cliente) {
        clientes.addLast(cliente);
    }

    /**
     * Atiende al primer cliente de la cola.
     */
    public String atenderCliente() {
        if (!clientes.isEmpty()) {
            return clientes.removeFirst();
        }
        return null;
    }

    /**
     * Agrega un cliente urgente al inicio de la cola.
     */
    public void agregarUrgente(String cliente) {
        clientes.addFirst(cliente);
    }

    /**
     * Muestra los clientes en espera.
     */
    public void mostrarCola() {
        for (String cliente : clientes) {
            System.out.println(cliente);
        }
    }
}