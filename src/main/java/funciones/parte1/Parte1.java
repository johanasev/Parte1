/*
 Primera parte:

Crear una función con tres parámetros que sean números que se suman entre sí.

Llamar a la función en el main y darle valores.

@author Johana Sevillano

*/

package funciones.parte1;

public class Parte1 {

    public static void main(String[] args) {
        
        int param1 = 50;  
        int param2 = 30;
        int param3 = 40;
        
        suma(param1,param2,param3);
    }
    
    public static int suma(int a, int b, int c){
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);

        return resultado;
    }
}


