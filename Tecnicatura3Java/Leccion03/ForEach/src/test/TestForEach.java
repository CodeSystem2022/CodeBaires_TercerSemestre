
package test;

import domain.Persona;

public class TestForEach {
	
	public static void main(String[] args) {
		
		int edades[] = {5,6,8,9}; //Sintáxis resumida
		
		for (int edad: edades) { //Sintáxis del ForEach
			System.out.println("Edad:" + edad);			
		}
		
		Persona personas[] = {
				new Persona("Juan"),
				new Persona("Carla"),
				new Persona("Beatriz")
		};
		
		for (Persona persona: personas) { //Sintáxis del ForEach
			System.out.println(persona);			
		}
		
		
		
	}

}
