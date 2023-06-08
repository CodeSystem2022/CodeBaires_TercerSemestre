package test;

import static aritmetica.Aritmetica.division; // Importamos el metodo 

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado=0;
        try{
        resultado = division(10, 0); // es una operacion que tira una excepcion y la ejecucion se detiene   (Unchack exception)
        }catch(OperacionExcepcion e ){
            System.out.println("Ocurrio un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        }catch (Exception e){ //para que el programa se recupere del error
            System.out.println("Ocurrio un error");
            e.printStackTrace(System.out); //se conoce como la pila de excepciones
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Se reviso la division entre cero");//Esto es para que nuestro programa no termine de manera abrupta
        }
        System.out.println(" La variable de resultado tiene como valor: "+resultado);
    }
    
