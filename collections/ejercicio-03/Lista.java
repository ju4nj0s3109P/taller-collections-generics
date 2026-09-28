package ejercicio03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lista {

    private Set<String> elementos;

    /**
     * Constructor de Lista.
     */
    public Lista() {
        elementos = new HashSet<>();
    }

    /**
     * Agrega un elemento sin permitir duplicados.
     */
    public void agregar(String elemento) {
        elementos.add(elemento);
    }

    /**
     * Imprime los elementos usando un iterador.
     */
    public void imprimir() {
        Iterator<String> iterador = elementos.iterator();

        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}