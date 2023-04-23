/*1.1 Diagrama de Clase UML para este laboratorio: Tienen como tarea hacer este diagrama en VSC, aquí es donde creamos la clase padre DispositivoEntrada

 */
package ar.com.system2023.mundopc;

//Clase padre de dispositivo entrada
public class DispositivoEntrada {
    private String tipoEntrada; // creamos todos los atrivutos
    private String marca;
    
    //Constructor
    public DispositivoEntrada(String tipoEntrada, String marca){
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
        
    }
    
    //agremaos los get y set de todos
    public String getTipoEntrada() {
        return this.tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return this.marca; //porque agregamos el this ? es para entender q apunte a la marca 
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    //agregamos el to string desde Insert Code
    @Override
    public String toString() {
        return "DispositivoEntrada{" + "tipoEntrada=" + tipoEntrada + ", marca=" + marca + '}';
    }
    
    
}
