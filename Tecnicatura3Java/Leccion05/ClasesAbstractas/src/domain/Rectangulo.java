/*
5.5 Clases Abstractas (abstract) Parte  3

Agregamos la primer clase hija

*/
package domain;


public class Rectangulo extends FiguraGeometrica{ //public class Rectangulo extends FiguraGeometrica{ TENEMOS QUE AGREGAR LA CLASE ABSTRACT
    //Constructor
    public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }
    
    //implementamos el metodo de la clase padre
    
    @Override
    public void dibujar(){ //Implementando el metodo
        System.out.println("Se imprime un : "+this.getClass().getSimpleName());
    }
    
} 

