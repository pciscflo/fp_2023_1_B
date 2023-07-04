package pe.upc;

import java.util.Arrays;

public class Arreglos {

    public static void main(String[] args) {
        int original[] = { 1, 2, 2, 4, 6, 9, 9, 14, 18, 18 };
        int sinRepetir[] = new int[original.length];
          int j = 0;
        for (int i = 0; i < original.length; i++) {
            if (esUnValorUnico(original[i], original)) {
                sinRepetir[j] = original[i];
                j++;
            }
        }
        System.out.println("Arreglo original: " + Arrays.toString(original));
        System.out.println("Arreglo con valores sin repetir: " + Arrays.toString(sinRepetir));
    }
    public static boolean esUnValorUnico(int valor, int[] arreglo) {
        int contador = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor)
                contador++;
        }
        return contador == 1;
    }
}
