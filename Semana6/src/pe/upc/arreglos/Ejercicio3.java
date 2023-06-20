package pe.upc.arreglos;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    /*
Ejercicio: Ventas mensuales
Una empresa vendedora de fotocopiadoras necesita calcular cual ha sido el volumen de
ventas de cada uno de sus agentes comerciales durante el presente mes y en base a eso
determinar distintos indicadores así como montos a pagar en comisión de ventas.

Se le solicita:
1) Obtener el total de unidades vendidas durante el presente mes.
Para eso se tiene como dato de entrada un arreglo con la cantidad de unidades vendidas
por cada agente comercial.
2) Si se sabe que la cuota de venta de cada vendedor es 5 unidades, determinar cuál es el
porcentaje de vendedores que superaron la cuota de venta. Para eso se tiene como dato
de entrada un arreglo con la cantidad de unidades vendidas por cada agente comercial.
3) Se desea saber quién(es) fueron los agentes de ventas que superaron la cuota de venta.
4) Si se sabe que por cada unidad vendida se tiene que pagar una comisión de ventas de
300 soles, determinar cuánto es lo que se tiene que pagar como comisión este mes.
 */
    static int[] totalUnidades = {3, 4, 6, 10, 2};
    static String[] agentes = {"Mario", "Jorge", "Luis", "Carlos", "Carmen"};


    public static void main(String[] args) {
        System.out.println("Agentes que superaron la cuota:");
        String[] agentes = obtenerAgentesSuperaronCuota();
        for(int i=0; i< agentes.length; i++)
        {
            if(agentes[i]!=null) {
                System.out.println(agentes[i]);
            }
        }
    }

    static String[] obtenerAgentesSuperaronCuota(){
        String[] nombres = new String[5];
        int j = 0;
        for(int i=0; i< totalUnidades.length; i++){
            if(totalUnidades[i]>5){
                nombres[j] = agentes[i];
                j++;
            }
        }
        return nombres;
    }
}
