package ejercicio07;

public class Main {

    public static void main(String[] args) {
        ColaClientes cola = new ColaClientes();

        cola.agregarCliente("Juan");
        cola.agregarCliente("Maria");
        cola.agregarCliente("Carlos");

        System.out.println("Cola de espera:");
        cola.mostrarCola();

        cola.agregarUrgente("Ana");

        System.out.println("\nDespués de agregar un cliente urgente:");
        cola.mostrarCola();

        System.out.println("\nCliente atendido: " + cola.atenderCliente());

        System.out.println("\nCola después de atender:");
        cola.mostrarCola();
    }
}