package test;

public class Test_AutoboxingUnboxing {
	
	public static void main(String[] args) {
		//Clases envolventes o Wrapper
		/*
		 Clases envolventes de tipos primitivos
		 int = la clase envolvente es Integer (nos permite acceder a diferentes funciones, tiene atributos y métodos)
		 long = la clase envolvente es Long
		 float = la clase envolvente es Float
		 double = la clase envolvente es Double
		 boolean = la clase envolvente es Boolean
		 byte = la clase envolvente es Byte
		 char = la clase envolvente es Character
		 short = la clase envolvente es Short
		 
		 */
		
		int enteroPrim = 10; //Tipo primitivo
		System.out.println("Entero primitivo: " + enteroPrim);
		Integer entero = 10; //Tipo object con la clase Integer
		System.out.println("Entero: " + entero.doubleValue()); //Autoboxing
		
		int entero2 = entero; //Unboxing
		System.out.println("Entero2: " + entero2);
		
		
		
	}
}
