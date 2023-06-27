package pe.upc.cadenas;

public class Ejercicio2 {

    static String[] etiquetas = {"PE2190002","AR200008","CH180005", "BR300010","PE100007"};

    static int calcularCantidadProductos(String nacionalidad){
        int suma = 0;
        for(int i=0 ; i < etiquetas.length ; i++){
            if(etiquetas[i].substring(0,2).equals(nacionalidad)){
                suma += Integer.parseInt(etiquetas[i].substring(2,6)); //CONVERTIR LA CADENA A ENTERO
            }
        }
        return suma;
    }
     //  Subprograma que obtenga el último correlativo generado para un producto
    //  de una determinada nacionalidad.
    static int calcularUltimoCorrelativo(String nacionalidad){

       return 0;
    }
    public static void main(String[] args) {
        //1)
        System.out.println(calcularCantidadProductos("PE"));
    }
}
