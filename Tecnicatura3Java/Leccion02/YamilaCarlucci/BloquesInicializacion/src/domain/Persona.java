package domain;

public class Persona {
	
	private final int idPersona;
	private static int contadorPersonas;
	
	//Un atributo no es estático
	
	static {//Bloque de inicialización estático
		System.out.println("Ejecución de bloque estático");
		++Persona.contadorPersonas;
	}
	
	{//Bloque de inicialización NO estático (contexto dinámico)
		System.out.println("Ejecución del bloque NO estático");
		this.idPersona = Persona.contadorPersonas++; //Incrementamos el atributo
	}
	
	//Los bloques de inicialización se ejecutan antes del constructor
	
	public Persona() {
		System.out.println("Esta es la ejecución del constructor");
	}
	
	public int getIdPersona() {
		return this.idPersona;
		
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + "]";
	}
}
