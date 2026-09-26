package ejercicio05;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Producto> hashMap = new HashMap<>();
        Map<Integer, Producto> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, Producto> treeMap = new TreeMap<>();

        Producto producto1 = new Producto(103, "Teclado");
        Producto producto2 = new Producto(101, "Mouse");
        Producto producto3 = new Producto(102, "Monitor");

        hashMap.put(producto1.getCodigo(), producto1);
        hashMap.put(producto2.getCodigo(), producto2);
        hashMap.put(producto3.getCodigo(), producto3);

        linkedHashMap.put(producto1.getCodigo(), producto1);
        linkedHashMap.put(producto2.getCodigo(), producto2);
        linkedHashMap.put(producto3.getCodigo(), producto3);

        treeMap.put(producto1.getCodigo(), producto1);
        treeMap.put(producto2.getCodigo(), producto2);
        treeMap.put(producto3.getCodigo(), producto3);

        System.out.println("HashMap:");
        System.out.println(hashMap);

        System.out.println("\nLinkedHashMap:");
        System.out.println(linkedHashMap);

        System.out.println("\nTreeMap:");
        System.out.println(treeMap);

        System.out.println("\nDiferencias:");
        System.out.println("HashMap: no garantiza un orden.");
        System.out.println("LinkedHashMap: mantiene el orden de inserción.");
        System.out.println("TreeMap: mantiene las claves ordenadas.");
    }
}
