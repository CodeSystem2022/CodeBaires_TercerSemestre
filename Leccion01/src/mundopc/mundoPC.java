package mundopc;

import ar.com.system2023.mundopc.*;

public class mundoPC {

	public static void main(String[] args) {
		
		//Creamos primer objeto
		Monitor monitorHP = new Monitor("HP", 13); //Importar la clase
		Teclado tecladoHP = new Teclado("Bluethooth", "HP"); 
		Raton ratonHP = new Raton("Bluethooth", "HP");
		Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
		
		
		//Creamos segundo objeto
		Monitor monitorGamer = new Monitor("Gamer", 32); 
		Teclado tecladoGamer = new Teclado("Bluethooth", "Gamer"); 
		Raton ratonGamer = new Raton("Bluethooth", "Gamer");
		Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
		
		//Creamos tercer objeto
		Monitor monitorLogitech = new Monitor("Logitech", 24); 
		Teclado tecladoLogitech = new Teclado("Bluethooth", "Logitech"); 
		Raton ratonLogitech = new Raton("Bluethooth", "Logitech");
		Computadora computadoraLogitech = new Computadora("Computadora Logitech", monitorLogitech, tecladoLogitech, ratonLogitech);
		
		//Creamos cuarto objeto
		Computadora computadorasVarias = new Computadora("Computadora de diferentes marcas", monitorHP, tecladoGamer, ratonLogitech);
		
		
		//Creamos un cuarto objeto
		Monitor monitorSamsung = new Monitor("Samsung", 40); 
		Teclado tecladoSamsung = new Teclado("Bluethooth", "Samsung"); 
		Raton ratonSamsung = new Raton("Bluethooth", "Samsung");
		Computadora computadoraSamsung = new Computadora("Computadora Samsung", monitorSamsung, tecladoSamsung, ratonSamsung);
		
		
		//Creamos un objeto de tipo orden
		Orden orden1 = new Orden(); //Inicializamos el arreglo vacío
		orden1.agregarComputadora(computadoraHP);
		orden1.agregarComputadora(computadoraGamer);
		orden1.mostrarOrden();
		
		//Creamos otro objeto de tipo orden
		Orden orden2 = new Orden(); //Inicializamos el arreglo vacío
		orden2.agregarComputadora(computadorasVarias);
		orden2.agregarComputadora(computadoraLogitech);
		orden2.agregarComputadora(computadoraSamsung);
		orden2.agregarComputadora(computadoraHP);
		orden2.agregarComputadora(computadoraGamer);
		orden2.agregarComputadora(computadorasVarias);
		orden2.agregarComputadora(computadoraLogitech);
		orden2.agregarComputadora(computadoraSamsung);
		orden2.agregarComputadora(computadoraHP);
		orden2.agregarComputadora(computadoraGamer);		
		orden2.mostrarOrden();
		
		//Creamos otro objeto de tipo orden
		Orden orden3 = new Orden(); //Inicializamos el arreglo vacío
		orden3.agregarComputadora(computadorasVarias);
		orden3.agregarComputadora(computadoraLogitech);
		orden3.agregarComputadora(computadoraSamsung);
		orden3.agregarComputadora(computadoraHP);
		orden3.agregarComputadora(computadoraGamer);
		orden3.agregarComputadora(computadorasVarias);
		orden3.agregarComputadora(computadoraLogitech);
		orden3.agregarComputadora(computadoraSamsung);
		orden3.agregarComputadora(computadoraHP);
		orden3.agregarComputadora(computadoraGamer);
		orden3.agregarComputadora(computadorasVarias);
		orden3.mostrarOrden();

		
		
	}
}

