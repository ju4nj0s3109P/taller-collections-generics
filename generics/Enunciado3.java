
// Enunciado 3
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Enunciado3 {
    public static void main(String[] args) {
        CatalogoCursos catalogo = new CatalogoCursos();
        catalogo.agregarCurso(new Curso("MAT301", "Calculo Integral", 2024));
        catalogo.agregarCurso(new Curso("EDD201", "Estructura de Datos", 2025));
        catalogo.agregarCurso(new Curso("PRG101", "Programacion I", 2024));
        catalogo.agregarCurso(new Curso("BDD150", "Bases de Datos", 2025));
        catalogo.agregarCurso(new Curso("FIS110", "Fisica Mecanica", 2023));
        catalogo.agregarCurso(new Curso("ALG120", "Algebra Lineal", 2024));

        System.out.println("=== Catalogo completo ===");
        catalogo.mostrar();

        int anio = 2024;
        System.out.println("\n=== Cursos del anio " + anio + " ===");
        ArrayList<Curso> delAnio = catalogo.cursosPorAnio(anio);
        if (delAnio.size() == 0) {
            System.out.println("No hay cursos de ese anio");
        } else {
            Iterator<Curso> it = delAnio.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }

        System.out.println("\n=== Cursos del anio 2030 ===");
        ArrayList<Curso> otro = catalogo.cursosPorAnio(2030);
        System.out.println("Encontrados: " + otro.size());

        System.out.println("\n=== Ordenados por codigo ===");
        catalogo.ordenarPorCodigo();
        catalogo.mostrar();
    }
}

class Curso {
    private String codigo;
    private String nombre;
    private int anio;

    public Curso(String codigo, String nombre, int anio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anio = anio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnio() {
        return anio;
    }

    public String toString() {
        return "[" + codigo + "] " + nombre + " (" + anio + ")";
    }
}

class ComparadorCodigo implements Comparator<Curso> {
    public int compare(Curso a, Curso b) {
        return a.getCodigo().compareTo(b.getCodigo());
    }
}

class CatalogoCursos {
    ArrayList<Curso> cursos = new ArrayList<Curso>();

    public void agregarCurso(Curso c) {
        cursos.add(c);
    }

    // recorre solo con Iterator
    public ArrayList<Curso> cursosPorAnio(int anioObjetivo) {
        ArrayList<Curso> lista = new ArrayList<Curso>();
        Iterator<Curso> it = cursos.iterator();
        while (it.hasNext()) {
            Curso aux = it.next();
            if (aux.getAnio() == anioObjetivo) {
                lista.add(aux);
            }
        }
        return lista;
    }

    public void ordenarPorCodigo() {
        Collections.sort(cursos, new ComparadorCodigo());
    }

    public void mostrar() {
        Iterator<Curso> it = cursos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
