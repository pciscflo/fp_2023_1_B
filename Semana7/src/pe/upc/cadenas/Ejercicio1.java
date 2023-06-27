package pe.upc.cadenas;

public class Ejercicio1 {
    public static void main(String[] args) {
        String[] nombres = {"Luis2014", "Juan2021", "Pepe1980"};
        //imprimir la primera letra de los nombres
        for(int i=0; i< nombres.length; i++){
            System.out.println(nombres[i].substring( 4, 8));
        }

    }
}
