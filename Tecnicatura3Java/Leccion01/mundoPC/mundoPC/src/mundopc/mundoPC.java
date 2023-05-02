
package mundopc;

import ar.com.system2023.mundopc.*;

public class mundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13); //importar la clase 
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        //creamos otros objetos de diferente marca 
        Monitor monitorGamer = new Monitor("Gamer", 32); //importar la clase 
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        
        //agrego como tarea dos objetlos mas de diferente marca 
        Monitor monitorSamsung = new Monitor("Samsung", 24); //importar la clase 
        Teclado tecladoSamsung = new Teclado("Bluetooth", "Samsung");
        Raton ratonSamsung = new Raton("Bluetooth", "Samsung");
        Computadora computadoraSamsung = new Computadora("Computadora Samsung", monitorSamsung, tecladoSamsung, ratonSamsung);
        
        Monitor monitorBGH = new Monitor("BGH", 32); //importar la clase 
        Teclado tecladoBGH = new Teclado("Bluetooth", "BGH");
        Raton ratonBGH = new Raton("Bluetooth", "BGH");
        Computadora computadoraBGH = new Computadora("Computadora BGH", monitorBGH, tecladoBGH, ratonBGH);
        
        Monitor monitorLG = new Monitor("LG", 32); //importar la clase 
        Teclado tecladoLG = new Teclado("Bluetooth", "LG");
        Raton ratonLG = new Raton("Bluetooth", "LG");
        Computadora computadoraLG = new Computadora("Computadora LG", monitorLG, tecladoLG, ratonLG);
        
        
        Orden orden1 = new Orden(); // inicializamos el arreglo vacio
        Orden orden2 = new Orden(); // una lueva lista para el objeto2 
        
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        Computadora computadorasVarias = new Computadora("Computadora de diferente marcas", monitorHP, tecladoGamer, ratonHP);
        orden2.agregarComputadora(computadoraSamsung);
        orden2.agregarComputadora(computadorasVarias);
        orden1.agregarComputadora(computadoraLG);
        orden1.agregarComputadora(computadoraSamsung);
        orden1.agregarComputadora(computadorasVarias);
        orden1.agregarComputadora(computadoraLG);
        orden1.agregarComputadora(computadoraGamer);
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraBGH);
        orden1.agregarComputadora(computadoraBGH);
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraLG);
        orden1.agregarComputadora(computadoraBGH);
        orden1.agregarComputadora(computadoraLG);
        
        
        
        orden1.mostrarOrden();
        orden2.mostrarOrden();
        
        
    }
    
}
