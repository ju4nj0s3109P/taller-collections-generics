package ejercicio06;

import java.util.ArrayList;
import java.util.Comparator;

public class Inventario {

    private ArrayList<Producto> productos;

    /**
     * Constructor de Inventario.
     */
    public Inventario() {
        productos = new ArrayList<>();
    }

    /**
     * Agrega un producto al inventario.
     */
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    /**
     * Elimina un producto del inventario por su código.
     */
    public void eliminarProducto(int codigo) {
        productos.removeIf(producto -> producto.getCodigo() == codigo);
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
     * Lista el inventario en orden alfabético.
     */
    public void listarPorNombre() {
        productos.stream()
                .sorted(Comparator.comparing(Producto::getNombre))
                .forEach(System.out::println);
    }

    /**
     * Lista el inventario en orden de precio.
     */
    public void listarPorPrecio() {
        productos.stream()
                .sorted(Comparator.comparingDouble(Producto::getPrecio))
                .forEach(System.out::println);
    }
}