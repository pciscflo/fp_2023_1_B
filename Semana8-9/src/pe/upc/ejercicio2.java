package pe.upc;

import java.util.Arrays;

public class ejercicio2 {
    public static void main(String[] args) {
       int[] numeros = {1,2,2,4,6,9,9,14,18,18,1,6};

        System.out.println("Cantidad de elementos múltiplos de 3 o 7: " + cantidadElementos(numeros));
        System.out.println("Promedio de los números que están en posición impares: " + promedioImpares(numeros));

        int[] numeros2 = nuevoArreglo(numeros);
        System.out.print("Nuevo arrreglo sin duplicados : ");
         for (int i=0;i < numeros2.length; i++) {
            System.out.print(numeros2[i]);
            if (i < numeros2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    static int cantidadElementos(int[] n){
        int contador = 0;
        for (int i=0;i < n.length; i++)
        {
            if(n[i]%3==0 || n[i]%7==0){
                contador ++;
            }
        }
        return contador;
    }

    static double promedioImpares(int[] n){
        double promedio = 0, suma=0;
        int cantidad = 0;
        for (int i=0;i < n.length; i++)
        {
            if(i%2 != 0){
                suma += n[i];
                cantidad++;
            }
        }
        try {
            promedio = suma / cantidad;
        } catch (Exception e){
            promedio = 0;
        }

        return promedio;
    }

    static int[] nuevoArreglo(int[] n){
        int cantidad = cantidadNoDuplicados(n);
        int[] noDuplicados = new int[cantidad] ; //new int[n.length];
        int contador = 0;

        for (int i=0;i < n.length; i++)
        {
            boolean duplicado = false;
            for(int j = i+1; j < n.length; j++){
                if(n[j] == n[i]){
                   duplicado = true;
                   break;
                }
            }
            if(!duplicado){
                noDuplicados[contador] = n[i];
                contador++;
            }
        }

        return noDuplicados;
    }

    static int cantidadNoDuplicados(int[] n){
        int cantidad = 0, dato = 0;
        for (int i=0;i < n.length; i++)
        {
            boolean duplicado = false;
            for(int j = i+1; j < n.length; j++){
                if(n[j] == n[i]){
                    duplicado = true;
                    break;
                }
            }
            if(!duplicado){
                cantidad++;
            }
        }
        return cantidad;
    }

}
