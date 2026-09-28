package ejercicio08;

public class Main {

    public static void main(String[] args) {
        HistorialCambios historial = new HistorialCambios();

        historial.agregarCambio("Escribir título");
        historial.agregarCambio("Agregar imagen");
        historial.agregarCambio("Cambiar color");

        System.out.println("Historial:");
        historial.mostrarHistorial();

        System.out.println("\nCambio deshecho: " + historial.deshacer());

        System.out.println("\nHistorial después de deshacer:");
        historial.mostrarHistorial();
    }
}