package ejercicio01;

import java.util.TreeSet;

public class Empresa {

    private TreeSet<Producto> productos;

    /**
     * Constructor de Empresa.
     */
    public Empresa() {
        productos = new TreeSet<>((producto1, producto2) ->
                Integer.compare(producto1.getCodigo(), producto2.getCodigo()));
    }

    /**
     * Agrega un producto al TreeSet.
     */
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    /**
     * Busca un producto por su código.
     */
    public Producto buscarProducto(int codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo) {
                return producto;
            }
        }
        return null;
    }

    /**
     * Muestra los productos del TreeSet.
     */
    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}