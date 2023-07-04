package pe.upc;

public class Ejercicio {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 2, 4, 6, 9, 9, 14, 18, 18};

        int cantidadMultiplos = contarMultiplos(numeros);
        System.out.println("Cantidad de elementos múltiplos de 3 o 7: " + cantidadMultiplos);

        double promedioImpares = calcularPromedioImpares(numeros);
        System.out.println("Promedio de los números en posiciones impares: " + promedioImpares);

        int[] arregloSinDuplicados = eliminarDuplicados(numeros);
        System.out.print("Arreglo sin duplicados: ");
        for (int i = 0; i < arregloSinDuplicados.length; i++) {
            int num = arregloSinDuplicados[i];
            System.out.print(num + " ");
        }
    }
    public static int contarMultiplos(int[] numeros) {
        int count = 0;
        for (int i = 0; i < numeros.length; i++) {
            int num = numeros[i];
            if (num % 3 == 0 || num % 7 == 0) {
                count++;
            }
        }
        return count;
    }
    public static double calcularPromedioImpares(int[] numeros) {
        double sum = 0;
        int count = 0;
        for (int i = 1; i < numeros.length; i += 2) {
            sum += numeros[i];
            count++;
        }
        return sum / count;
    }
    public static int[] eliminarDuplicados(int[] numeros) {
        int n = numeros.length;//10

        int[] arregloSinDuplicados = new int[n];//10 elementos {, , , , , , , , , ,  }
        int index = 0;//int[] numeros = {1, 2, 2, 4, 6, 9, 9, 14, 18, 18};

        for (int i = 0; i < n - 1; i++) {//hasta el 9
            if (numeros[i] != numeros[i + 1]) {//1-2,2-2,2-4,4-6
                arregloSinDuplicados[index] = numeros[i];//10 elementos {1,2 ,4 , 6, 9, 14, , , ,  }
                index++;//6  arregloSinDuplicados[2]= 4
            }
        }
        arregloSinDuplicados[index] = numeros[n - 1];//arregloSinDuplicados[6]=numeros[9]  {1,2 ,4 , 6, 9, 14,18, , ,  } index=7
        index++;//index=7

        int[] resultado = new int[index];//7 espacion
        for (int i = 0; i < index; i++) {
            resultado[i] = arregloSinDuplicados[i];//{1,2 ,4 , 6, 9, 14,18}
        }

        return resultado;
    }
}
