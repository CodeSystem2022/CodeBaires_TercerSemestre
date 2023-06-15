import java.util.Scanner;

public class CalculadoraUTN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while(true) { //Ciclo infinito
            System.out.println("********** Aplicacion Calculadora **********");
            //Mostramos el menu
            mostrarMenu(); // Funcion menu  

            try {
                var operacion = Integer.parseInt(entrada.nextLine());
                if (operacion >= 1 && operacion <= 4) {
                    ejecutarOperacion(operacion, entrada);
                }// fin de if
                else if (operacion == 5) {
                    System.out.println("Hasta pronto.....");
                    break; // Rompe el ciclo y sale
                } else {
                    System.out.println("Opcion erronea: " + operacion);
                }
                //Imprimimos un salto de linea
                System.out.println();
            } catch (Exception e) {//Fin try, comienzo del catch
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
        }//Fin while
    }// fin main
    
    //Factorizamos el código a través del método mostrarMenu
    private static void mostrarMenu(){ //Funcion menu
        System.out.println("""
                    1. Suma
                    2, Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    """);
        System.out.print("Operacion a realizar? ");
    }//Fin metodo mostrarMenu

    private static void ejecutarOperacion(int operacion, Scanner entrada){
        System.out.print("Ingrese el valor para el operando1: ");
        var operando1 = Double.parseDouble(entrada.nextLine());
        System.out.print("Ingrese el valor para el operando2: ");
        var operando2 = Double.parseDouble(entrada.nextLine());
        double resultado;
        switch (operacion) {
            case 1 -> {//suma
                resultado = operando1 + operando2;
                System.out.println(" Resultado de la suma: " + resultado);
            }
            case 2 -> {//resta
                resultado = operando1 - operando2;
                System.out.println("Resultado de la resta: " + resultado);
            }
            case 3 -> {//miultiplicacion
                resultado = operando1 * operando2;
                System.out.println("Resultado de la multiplicación: " + resultado);
            }
            case 4 -> {//division
                resultado = operando1 / operando2;
                System.out.println("Resultado de la divisón: " + resultado);
            }
            default -> System.out.println("Opcion erronea: " + operacion);

        }//fin switch
    } //Fin metodo ejecutar operacion

}// fin clase


