// Ejercicio 13

import java.util.ArrayList;
import java.util.List;

public class Ejercicio13 {
    public static void main(String[] args) {
        List<Integer> enteros = new ArrayList<>();
        enteros.add(15);
        enteros.add(3);
        enteros.add(42);
        enteros.add(8);
        enteros.add(-4);

        ServicioNumerico<Integer> servicio = new ServicioNumerico<Integer>();
        System.out.println("Lista de enteros: " + enteros);
        System.out.println("Minimo: " + servicio.minimo(enteros));
        System.out.println("Maximo: " + servicio.maximo(enteros));

        List<Double> decimales = new ArrayList<>();
        decimales.add(2.5);
        decimales.add(9.99);
        decimales.add(0.1);
        decimales.add(7.0);

        ServicioNumerico<Double> servicio2 = new ServicioNumerico<Double>();
        System.out.println("\nLista de doubles: " + decimales);
        System.out.println("Minimo: " + servicio2.minimo(decimales));
        System.out.println("Maximo: " + servicio2.maximo(decimales));

        // prueba con lista vacia
        List<Integer> vacia = new ArrayList<>();
        System.out.println("\nMinimo de lista vacia: " + servicio.minimo(vacia));
    }
}

interface Servicio<T extends Number & Comparable<T>> {
    T minimo(List<T> lista);
    T maximo(List<T> lista);
}

class ServicioNumerico<T extends Number & Comparable<T>> implements Servicio<T> {

    public T minimo(List<T> lista) {
        if (lista.size() == 0) {
            System.out.println("la lista esta vacia");
            return null;
        }
        T menor = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i).compareTo(menor) < 0) {
                menor = lista.get(i);
            }
        }
        return menor;
    }

    public T maximo(List<T> lista) {
        if (lista.size() == 0) {
            System.out.println("la lista esta vacia");
            return null;
        }
        T mayor = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i).compareTo(mayor) > 0) {
                mayor = lista.get(i);
            }
        }
        return mayor;
    }
}
