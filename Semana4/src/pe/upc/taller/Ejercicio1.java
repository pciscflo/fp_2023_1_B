package pe.upc.taller;

public class Ejercicio1 {
/*
La universidad está organizando 10 de Talleres de programación. Para incentivar
a los alumnos a matricularse, está otorgando descuentos por cantidad de talleres
a matricularse por alumno, además descuento por llevar a referidos
 (son alumnos que dan el nombre del alumno que les recomendó llevar el taller).
 Hay un descuento por referidos de acuerdo a la tabla,
 además si lleva 9 o 10 referidos, le hacen un descuento adicional de 20 soles,
 sobre el importe descontado. Determinar el importe a pagar por la matricula a uno o más talleres.
 El precio de cada taller es único.
 El cuadro de descuento por cantidad de talleres y de referidos es la siguiente:

Cantidad de Talleres	Descuento
2 a 4	                    5 %
5 a 7	                    10 %
8 a 10 	                    15 %

Cantidad de referidos	Descuento
2 a 5	                    7 %
6 a 8	                    10 %
9 a 10	                    12 %

Todos los descuentos se aplican al precio original. 

Se le solicita lo siguiente:
a.	Calculo del descuento por talleres matriculados		
b.	Calculo por descuento por cantidad de referidos.		
c.	Calculo del costo por talleres matriculados		

Entrada: cantidadTalleres, cantidadReferidos, precioTaller
Salida: importePagar
  
*/
 
    static double calcularPorcentajeDescuentoPorTalleres(int cantidadTalleres){
        double porcentaDescuento = 0;
        if(cantidadTalleres>=2 && cantidadTalleres<=4){
            porcentaDescuento = 0.05;
        } else if (cantidadTalleres>=5 && cantidadTalleres<=7) {
            porcentaDescuento = 0.10;
        } else if (cantidadTalleres>=8 && cantidadTalleres<=10) {
            porcentaDescuento = 0.15;
        } else if(cantidadTalleres>11){
            porcentaDescuento = 0.15;
        }
        return porcentaDescuento;
    }
    static double calcularPrecioDescuentoPorTalleres(int cantidadTalleres, double precioTaller){
        double porcentaje = calcularPorcentajeDescuentoPorTalleres(cantidadTalleres);
        return porcentaje*precioTaller*cantidadTalleres;
    }

    static double calcularPorcentajeDescuentoPorReferidos(int cantidadReferidos){
        double porcentaDescuento = 0;
        if(cantidadReferidos>=2 && cantidadReferidos<=5){
            porcentaDescuento = 0.07;
        } else if (cantidadReferidos>=6 && cantidadReferidos<=8) {
            porcentaDescuento = 0.10;
        } else if (cantidadReferidos>=9 && cantidadReferidos<=10) {
            porcentaDescuento = 0.12;
        } else if(cantidadReferidos>11){
            porcentaDescuento = 0.12;
        }
        return porcentaDescuento;
    }
    static double calcularDescuentoEspecial(int cantidadReferidos){
        double descuento = 0;
        if(cantidadReferidos>=9 || cantidadReferidos<10){
            descuento = 20;
        }
        return descuento;
    }
    static double calcularPrecioDescuentoPorReferidos(int cantidadReferidos, double precioTaller, int cantidadTalleres){
        double porcentaje = calcularPorcentajeDescuentoPorReferidos(cantidadReferidos);
        return porcentaje*precioTaller*cantidadTalleres;
    }
    static double calcularPrecioFinal(int cantidadTalleres, int cantidadReferidos, double precioTaller){
        double resultado;
        resultado = precioTaller - calcularPrecioDescuentoPorTalleres(cantidadReferidos, precioTaller)
                 - calcularPrecioDescuentoPorReferidos(cantidadReferidos,precioTaller,cantidadTalleres)
                 - calcularDescuentoEspecial(cantidadReferidos);
        return resultado;
    }

    public static void main(String[] args) {
        int cantidadTalleres=2, cantidadReferidos=3;
        double precioTaller=100, importePagar;
        double descuento;
        //a
        System.out.println(calcularPrecioDescuentoPorTalleres(cantidadTalleres,precioTaller));
        //b
        System.out.println(calcularPrecioDescuentoPorReferidos(cantidadReferidos,precioTaller, cantidadTalleres));
        //c
        System.out.println(calcularPrecioFinal(cantidadTalleres,cantidadReferidos,precioTaller));
        
    }
}
