package pe.upc.semana2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, mensaje;
        int edad;
        System.out.println("Ingrese su nombre:");
        nombre = sc.nextLine();
        System.out.println("Ingrese su edad:");
        edad = sc.nextInt();
        if(edad>=18){
            mensaje = "Mayor de edad";
        }else {
            mensaje = "Menor de edad";
        }
        System.out.println("Bienvenido "+ nombre+" eres " + mensaje);
    }
}
