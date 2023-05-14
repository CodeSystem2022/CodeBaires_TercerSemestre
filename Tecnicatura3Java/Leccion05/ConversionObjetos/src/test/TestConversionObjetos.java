
package test;
import domain.*;
public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("juan", 5000, TipoEscritura.CLASICO);
        System.out.println("empleado = "+empleado);
        System.out.println(empleado.obtenerDetalles()); // si queremos acceder a metodos Escritor
        //empleado.getTipoEscritura(); //no se puede hacer 
        //Dowcasting
       // ((Escritor)empleado).getTipoEscritura();//tenemos 2 opciones : esta es una 
        Escritor escritor = (Escritor)empleado; // esta es la segunda opcion
        escritor.getTipoEscritura();
        
        //Upcasting
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
    }
}
