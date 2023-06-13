package pe.upc.repetitivas;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Pares del 1 al 20");
        for(int i=1; i <= 20; i++){
            if(i % 2==0) {
                System.out.println(i);
            }
        }
        System.out.println("Repetir imprimir 5 veces la letra A");
        for(int i=0 ; i<5 ; i++ ){
            System.out.print("A");
        }
        System.out.println();
        System.out.println("Repetir imprimir 5 veces la letra A");
        for(int i=1 ; i<=5 ; i++ ){
            System.out.print("A");
        }

        System.out.println();
        System.out.println("Numeros en forma descendente del 10 al 2");
        for(int i=10; i>=2  ; i--){  //contador variable+=1 variable++ , variable+=2  variable= variable + 2
            System.out.println(i);
        }
        System.out.println("Numeros de dos en dos desde el cero hasta el 20");
        for (int i=0; i<=20; i+=2){
            System.out.println(i);
        }


    }
}
