
package pe.upc.selectivas;

import java.util.Scanner;

public class EjercicioGrupoC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadSacos;
        String tipoProducto;
        double montoTotal;

        System.out.print("Ingrese el tipo de producto:");
        tipoProducto = scanner.next();
        System.out.print("Ingrese la cantidad de sacos: ");
        cantidadSacos = scanner.nextInt();

        montoTotal = calcularMontoTotal(tipoProducto, cantidadSacos);
        if (montoTotal != 0) {
            System.out.println("El monto total es: " + montoTotal);
        } else {
            System.out.println("Tipo de producto no válido");
        }
    }
    public static double calcularMontoTotal(String tipoProducto, int cantidadSacos) {
        double precioPorSaco = 0;

        switch (tipoProducto.toUpperCase()) {
            case "P":
                precioPorSaco = 20.5;
                break;
            case "C":
                precioPorSaco = 19.4;
                break;
            case "L":
                precioPorSaco = 323;
                break;
            case "A":
                precioPorSaco = 16.5;
                break;
            case "M":
                precioPorSaco = 19.8;
                break;
            default:
                return 0;
        }

        return precioPorSaco * cantidadSacos;
    }
}
