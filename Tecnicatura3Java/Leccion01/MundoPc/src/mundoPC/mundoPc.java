/*
1.6 Comenzamos las pruebas creando objetos de cada clase y las agregamos a la lista de Orden: Parte 1, 2 y 3

 */
package mundoPC;

import ar.com.system2023.mundopc.*; // eliminamos Monitor por *, el * sirve para importar todas las clases necesarias 

public class mundoPc {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13); //importar la clase
        Teclado tecladoHP = new Teclado("Blouetooth","HP");
        Raton ratonHP = new Raton("Bluetooth", "HP"); //clase raton y su objeto
        Computadora computadoraHP = new Computadora("Computadora HP",monitorHP,tecladoHP,ratonHP ); // le pasamos la marca con sus ojetos
        // con eso reafirmamos lo q es la relacion de agregacion.
    
    
        //creamos otros objetos diferentes marca Gamer
        Monitor monitorGamer = new Monitor("HP", 32); //importar la clase
        Teclado tecladoGamer = new Teclado("Blouetooth","Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer"); //clase raton y su objeto
        Computadora computadoraGamer = new Computadora("Computadora Gamer",monitorGamer,tecladoGamer,ratonGamer ); 
        //
        
        // agrego el elemento 3
        Monitor monitorLG = new Monitor("LG", 22); //importar la clase
        Teclado tecladoLG = new Teclado("Blouetooth","LG");
        Raton ratonLG = new Raton("Bluetooth", "LG"); //clase raton y su objeto
        Computadora computadoraLG = new Computadora("Computadora LG",monitorLG,tecladoLG,ratonLG ); // le pasamos la marca con sus ojetos
        //
        
        
        // agrego el elemento 4 
        Monitor monitorCoradir = new Monitor("Coradir", 25); //importar la clase
        Teclado tecladoCoradir = new Teclado("Blouetooth","Coradir");
        Raton ratonCoradir = new Raton("Bluetooth", "Coradir"); //clase raton y su objeto
        Computadora computadoraCoradir = new Computadora("Computadora Coradir",monitorCoradir,tecladoCoradir,ratonCoradir ); // le pasamos la marca con sus ojetos
        //

        // agrego el elemento 5
        Monitor monitorTCG = new Monitor("TCG", 28); //importar la clase
        Teclado tecladoTCG = new Teclado("Blouetooth","TCG");
        Raton ratonTCG = new Raton("Bluetooth", "TCG"); //clase raton y su objeto
        Computadora computadoraTCG = new Computadora("Computadora TCG",monitorTCG,tecladoTCG,ratonTCG );
        //
        
        //  agrego el elemento 6 
        Monitor monitorSony = new Monitor("Sony", 27); //importar la clase
        Teclado tecladoSony = new Teclado("Blouetooth","Sony");
        Raton ratonSony = new Raton("Bluetooth", "Sony"); //clase raton y su objeto
        Computadora computadoraSony = new Computadora("Computadora Sony",monitorSony,tecladoSony,ratonSony );
        //
        
        //agregp el elemento 7
        Monitor monitorUlefone = new Monitor("Ulefone", 10); //importar la clase
        Teclado tecladoUlefone = new Teclado("Blouetooth","Ulefone");
        Raton ratonUlefone = new Raton("Bluetooth", "Ulefone"); //clase raton y su objeto
        Computadora computadoraUlefone = new Computadora("Computadora Ulefone",monitorUlefone,tecladoUlefone,ratonUlefone );
        //
        
        // agrego el elemento 8
        Monitor monitorDell = new Monitor("Dell", 45); //importar la clase
        Teclado tecladoDell = new Teclado("Blouetooth","Dell");
        Raton ratonDell = new Raton("Bluetooth", "Dell"); //clase raton y su objeto
        Computadora computadoraDell = new Computadora("Computadora Dell",monitorDell,tecladoDell,ratonDell );
        //
        
        //  agrego el elemento 9
        Monitor monitorAlcatel = new Monitor("Alcatel", 27); //importar la clase
        Teclado tecladoAlcatel = new Teclado("Blouetooth","Alcatel");
        Raton ratonAlcatel = new Raton("Bluetooth", "Alcatel"); //clase raton y su objeto
        Computadora computadoraAlcatel = new Computadora("Computadora Alcatel",monitorAlcatel,tecladoAlcatel,ratonAlcatel );
        //
        
        //  agrego el elemento 10
        Monitor monitorApple = new Monitor("Apple", 24); //importar la clase
        Teclado tecladoApple = new Teclado("Blouetooth","Apple");
        Raton ratonApple = new Raton("Bluetooth", "Apple"); //clase raton y su objeto
        Computadora computadoraApple = new Computadora("Computadora Apple",monitorApple,tecladoApple,ratonApple );
        //
        
        //  agrego el elemento 11  ?
        Monitor monitorAsus = new Monitor("Asus", 29); //importar la clase
        Teclado tecladoAsus = new Teclado("Blouetooth","Asus");
        Raton ratonAsus = new Raton("Bluetooth", "Asus"); //clase raton y su objeto
        Computadora computadoraAsus = new Computadora("Computadora Asus",monitorAsus,tecladoAsus,ratonAsus );
        //
        
        
        //Creamos un objeto de la clase Orden
        Orden orden1 = new Orden(); // inicializamos el arreglo, por el momento vacio
        Orden orden2 = new Orden(); // Una nueva lista para el objeto orden 2
        
        Orden orden3 = new Orden(); // creo un lista de objetos de orden3 para orden1
        
        orden1.agregarComputadora(computadoraHP); //objeto.Metodo()
        orden1.agregarComputadora(computadoraGamer);
        
        //agregamos 8 elementos a la lista orden1 (TEREA ECHA)
        orden1.agregarComputadora(computadoraLG); //agrego a computadoraLG a la lista 1
        orden1.agregarComputadora(computadoraCoradir);
        orden1.agregarComputadora(computadoraTCG);
        orden1.agregarComputadora(computadoraSony);
        orden1.agregarComputadora(computadoraUlefone);
        orden1.agregarComputadora(computadoraDell);
        orden1.agregarComputadora(computadoraAlcatel);
        orden1.agregarComputadora(computadoraApple);
//      orden1.agregarComputadora(computadoraAsus);  // Agregando este elemento a la lista, obtenemos un error
    
        Computadora computadorasVarias = new Computadora("Computadora de diferentes marcas", monitorHP, tecladoGamer, ratonHP);
        orden2.agregarComputadora(computadorasVarias); 
        //orden1.agregarComputadora(computadoraGamer);
        
        orden1.mostrarOrden(); //mostramos la lista orden1
        orden2.mostrarOrden(); //mostramos la lista orden1
        
        //Crear mas objetos de tipo computadora con todos sus elementos
        //completar una lista en el objeto orden1 que llegue a los 10 elementos
        //probar de esta manera los metodos al maximo rendimiento.
        
        
//        orden3.mostrarOrden(); //Mostramos la orden3 si deceamos agregarlo
        


    
    }
    
}
