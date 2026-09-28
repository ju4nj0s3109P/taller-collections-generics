// Ejercicio 1

public class Ejercicio1 {
    public static void main(String[] args) {
        Caja<String> caja1 = new Caja<String>();
        caja1.guardar("Hola mundo");
        System.out.println("Contenido de la caja 1: " + caja1.obtener());

        Caja<Integer> caja2 = new Caja<Integer>();
        caja2.guardar(25);
        System.out.println("Contenido de la caja 2: " + caja2.obtener());

        Caja<Double> caja3 = new Caja<>();
        caja3.guardar(3.1416);
        System.out.println("Contenido de la caja 3: " + caja3.obtener());

        caja1.guardar("otro texto");
        System.out.println("Contenido nuevo de la caja 1: " + caja1.obtener());

        Caja<Boolean> caja4 = new Caja<Boolean>();
        System.out.println("Caja 4 (vacia): " + caja4.obtener());
    }
}

class Caja<T> {
    T contenido;

    public void guardar(T valor) {
        contenido = valor;
        System.out.println("se guardo: " + valor);
    }

    public T obtener() {
        return contenido;
    }
}
