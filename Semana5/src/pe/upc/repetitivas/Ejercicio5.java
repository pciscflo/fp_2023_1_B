package pe.upc.repetitivas;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //ingrese datos validando si es mayor que cero o tipoEmpleado es G o E
        String tipoempleado;
        double sueldo=3000;
        int n=10;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Ingrese Tipo Empleado:");
            tipoempleado = scanner.nextLine();
        }while (!tipoempleado.equals("G") && !tipoempleado.equals("E"));//si es verdad regresa

        System.out.println("Sueldo Final:" + calcularSueldoFinal(n, tipoempleado, sueldo));
        System.out.println("Porcentaje de Aumento:" + calcularPorcentajeAumento(n, tipoempleado, sueldo));
    }
    static double calcularPorcentajeAumento(int n, String tipoEmpleado,double sueldoInicial){
        double sueldoFinal = calcularSueldoFinal(n, tipoEmpleado,sueldoInicial);
        return 100*(sueldoFinal - sueldoInicial)/(sueldoInicial + sueldoFinal);
    }
    static double calcularSueldoFinal(int n, String tipoEmpleado, double sueldo){
          for (int i=1 ; i<=n ; i++){
              if(i % 4 == 0){
                  switch (tipoEmpleado) {
                      case "G":
                          sueldo += (0.18 * sueldo);
                          break;
                      case "E":
                          sueldo += (0.12 * sueldo);
                          break;
                  }
              }else {
                  switch (tipoEmpleado) {
                      case "G":
                          sueldo += (0.14 * sueldo);
                          break;
                      case "E":
                          sueldo += (0.08 * sueldo);
                          break;
                  }
              }
        }
        return sueldo;
    }
}
