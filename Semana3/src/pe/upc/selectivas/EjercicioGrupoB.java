package pe.upc.selectivas;

import java.util.Scanner;

public class EjercicioGrupoB
{
    public static void main(String[] args) {
        String productType;
        int quantityOfBags;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tipo de producto:");
        productType = scanner.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de sacos:");
        quantityOfBags = scanner2.nextInt();
        System.out.println(getInvoice(productType, quantityOfBags));
    }
    static double getInvoice(String productType, int quantityOfBags) {
        // Product type
        final String potato = "P";
        final String onion = "C";
        final String lemon = "L";
        final String chilli = "A";
        final String corn = "M";

        // Price by bag
        double potatoBagPrice = 20.5;
        double onionBagPrice = 19.4;
        double lemonBagPrice = 32.3;
        double chilliBagPrice = 16.5;
        double cornBagPrice = 19.8;

        double finalPrice = 0;

        switch (productType) {
            case potato:
                finalPrice =  quantityOfBags * potatoBagPrice;
                break;
            case onion:
                finalPrice =  quantityOfBags * onionBagPrice;
                break;
            case lemon:
                finalPrice =  quantityOfBags * lemonBagPrice;
                break;
            case chilli:
                finalPrice =  quantityOfBags * chilliBagPrice;
                break;
            case corn:
                finalPrice =  quantityOfBags * cornBagPrice;
                break;
        }

        return finalPrice;

    }
}