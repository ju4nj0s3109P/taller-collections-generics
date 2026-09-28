package ejercicio09;

public class Main {

    public static void main(String[] args) {
        Navegador navegador = new Navegador();

        navegador.visitar("google.com");
        navegador.visitar("youtube.com");
        navegador.visitar("github.com");

        System.out.println("Página actual: " + navegador.paginaActual());
        System.out.println("Volver: " + navegador.volver());
        System.out.println("Volver: " + navegador.volver());
        System.out.println("Página actual: " + navegador.paginaActual());
    }
}