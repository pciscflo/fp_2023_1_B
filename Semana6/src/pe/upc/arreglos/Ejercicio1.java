package pe.upc.arreglos;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] notas = {20, 17, 10, 15, 14,11}; //arreglo de 6 elementos
        String[] nombres = {"Pepe", "Luis", "Pedro", "Carmen", "Paul", "Ana"};
        //imprimir los elementos del arreglo notas
        for(int i=0; i< notas.length; i++){
            System.out.println(notas[i]);//20, 17,..., 11
        }
        //calcular la suma
        System.out.println("La suma es: " + suma(notas));
        //calcular la mayor nota
        System.out.println("La mayor nota es: " + mayor(notas));
        //imprimir el nombre del alumno con mayor nota
        System.out.println("El nombre del alumno con mayor nota es:" + nombreMayor(notas, nombres));

    }
    static int suma(int notas[]){
        int suma = 0;
        for(int i=0; i< notas.length; i++){
            suma+=notas[i];
        }
        return suma;
    }
    static int mayor(int notas[]){
        int maximo = 0;
        for(int i=0; i< notas.length; i++){
           if(notas[i]>maximo){
               maximo = notas[i];
           }
        }
        return maximo;
    }
    static String nombreMayor(int notas[], String nombres[]){
        int maximo = 0;
        String nombre=null;
        for(int i=0; i< notas.length; i++){
            if(notas[i]>maximo){
                maximo = notas[i];
                nombre = nombres[i];
            }
        }
        return nombre;
    }
}
