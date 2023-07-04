package pe.upc;

import java.util.LinkedHashSet;

public class caso2 {
    public static void main(String[] args) {
        int[] numeros = {1,2,2,4,6,9,9,14,18,18};

        System.out.println("Cantidad de elementos múltiplos de 3 o 7: " + MultiplosTresOSiete(numeros));

        System.out.println("Promedio de números en posición impar: " + PromedioPosicionImpar(numeros));

        int[] SinDuplicados = NoDuplicados(numeros);
        System.out.println("Arreglo sin duplicados: ");
        for(int numero: SinDuplicados){
            System.out.print(numero + ", ");
        }

    }

     static int MultiplosTresOSiete(int[] numeros){
         int contador = 0;
         for(int numero : numeros){
             if(numero%3 == 0 || numero%7 == 0 ){
                 contador++;
             }
         }
         return contador;
     }

     static double PromedioPosicionImpar(int[] numeros){
        int total = 0;
        int contador = 0;
        for(int i = 1; i < numeros.length; i+=2){
            total += numeros[i];
            contador++;
         }
        return (double) total / contador;
     }

     static int[] NoDuplicados(int[] numeros){
         LinkedHashSet<Integer> set = new LinkedHashSet<>();
         for(int numero : numeros){
             set.add(numero);
         }
         int[] resultado = new int[set.size()];
         int i = 0;
         for(int numero: set){
             resultado[i++] = numero;
         }
         return resultado;
     }

}
