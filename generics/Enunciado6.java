// Enunciado 6

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Predicate;

public class Enunciado6 {
    public static void main(String[] args) {
        PilaGenerica<Integer> pila = new PilaGenerica<Integer>();
        for (int i = 1; i <= 10; i++) {
            pila.push(i);
        }
        pila.mostrar();

        Predicate<Integer> esPar = x -> x % 2 == 0;
        ArrayList<Integer> pares = pila.extraerSi(esPar, 3);
        System.out.println("Hasta 3 pares (desde el tope): " + pares);

        System.out.println("La pila despues de extraerSi:");
        pila.mostrar();
        System.out.println("Tamanio: " + pila.tamanio());

        System.out.println("\nHago pop: " + pila.pop());
        System.out.println("Hago pop: " + pila.pop());
        System.out.println("Tope ahora: " + pila.peek());
        pila.mostrar();

        PilaGenerica<String> pila2 = new PilaGenerica<String>();
        pila2.push("sol");
        pila2.push("computador");
        pila2.push("casa");
        pila2.push("estructura");
        pila2.push("datos");
        pila2.push("generico");
        System.out.println();
        pila2.mostrar();

        ArrayList<String> largas = pila2.extraerSi(s -> s.length() > 5, 2);
        System.out.println("Hasta 2 palabras con mas de 5 letras: " + largas);

        ArrayList<String> conZ = pila2.extraerSi(s -> s.contains("z"), 5);
        System.out.println("Palabras con z: " + conZ);
        pila2.mostrar();
    }
}

class PilaGenerica<T> {
    private LinkedList<T> datos = new LinkedList<T>();

    public void push(T elemento) {
        datos.addFirst(elemento);
    }

    public T pop() {
        if (datos.isEmpty()) {
            System.out.println("La pila esta vacia");
            return null;
        }
        return datos.removeFirst();
    }

    public T peek() {
        if (datos.isEmpty()) {
            return null;
        }
        return datos.getFirst();
    }

    public boolean estaVacia() {
        return datos.isEmpty();
    }

    public int tamanio() {
        return datos.size();
    }

    public ArrayList<T> extraerSi(Predicate<T> p, int max) {
        ArrayList<T> lista = new ArrayList<T>();
        Iterator<T> it = datos.iterator();
        int cont = 0;
        while (it.hasNext() && cont < max) {
            T elem = it.next();
            if (p.test(elem) == true) {
                lista.add(elem);
                cont++;
            }
        }
        return lista;
    }

    public void mostrar() {
        System.out.print("Pila (tope -> fondo): ");
        Iterator<T> it = datos.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
