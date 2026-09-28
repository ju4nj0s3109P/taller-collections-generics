// Ejercicio 7
public class Ejercicio7 {

    public static <T extends Number> double sumar(T a, T b) {
        double num1 = a.doubleValue();
        double num2 = b.doubleValue();
        double suma = num1 + num2;
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("Suma de enteros 5 + 7 = " + sumar(5, 7));
        System.out.println("Suma de doubles 2.5 + 3.7 = " + sumar(2.5, 3.7));

        Float f1 = 1.5f;
        Float f2 = 2.25f;
        System.out.println("Suma de floats 1.5 + 2.25 = " + sumar(f1, f2));

        Long l1 = 100000L;
        Long l2 = 250000L;
        System.out.println("Suma de longs 100000 + 250000 = " + sumar(l1, l2));

        System.out.println("Suma mezclada 5 + 2.5 = " + sumar(5, 2.5));
    }
}
