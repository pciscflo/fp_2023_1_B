package com.upc.ejemplo;

import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        int  a, b, suma;//declarando una variable entera
        final double G = 9.8;
        double producto;
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar numero:");
        a = sc.nextInt();//leer un dato del teclado entero
        System.out.println("Ingrese numero:");
        b = sc.nextInt();
        suma = a + b;
        System.out.println("La suma es:" + suma);
    }
    static void sumar2(int a, int b){


    }
}
