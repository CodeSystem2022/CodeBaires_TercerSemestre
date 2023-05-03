package domain;

public class Persona {
    
    private final int idPersona;            //Atributo no estatico (dinamico) cuando no dice nada luego del private/public es no estatico
    private static int contadorPersonas;     // Atributo estatico , siempre se escribe static luego del private/public cuando es estatico
    
    //Bloque de Inicializacion estatico
    static{
        System.out.println("Ejecucion del Bloque de inicializacion estatico");
        ++Persona.contadorPersonas;   //IDEM poner Persona.contadorPersonas++ 
                                      //como es un bloque ESTATICO ,NO uso this para referenciar al atributo,lo escribo directamente
        
        //idPersona = 10  NO puede usarse un atributo no estatico (dinamico) dentro de un bloque estatico
                                               // Atributo estatico --- va en Bloque estatico
                                               //Atributo no estatico --- va en Bloque no estatico
    }
   
    //Bloque  de inicializacion No estatico (contexto dinamico)
    {
        System.out.println("Ejecucion del bloque no estatico");
        this.idPersona = ++Persona.contadorPersonas; // Incrementamos el atributo nuevamente
                                                     // IDEM poner Persona.contadorPersonas++
                                                     // como es un bloque no estatico o dinamico uso el this. para referenciar al atributo
    }
    
    //Los Bloques de inicializacion se ejecutaran antes del metodo contructor
    
    //Metodo Constructor
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }
    
    public int getIdPersona(){       // Metodo Get para traerme el atributo idPersona (porque es privado)
        return this.idPersona;       // y no estatico por eso uso el this. para referenciar al atributo
    }

    /*
    public static int getContadorPersonas() {   // Metodo Get para traerme el atributo contadorPersonas (porque es privado)
        return contadorPersonas;                // y estatico (por eso NO uso this. para referenciar o llamar al atributo)
    }
    */
    
    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
}
