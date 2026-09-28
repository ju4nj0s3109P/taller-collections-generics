// Enunciado 2

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class Enunciado2 {
    public static void main(String[] args) {
        DirectorioContactos dir = new DirectorioContactos();
        dir.agregar(new Contacto("Pedro", "3104567890", "pedro@gmail.com"));
        dir.agregar(new Contacto("Ana", "3001234567", "ana@hotmail.com"));
        dir.agregar(new Contacto("Luis", "3209876543", "luis@gmail.com"));
        dir.agregar(new Contacto("Maria", "3157654321", "maria@universidad.edu.co"));
        dir.agregar(new Contacto("Carlos", "3012223344", "carlos@gmail.com"));

        System.out.println("=== Contactos (como se agregaron) ===");
        dir.mostrar();

        System.out.println("\n=== Contactos con dominio gmail.com ===");
        LinkedList<Contacto> deGmail = dir.buscarPorDominio("gmail.com");
        Iterator<Contacto> it = deGmail.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\n=== Ordenados por nombre (orden natural) ===");
        dir.ordenarPorNombre();
        dir.mostrar();

        System.out.println("\n=== Ordenados por telefono (Comparator) ===");
        dir.ordenarPorTelefono();
        dir.mostrar();
    }
}

class Contacto implements Comparable<Contacto> {
    String nombre;
    String telefono;
    String email;

    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    // orden natural por nombre
    public int compareTo(Contacto otro) {
        return this.nombre.compareTo(otro.nombre);
    }

    public String toString() {
        return nombre + " | " + telefono + " | " + email;
    }
}

class ComparadorTelefono implements Comparator<Contacto> {
    public int compare(Contacto c1, Contacto c2) {
        return c1.getTelefono().compareTo(c2.getTelefono());
    }
}

class DirectorioContactos {
    private LinkedList<Contacto> contactos = new LinkedList<Contacto>();

    public void agregar(Contacto c) {
        contactos.add(c);
    }

    public LinkedList<Contacto> buscarPorDominio(String dominio) {
        LinkedList<Contacto> encontrados = new LinkedList<Contacto>();
        Iterator<Contacto> it = contactos.iterator();
        while (it.hasNext()) {
            Contacto c = it.next();
            if (c.getEmail().endsWith("@" + dominio)) {
                encontrados.add(c);
            }
        }
        return encontrados;
    }

    public void ordenarPorNombre() {
        Collections.sort(contactos);
    }

    public void ordenarPorTelefono() {
        Collections.sort(contactos, new ComparadorTelefono());
    }

    public void mostrar() {
        for (int i = 0; i < contactos.size(); i++) {
            System.out.println((i + 1) + ". " + contactos.get(i));
        }
    }
}
