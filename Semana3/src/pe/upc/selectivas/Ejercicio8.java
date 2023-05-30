package pe.upc.selectivas;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Jugador 1");
        System.out.println(calcularSueldo(26, "E"));
        //imprimir el sueldo final y su bono
        System.out.println("-------------------------------");
        System.out.println("Jugador 2");
        System.out.println(calcularSueldo(29,"E"));
        System.out.println("Su bono es: " + calcularBono("E"));
    }
    static double calcularSueldo(int edad, String nacionalidad){
        double sueldo=2500;
        double bono=0;
        bono  = calcularBono(nacionalidad);
        sueldo += bono; // sueldo = sueldo + bono;
        if( edad >=15 && edad<=20){
            sueldo+=1400;
        } else if (edad>= 21 && edad<=25) {
            sueldo+=1500;
        } else if (edad>=26 && edad<=30) {
            sueldo+=1200;
        } else {
            sueldo+=800;
        }
        return sueldo;
    }
    static double calcularBono(String nacionalidad){
        double bono = 0;
        if(nacionalidad.equals("E")){
            bono = 500;
        }
        return bono;
    }

}

