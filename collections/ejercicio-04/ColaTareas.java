package ejercicio04;

import java.util.PriorityQueue;
import java.util.Queue;

public class ColaTareas {

    private Queue<Tarea> tareas;

    /**
     * Constructor de ColaTareas.
     */
    public ColaTareas() {
        tareas = new PriorityQueue<>();
    }

    /**
     * Agrega una tarea a la cola.
     */
    public void agregar(Tarea tarea) {
        tareas.offer(tarea);
    }

    /**
     * Retira la tarea con mayor prioridad.
     */
    public Tarea atender() {
        return tareas.poll();
    }

    /**
     * Muestra las tareas en orden de prioridad.
     */
    public void mostrar() {
        while (!tareas.isEmpty()) {
            System.out.println(tareas.poll());
        }
    }
}
