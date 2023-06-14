import java.util.Scanner;

public class CalculadoraUTN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("********** Aplicacion Calculadora **********");
        //Mostramos el menu
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Salir
                """);
        System.out.print("Operacion a realizar?");
        var operacion = Integer.parseInt(entrada.nextLine());
        if(operacion >=1 && operacion <=4){
            System.out.print("Ingrese el valor para el operando1: ");
            var operando1 = Integer.parseInt(entrada.nextLine());
            System.out.print("Ingrese el valor para el operando2: ");
            var operando2 = Integer.parseInt(entrada.nextLine());


            int resultado;
            switch (operacion){
                case 1 -> {//suma
                    resultado = operando1 + operando2;
                    System.out.println(" Resultado de la suma: "+resultado);
                }
                case  2 -> {//resta
                    resultado = operando1-operando2;
                    System.out.println("Resultado de la resta: "+resultado);
                }
                case 3 -> {//miultiplicacion
                    resultado = operando1*operando2;
                    System.out.println("Resultado de la multiplicación: "+resultado);
                }
                case 4 -> {//division
                    resultado = operando1/operando2;
                    System.out.println("Resultado de la divisón: "+resultado);
                }
                default -> System.out.println("Opcion erronea: "+operacion);

            }//fin switch

        }// fin de if
        else if (operacion == 5) {
            System.out.println("Hasta pronto.....");
        }
        else {
            System.out.println("Opcion erronea: "+operacion);
        }

        }// fin main

    }// fin clase

