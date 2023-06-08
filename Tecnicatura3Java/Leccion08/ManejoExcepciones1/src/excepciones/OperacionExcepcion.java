/*8.4 Creamos nuestra propia excepción -> Parte 1

8.5 Comenzamos a hacer pruebas con RuntimeException (unchecked)

 */
package excepciones;

//public class OperacionExcepcion extends Exception{
public class OperacionExcepcion extends RuntimeException{ //RuntimeException, el compilador no nos obliga a agregar la exception en la firma del metodo.
    // constructor
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
    
    
    
}
