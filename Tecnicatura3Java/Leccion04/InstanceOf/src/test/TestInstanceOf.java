//1.5 Instance of Parte 1 y 2
package test;

import domain.*;

public class TestInstanceOf {

	public static void main(String[] args) {
	//definimos variables de la clase padre
        Empleado empleado1 = new Empleado("Juan" , 10000);
        //determinarTipo(empleado1);
        empleado1 = new Gerente("Jose", 5000, "Sistemas");
        determinarTipo(empleado1);				
	}
	
	public static void determinarTipo(Empleado empleado) {
		if(empleado instanceof Gerente) { // la variable empleado esta apuntado a la memoria de tipo gerente.
			System.out.println("Es de tipo Gerente");
		}
		else if (empleado instanceof Empleado) {
			System.out.println("Es de tipo Empleado");
		}
		else if (empleado instanceof Object) {
			System.out.println("Es de tipo Object");
		}
	}
	
    /* intancOf = instancia de cierto tipo.
    nos pregunta por la refencia, q lq cual q puntq lq memoria
    
    Variable = TIPO ;es lo que se asigna en memoria
    */
}
