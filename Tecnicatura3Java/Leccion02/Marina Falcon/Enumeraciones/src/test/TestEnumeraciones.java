
package test;

import enumeraciones.Continentes; // importamoas la enum Continentes del paquete enumeraciones
import enumeraciones.Dias;   // importamos la enum Dias del paquete enumeraciones


public class TestEnumeraciones {
    public static void main(String[] args) {
      //  System.out.println("Dia 1: " + Dias.LUNES);
        // se accede a los elementos de la enumeracion colocando el nombre de la enum y operador de punto -- Dias.LUNES
        // los elementos de la enumeracion son tipo string pero no se usan comillas sino nombredelaenum.elemento
        
       // indicarDiaSemana(Dias.JUEVES);
        System.out.println("Continente No 1: " + Continentes.AFRICA);
        System.out.println("Cantidad de paises en el 1er continente: "
                     + Continentes.AFRICA.getPaises());
        System.out.println("Cantidad de habitantes en el 1er continente: "
                     + Continentes.AFRICA.getHabitantes());       
        
        System.out.println("Continente No 2: " + Continentes.EUROPA);
        System.out.println("Cantidad de paises en el 2DO continente: "
                     + Continentes.EUROPA.getPaises());
        System.out.println("Cantidad de habitantes en el 2DO continente: "
                     + Continentes.EUROPA.getHabitantes()); 
        
        System.out.println("Continente No 3: " + Continentes.ASIA);
        System.out.println("Cantidad de paises en el 3ER continente: "
                     + Continentes.ASIA.getPaises());
        System.out.println("Cantidad de habitantes en el 3er continente: "
                     + Continentes.ASIA.getHabitantes());
        
        System.out.println("Continente No 4: " + Continentes.AMERICA);
        System.out.println("Cantidad de paises en el 4TO continente: "
                     + Continentes.AMERICA.getPaises());
        System.out.println("Cantidad de habitantes en el 4TO continente: "
                     + Continentes.AMERICA.getHabitantes());
        
        System.out.println("Continente No 5: " + Continentes.OCEANIA);
        System.out.println("Cantidad de paises en el 5TO continente: "
                     + Continentes.OCEANIA.getPaises());
        System.out.println("Cantidad de habitantes en el 5TO continente: "
                     + Continentes.OCEANIA.getHabitantes());
        
       
    }
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;    
            default: 
                System.out.println("No eligio dia de la semana");    
        }
    }
    
    
    
    
} 
