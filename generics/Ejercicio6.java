// Ejercicio 6
public class Ejercicio6 {
    public static void main(String[] args) {
        CajaNumerica<Integer> c1 = new CajaNumerica<Integer>(8);
        System.out.println("Numero: " + c1.getNumero() + " -> doble: " + c1.doble());

        CajaNumerica<Double> c2 = new CajaNumerica<Double>(2.75);
        System.out.println("Numero: " + c2.getNumero() + " -> doble: " + c2.doble());

        CajaNumerica<Float> c3 = new CajaNumerica<>(1.5f);
        System.out.println("Numero: " + c3.getNumero() + " -> doble: " + c3.doble());

        CajaNumerica<Long> c4 = new CajaNumerica<>(123456L);
        System.out.println("Numero: " + c4.getNumero() + " -> doble: " + c4.doble());
        
        c1.setNumero(-15);
        System.out.println("Numero cambiado: " + c1.getNumero() + " -> doble: " + c1.doble());
    }
}

class CajaNumerica<T extends Number> {
    private T numero;

    public CajaNumerica(T numero) {
        this.numero = numero;
    }

    public T getNumero() {
        return numero;
    }

    public void setNumero(T numero) {
        this.numero = numero;
    }

    public double doble() {
        double valor = numero.doubleValue();
        double resultado = valor * 2;
        return resultado;
    }
}
