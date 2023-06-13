package pe.upc.repetitivas;

public class Ejercicio3 {
    public static void main(String[] args) {
        //simular lanzamientos de un dado
        //el programa debe lanzar el dado hasta que salga el número 6
        //imprimir la suma de resultados parciales
        System.out.println("Total:" + calcularSumaLanzamientos()); //salida
    }
    static int calcularSumaLanzamientos(){
        int res=0, suma = 0;
        while(res!=6){
            res = lanzar(); // 1, 3, 4, 6
            suma+=res;
        }
        return suma;
    }
    static int lanzar(){
        int dado;
        dado = 1+ (int) (Math.random()*6); // 1, 3, 4, 6
        return dado;
    }
}
