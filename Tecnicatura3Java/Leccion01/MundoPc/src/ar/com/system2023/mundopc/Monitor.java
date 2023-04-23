/*
 */
package ar.com.system2023.mundopc;

public class Monitor {
// Creamos los atributos de la clase monitor
    private final int idMonitor; // mientras no este cargado el constructor nos aparece resaltado en rojo
    private String marca;
    private double tamanio;
    private static int contadorMonitores;
    
//Creamos el construcor vacio de forma privada
    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitores;//desde el id.monitor lo llamamos apra hacer el incremento
    }   
    
    
//Creamos el constructor publico , porque lo hacemos ?
    public Monitor(String marca, double tamanio){
        this(); // llamado al constructor vacio
        this.marca = marca;
        this.tamanio = tamanio;
        
    }
    
//Agregamos los getter and setter
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    
//Ingresamos manualmente el getIdMonitor
    public int getIdMonitor(){
        return this.idMonitor;
    }
    
//agregamos el toString
    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }
    
   
}
