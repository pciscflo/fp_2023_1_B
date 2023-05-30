package pe.upc.selectivas;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numero = 10; //La condicion del if siempre debe tener paréntesis
        if (numero>=18) { // E. Seleccion doble, de 2 alternativas seleccciona sólo 1
            System.out.println("Es mayor de edad"); //Cuando es V la condicion
        }else { //no tiene ;
            System.out.println("Es menor de edad");//Cuando es F la condición
        }
    }
}
