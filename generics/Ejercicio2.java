// Ejercicio 2
public class Ejercicio2 {

    public static <T> void mostrarElemento(T elemento) {
        System.out.println("Elemento: " + elemento + " (tipo: " + elemento.getClass().getSimpleName() + ")");
    }

    public static void main(String[] args) {
        mostrarElemento("Hola");
        mostrarElemento(10);
        mostrarElemento(5.5);
        mostrarElemento('A');
        mostrarElemento(true);

        String nombre = "Santiago";
        mostrarElemento(nombre);

        Integer num = 100;
        mostrarElemento(num);

        Persona p = new Persona("Laura", 20);
        mostrarElemento(p);
    }
}

class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString() {
        return nombre + " - " + edad + " anios";
    }
}
