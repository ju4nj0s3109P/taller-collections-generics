package ejercicio06;

public class Main {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        inventario.agregarProducto(new Producto(103, "Teclado", 80000));
        inventario.agregarProducto(new Producto(101, "Monitor", 650000));
        inventario.agregarProducto(new Producto(102, "Mouse", 45000));

        System.out.println("Buscar producto:");
        System.out.println(inventario.buscarProducto(101));

        System.out.println("\nInventario por nombre:");
        inventario.listarPorNombre();

        System.out.println("\nInventario por precio:");
        inventario.listarPorPrecio();

        inventario.eliminarProducto(102);

        System.out.println("\nInventario después de eliminar:");
        inventario.listarPorNombre();
    }
}
