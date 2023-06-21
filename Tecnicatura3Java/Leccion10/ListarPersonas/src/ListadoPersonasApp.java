import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Definimos la lista fuera del ciclo while
        List<Persona> persona = new ArrayList<>();

        //Empezamos con el menu
        var salir = false;
        while (!salir){//salir = false
            mostrarMenu();//funcion
            try{
                salir = ejecutarOperacion(entrada, Personas);
            }catch (Exception e){
                System.out.println("Ocurrio un error: "+e.getMessa());
            }
           
            System.out.println();

        }// Fin del ciclo While

    }//Fin metodo menu

    private static void mostrarMenu(){
        // mostramos las opciones
        System.out.print("""
                ******* Listado de Personas *******
                1. Agregar
                2. Listar
                3. Salir

                """);
        System.out.print("Digite una de las opciones: ");
    }// Fin de metodo mostrarMenu
    
    private static boolean ejecutarOperacion(Scanner entrada, List<Persona> persona){

    }//Fin del metodo ejecutarOperacion
}//Fin de la clase ListadoPersonaApp
