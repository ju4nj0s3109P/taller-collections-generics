// Enunciado 1

import java.util.ArrayList;
import java.util.Iterator;

public class Enunciado1 {
    public static void main(String[] args) {
        InventarioCaja<Integer> inventario = new InventarioCaja<Integer>();
        inventario.agregar(10);
        inventario.agregar(35);
        inventario.agregar(5);
        inventario.agregar(50);
        inventario.agregar(20);
        inventario.agregar(42);
        inventario.mostrar();

        ArrayList<Integer> mayores = inventario.mayoresQue(20);
        System.out.println("Elementos mayores que 20: " + mayores);

        InventarioCaja<String> inv2 = new InventarioCaja<String>();
        inv2.agregar("manzana");
        inv2.agregar("banano");
        inv2.agregar("pera");
        inv2.agregar("uva");
        inv2.agregar("aguacate");
        inv2.mostrar();

        ArrayList<String> mayores2 = inv2.mayoresQue("mango");
        System.out.println("Palabras mayores que \"mango\" (orden alfabetico): " + mayores2);
    }
}

class InventarioCaja<T extends Comparable<T>> {
    private ArrayList<T> elementos = new ArrayList<T>();

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public ArrayList<T> mayoresQue(T umbral) {
        ArrayList<T> resultado = new ArrayList<T>();
        Iterator<T> it = elementos.iterator();
        while (it.hasNext()) {
            T actual = it.next();
            if (actual.compareTo(umbral) > 0) {
                resultado.add(actual);
            }
        }
        return resultado;
    }

    public void mostrar() {
        System.out.print("Inventario: ");
        Iterator<T> it = elementos.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
