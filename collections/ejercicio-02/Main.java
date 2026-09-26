package ejercicio02;

public class Main {

    public static void main(String[] args) {
        Pila pila = new Pila();

        System.out.println("Insertar String: " + pila.insertar("Hola"));
        System.out.println("Insertar otro String: " + pila.insertar("Mundo"));
        System.out.println("Insertar Integer: " + pila.insertar(10));

        System.out.println("Cima: " + pila.cima());
        System.out.println("Retirar: " + pila.retirar());
        System.out.println("Cima: " + pila.cima());

        System.out.println("Insertar Integer: " + pila.insertar(20));
    }
}
