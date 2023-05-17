/*
5.5 Clases Abstractas (abstract) Parte  2 

 */
package domain;


public abstract class FiguraGeometrica { // public class FiguraGeometrica { NOS APARECIA EN ROJO, ENTONCES AGREGAMOS abstrac pq agregamos un metodo abstracto
    protected String tipoFigura;
    
    // Constructor
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    
    // Metodo abstracto
    public abstract void dibujar(); // Lo trabajamos de esta manera pq es un metodo abstracto, no usamos las llaves.
    
    
    //Agregamos getter and setter de tipo figura
    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    //Insertamos el metodo tostring

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + '}';
    }
   
   
}
