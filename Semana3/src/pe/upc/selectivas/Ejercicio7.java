package pe.upc.selectivas;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar numero:");
        int numero;
        numero = scanner.nextInt();
        System.out.println(esPar(numero));
        linea();
        System.out.println("Ingresar numero:");
        numero = scanner.nextInt();
        System.out.println(esPar(numero));
        linea();
    }
    static boolean esPar(int numero){
        boolean resultado;
        if(numero % 2 == 0){
            resultado = true;
        }else {
            resultado = false;
        }
        return resultado;
    }
    static void linea(){
        System.out.println("-----------------");
    }
}
