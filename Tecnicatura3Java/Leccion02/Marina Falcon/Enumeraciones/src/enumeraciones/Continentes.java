
package enumeraciones;


public enum Continentes {
    AFRICA(53, "1.2 billones"),
    EUROPA(53, "1.1 billones"),
    ASIA(53, "1.9 billones"),
    AMERICA(53, "150.2 billones"),
    OCEANIA(53, "1.2 billones");
    
    private final int paises;    // creo 2 atributos privados 
    private String habitantes;
    
    Continentes(int paises, String habitantes){  // A traves del METODO CONSTRUCTOR Continentes()relaciono los elementos de la enum con los atributos,pasandolos como parametros dentro del metodo constructor
        this.paises = paises;                    // e inicializando los atributos.
        this.habitantes = habitantes;
    }
    
    //METODO GET para obtener o acceder al atributo que es privado
    public int getPaises(){
        return this.paises;
    }    
    //METODO GET para obtener o acceder al atributo que es privado 
    public String getHabitantes(){
        return this.habitantes;
    }    
        
        
}
