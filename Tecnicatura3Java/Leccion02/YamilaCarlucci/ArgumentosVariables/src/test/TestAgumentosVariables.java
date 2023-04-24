package test;

public class TestAgumentosVariables {
	
	public static void main(String[] args) {
		imprimirNumeros(3,4,5);
		imprimirNumeros(1,2);
		variosParametros("Juan", "Perez", 7, 8, 9);
	}
	
	private static void variosParametros(String nombre, String apellido, int ...numeros) {
		System.out.println("Nombre: " + nombre + " - Apellido: " + apellido);		
		imprimirNumeros(numeros);
	}
	
	private static void imprimirNumeros(int ...numeros) { //Los tres puntos muestran que son argumentos variables. No se sabe la cant de elementos que vamos a recibir
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Elementos: " + numeros[i]);
			
		}
		
	}
	

}
