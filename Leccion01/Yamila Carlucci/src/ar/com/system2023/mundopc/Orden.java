package ar.com.system2023.mundopc;

public class Orden {
	
	private final int idOrden;
	private Computadora computadora[]; //Arreglo de objetos
	private static int ContadorOrdenes;
	private static final int MAX_COMPUTADORAS = 10;
	private int ContadorComputadora;
	
	//Constructor vacío
	public Orden() {
		this.idOrden = ++Orden.ContadorOrdenes;
		this.computadora = new Computadora[Orden.MAX_COMPUTADORAS];
	}
	
	//Método para agregar una nueva computadora al arreglo
	public void agregarComputadora(Computadora computadora) {
		if(this.ContadorComputadora < Orden.MAX_COMPUTADORAS) {
			this.computadora[this.ContadorComputadora++] = computadora;					
		}
		else {
			System.out.println("Has superado el límite: " + Orden.MAX_COMPUTADORAS);
		}
	}
	
	//Método para mostrar orden
	public void mostrarOrden() {
		System.out.println("Orden #" + this.idOrden);
		System.out.println("Computadoras de la orden #" + this.idOrden);
		for(int i = 0; i < this.ContadorComputadora; i++) {
			System.out.println(this.computadora[i]);
		}
	}
	
	
	
	

}
