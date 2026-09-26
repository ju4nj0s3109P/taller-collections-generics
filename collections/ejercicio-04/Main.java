package ejercicio04;

public class Main {

    public static void main(String[] args) {
        ColaTareas cola = new ColaTareas();

        cola.agregar(new Tarea("Revisar correo", 3));
        cola.agregar(new Tarea("Resolver error", 1));
        cola.agregar(new Tarea("Actualizar sistema", 2));

        cola.mostrar();
    }
}
