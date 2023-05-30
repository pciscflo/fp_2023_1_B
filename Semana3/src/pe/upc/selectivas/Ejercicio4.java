package pe.upc.selectivas;

public class Ejercicio4 {
    public static void main(String[] args) {
        //E. Selección múltiple, más de 2 alternativas elegir sólo una
        int numero = 0;
        if(numero>0){ // if else anidado
            System.out.println("Es positivo");
        } else if (numero<0) {
            System.out.println("Es negativo");
        } else if (numero == 0) {
            System.out.println("Es cero");
        }
    }
}
