package pe.upc.semana2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        int suma, resta, multiplicacion, division;
        double potencia;
        System.out.println("Ingrese número:");
        a = sc.nextInt();
        System.out.println("Ingrese número:");
        b = sc.nextInt();
        suma = sumar(a, b);
        resta = a -b;
        multiplicacion = a*b;
        division = a / b;
        potencia = Math.pow(a,b);
        System.out.println("Suma:" + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion:" + multiplicacion);
        System.out.println("División Entera:" + division);
        System.out.println("Potencia:" + potencia);
    }
    static int sumar(int a, int b){
        return (a + b);
    }
}
