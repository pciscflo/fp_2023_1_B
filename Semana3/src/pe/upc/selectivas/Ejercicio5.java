package pe.upc.selectivas;

public class Ejercicio5 {
    public static void main(String[] args) {
        int opcion = 2;
        switch (opcion){
            case 1: //solo enteros o cadenas
                System.out.println("UNO");
                break;//salir del switch
            case 2:
                System.out.println("DOS");
                break;
            case 3:
                System.out.println("TRES");
                break;
            default: // es opcional
                System.out.println("Ninguno");
        }

    }
}
