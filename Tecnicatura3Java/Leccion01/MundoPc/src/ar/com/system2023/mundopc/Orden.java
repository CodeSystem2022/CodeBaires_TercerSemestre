/* 1.5 Creamos la clase Orden: Parte 1 y 2 
 */
package ar.com.system2023.mundopc;

public class Orden {
//agregamos atributos
    private final int idOrden;
    private Computadora computadora[];//arreglo de objetos abierto para ir recibiendo cada uno de los objetos q van entrados
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 10; //esta constante es para el max de computadora, el atributo final es un tope 
    private int contadorComputadora;
    
//Constructor vacio
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes; // 
        this.computadora = new Computadora[Orden.MAX_COMPUTADORAS];
        
    }
//Agregamos un Metodo para gregar una nueva computadora al arreglo
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadora < Orden.MAX_COMPUTADORAS){// ponemos la condicion para gregar un alemento al arreglo
            this.computadora[this.contadorComputadora++] = computadora; //este metodo de agregar computadora, primero asigna el valo y luego lo incrementa.
            //(parte2)
  
        }
        else{
            System.out.println("Has superado el limite :"+Orden.MAX_COMPUTADORAS);
        }   
    }
    
//Vemos el metodo mostrar Orden
    public void mostrarOrden(){
        System.out.println("Orden #: "+this.idOrden);
        System.out.println("Computadora de la orden #: "+this.idOrden);
        for(int i = 0; i < this.contadorComputadora; i++){ //es para iterrar todos los elementos y que se valla mostrando la orden
            System.out.println(this.computadora[i]);
        }
    }
    
    
}
