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
        var opcion = Integer.parseInt(entrada.nextLine());
        var salir = false ;
        //Revisamos la opcion digitada a traves de un switch
        switch(opcion){
            case 1 -> ´{//Agregar una persona a la lista
            System.out.print("Digite el nombre: ");
            var nombre = entrada.nextLine();
            System.out.print("Digite el telefono: ");
            var tel = entrada.nextLine();
            System.out.print("Digite el correo: ");
            var email = entrada.nextLine();
            // Creamos el objeto persona
            var persona = new Persona(nombre, tel, email);
            //Agregamos la persona a la lista 
            Personas.add(persona);
            System.out.println("La lista tine: "+Personas.size()+"elementos");
           }//Fin caso 1
            case 2 -> {//Listar a las personas
                System.out.println("Listado de personas: ");
                //Mejoras con lambda y el método de referencia
                //personas.forEach((persona) -> System.out.println(persona));
                personas.forEach(System.out::println);
            }//Fin caso 2
        }
    }//Fin del metodo ejecutarOperacion
}//Fin de la clase ListadoPersonaApp
