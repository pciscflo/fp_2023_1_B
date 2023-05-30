package pe.upc.selectivas;

import java.util.Scanner;

public class EjercicioGrupoA {
    public static void main(String[] args) {
        double cantidad;
        String tipo;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tipo de producto: ");
        tipo = sc.next();
        System.out.println("Ingrese cantidad de sacos: ");
        cantidad = sc.nextDouble();

        if (tipo.equals("P")  || tipo.equals("C") || tipo.equals("L") || tipo.equals("A") || tipo.equals("M")){
            System.out.println("Tipo de producto: " + nombreTipo(tipo));
            System.out.println("Cantidad de sacos: " + cantidad);
            System.out.println("Precio por saco: " + precioSaco(tipo));
            System.out.println("------------------------------------------");
            System.out.printf("Monto total : %s ",calcularMonto(cantidad,tipo));
        }else{
            System.out.print("Tipo de producto no existe");
        }


    }
    static double calcularMonto(double cantidad, String tipo){
        double monto;

        monto = cantidad * precioSaco(tipo);

        return monto;
    }
    static double precioSaco (String tipo){
        double precio = 0;

        switch (tipo){
            case "P":
                precio = 20.5;
                break;
            case "C":
                precio = 19.4;
                break;
            case "L":
                precio = 32.3;
                break;
            case "A":
                precio = 16.5;
                break;
            case "M":
                precio = 19.8;
                break;

        }
        return precio;
    }

    static String nombreTipo (String tipo){
        String nombre = "";

        switch (tipo){
            case "P":
                nombre = "papa";
                break;
            case "C":
                nombre = "cebolla";
                break;
            case "L":
                nombre = "limón";
                break;
            case "A":
                nombre = "ají";
                break;
            case "M":
                nombre = "maíz";
                break;

        }
        return nombre;
    }
}
