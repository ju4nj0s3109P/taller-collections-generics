package ejercicio01;

public class Main {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        empresa.agregarProducto(new Producto(101, "Teclado", 80000));
        empresa.agregarProducto(new Producto(205, "Mouse", 45000));
        empresa.agregarProducto(new Producto(150, "Monitor", 650000));

        System.out.println("Productos:");
        empresa.mostrarProductos();

        System.out.println("\nProducto buscado:");
        Producto producto = empresa.buscarProducto(150);

        if (producto != null) {
            System.out.println(producto);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}