package pe.upc.semana2;

import java.util.Scanner;

public class Ejercicio3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio, area ;
        System.out.println("Ingrese Radio:");
        radio = sc.nextDouble();
        area = calculaArea(radio);
        System.out.printf("Area:%.2f", area);
    }
    static double calculaArea(double radio){
        return Math.PI*Math.pow(radio, 2);
    }
}
