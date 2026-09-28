// Ejercicio 14

import java.util.ArrayList;
import java.util.List;

public class Ejercicio14 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(34);
        numeros.add(7);
        numeros.add(23);
        numeros.add(32);
        numeros.add(5);
        numeros.add(62);

        Ordenador<Integer> ord = new Ordenador<Integer>();
        System.out.println("Antes: " + numeros);
        ord.ordenar(numeros);
        System.out.println("Despues: " + numeros);

        List<String> nombres = new ArrayList<String>();
        nombres.add("Pedro");
        nombres.add("Ana");
        nombres.add("Zoe");
        nombres.add("Carlos");
        nombres.add("Maria");

        Ordenador<String> ord2 = new Ordenador<String>();
        System.out.println("\nAntes: " + nombres);
        ord2.ordenar(nombres);
        System.out.println("Despues: " + nombres);

        List<Double> notas = new ArrayList<>();
        notas.add(4.5);
        notas.add(3.2);
        notas.add(5.0);
        notas.add(2.8);

        Ordenador<Double> ord3 = new Ordenador<>();
        System.out.println("\nAntes: " + notas);
        ord3.ordenar(notas);
        System.out.println("Despues: " + notas);
    }
}

class Ordenador<T extends Comparable<T>> {

    public void ordenar(List<T> lista) {
        int n = lista.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (lista.get(j).compareTo(lista.get(j + 1)) > 0) {
                    T aux = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, aux);
                }
            }
        }
    }
}
