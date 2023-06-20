package pe.upc.arreglos;

public class Ejercicio2 {
    static int[] notas = {20, 17, 10, 15, 14,11}; //arreglo de 6 elementos
    static String[] nombres = {"Pepe", "Luis", "Pedro", "Carmen", "Paul", "Ana"};
    public static void main(String[] args) {

        //imprimir los elementos del arreglo notas
        for(int i=0; i< notas.length; i++){
            System.out.println(notas[i]);//20, 17,..., 11
        }
        //calcular la suma
        int s = suma();
        System.out.println("La suma es: " + s);
        //calcular la mayor nota
        System.out.println("La mayor nota es: " + mayor());
        //imprimir el nombre del alumno con mayor nota
        System.out.println("El nombre del alumno con mayor nota es:" + nombreMayor());

    }
    static int suma(){
        int suma = 0;
        for(int i=0; i< notas.length; i++){
            suma+=notas[i];
        }
        return suma;
    }
    static int mayor(){
        int maximo = 0;
        for(int i=0; i< notas.length; i++){
            if(maximo < notas[i]){
                maximo = notas[i];
            }
        }
        return maximo;
    }
    static String nombreMayor(){
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
