package pe.upc.arreglos;

import java.util.Scanner;

public class Ejercicio4 {
    static int[] totalUnidades = {3, 4, 6, 10, 2};
    static String[] agentes = {"Mario", "Jorge", "Luis", "Carlos", "Carmen"};
    public static void main(String[] args) {
        mostrarMenu();
    }

    static void mostrarMenu(){
        int opcion;
      do {
          System.out.println("1) Total de Unidades Vendidad");
          System.out.println("2) Porcentaje de vendedores que superaron cuota");
          System.out.println("3) Lista de vendedores que superaron cuota");
          System.out.println("4) Monto a pagar por ventas");
          System.out.println("5) Salir");
          Scanner scanner = new Scanner(System.in);
          System.out.println("Ingrese opcion:");
          opcion = scanner.nextInt();
          switch (opcion) {
              case 1:
                  System.out.println(calcularTotalUnidadesVendidas());
                  break;
              case 2:
                  System.out.println(calcularPorcentajeVendedoresSuperaronCuota());
                  break;
              case 3:
                  mostrarAgentesSuperaronCuota(obtenerAgentesSuperaronCuota());
                  break;
              case 4:
                  System.out.println(calcularComisionTotal());

          }
          System.out.println("**********************************");
          if(opcion==5)
              break;
      } while (true);

    }


    static void mostrarAgentesSuperaronCuota(String[] agentes){
        for(int i=0; i< agentes.length; i++)
        {
            if(agentes[i]!=null) {
                System.out.println(agentes[i]);
            }
        }
    }
    static int calcularTotalUnidadesVendidas() {
        int totalUnidadesVendidas = 0;
        for(int i=0; i< totalUnidades.length; i++){
            totalUnidadesVendidas += totalUnidades[i];
        }
        return totalUnidadesVendidas;
    }

    static double calcularPorcentajeVendedoresSuperaronCuota() {
        int vendedoresQueSuperaronCuota = 0;
        for (int i=0; i< totalUnidades.length; i++){
            if (totalUnidades[i] > 5) {
                vendedoresQueSuperaronCuota++;
            }
        }
        return (double) vendedoresQueSuperaronCuota / totalUnidades.length * 100;
    }
    static String[] obtenerAgentesSuperaronCuota(){
        String[] nombres = new String[5];
        int j = 0;
        for(int i=0; i< totalUnidades.length; i++){
            if(totalUnidades[i]>5){
                nombres[j] = agentes[i];
                j++;
            }
        }
        return nombres;
    }
    static int calcularComisionTotal() {
        int comisionTotal = calcularTotalUnidadesVendidas() * 300;
        return comisionTotal;
    }
}
