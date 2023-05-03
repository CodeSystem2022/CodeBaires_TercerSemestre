package test;

import domain.Persona;

public class TestBloqueInicializacion {
    public static void main(String[] args) {
        Persona persona1 = new Persona();       // dentro del main creo un objeto, persona1 
        System.out.println("persona1 = " + persona1);    // y de esta forma creando el objeto se carga en memoria la clase Persona
                                                    // y se comienza a ejecutar los bloques en orden: primero el estatico luego el estatico y por ultimo el constructor.
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
               
                                                      
                                                      
    }                                           
}
