package pe.upc.repetitivas;

public class Ejercicio3 {
    public static void main(String[] args) {
        //simular lanzamientos de un dado
        //el programa debe lanzar el dado hasta que salga el número 6
        //imprimir la suma de resultados parciales
        int dado=0, suma = 0;
        while(dado!=6){
            dado = 1+ (int) (Math.random()*6); // 1, 3, 4, 6
            suma+=dado;
            System.out.println(dado);//1, 3, 4, 6
        }
        System.out.println("Total:" + suma);
    }
}
