/* 8.4 Creamos nuestra propia excepción -> Parte  2 

Creamos el metodo de la clase aritmetica
y creamos el metodo division

 */
package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica { // de tipo static para que podamos llamar directamente al emtodo de la fivision
    public static int division(int numerador, int denominador){
//            throws OperacionExcepcion{ // Indicamos cual es la posible excepcion q arroja el metodo. (firma del metodo)
        
        if(denominador ==0){
            throw new OperacionExcepcion("Division entre cero"); //reportamos la excepcion si el denominadoe es igual a cero
        }
        return numerador / denominador; //agregamos que retorne la
        
    }
    
    
}
