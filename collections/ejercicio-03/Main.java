package ejercicio03;

public class Main {

    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.agregar("Java");
        lista.agregar("Python");
        lista.agregar("Java");
        lista.agregar("C++");

        lista.imprimir();
    }
}