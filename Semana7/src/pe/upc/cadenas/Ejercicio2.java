package pe.upc.cadenas;

public class Ejercicio2 {

    static String[] etiquetas = {"PE219002","AR200008","CH180005", "AR500008", "BR300010","PE100007"};

    static int calcularCantidadProductos(String nacionalidad){
        int suma = 0;
        String correlativo;
        for(int i=0 ; i < etiquetas.length ; i++){
            if(etiquetas[i].substring(0,2).equals(nacionalidad)){
                correlativo = etiquetas[i].substring(2,6);
                suma += Integer.parseInt(correlativo); //CONVERTIR LA CADENA A ENTERO
            }
        }
        return suma;
    }
     //  Subprograma que obtenga el último correlativo (mayor) generado para un producto
    //  de una determinada nacionalidad.
    static int calcularUltimoCorrelativo(String nacionalidad){
        String correlativo;
        int numeroCorrelativo;
        int maximo = 0;
       for(int i=0; i< etiquetas.length;i++)
       {
           if(etiquetas[i].substring(0,2).equals(nacionalidad)){
               correlativo = etiquetas[i].substring(2,6);
               numeroCorrelativo = Integer.parseInt(correlativo);
               if(numeroCorrelativo > maximo){
                   maximo = numeroCorrelativo;
               }
           }
       }
       return maximo;
    }
    static int calcularSumaCostosAlmacenaje(String nacionalidad){
        int suma = 0;
        String nacion;
        String correlativo;
        String costo;
        int monto;
        for (int i= 0; i< etiquetas.length; i++){
            nacion = etiquetas[i].substring(0,2);
            correlativo = etiquetas[i].substring(2,6);
            costo = etiquetas[i].substring(6,8);
            if(nacion.equals(nacionalidad)){
               monto =  Integer.parseInt(correlativo)*Integer.parseInt(costo);
               suma+= monto;
            }
        }
        return suma;
    }
    public static void main(String[] args) {
        //1)
        System.out.println(calcularCantidadProductos("PE"));
        //2
        System.out.println(calcularUltimoCorrelativo("AR"));
        //3
        System.out.println(calcularSumaCostosAlmacenaje("PE"));
    }
}
