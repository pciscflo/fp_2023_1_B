package pe.upc.selectivas;

public class Ejercicio6 {
    public static void main(String[] args) {
     esPar(10);
     esPar(3);
     esPar(8);
    }

    static void esPar(int numero){
        if ( numero % 2 == 0){
            System.out.println("Es par");
        } else {
            System.out.println("No es par");
        }
    }
}
