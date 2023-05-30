package pe.upc.selectivas;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println(calcularSuma(15,5));//20
        System.out.println(calcularSuma(10,20));//30
        int s;
        s = calcularSuma(10,10);//20
        System.out.println(s);
    }
    static int calcularSuma(int a, int b){ //Java Objetos: métodos, No OO: Funciones, A:Procedimientos, rutinas, módulos
        int suma;
        suma = a + b;
        return suma;
    }
}
