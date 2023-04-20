package ar.com.system2023.mundopc;

public class Monitor {
    //Atributos
    private final int idMonitor; //final = variable constante
    private String marca;
    private double tamanio;
    private static int contadorMonitores;
    
    //Constructor vacio lo creamos de manera privada
    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    
    //Constructor publico
    public Monitor(String marca, double tamanio) {
        this(); //Llamado al constructor vacio
        this.marca = marca;
        this.tamanio = tamanio;
    }
    
    //Getters and Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    
    //Ingresamos manualmente el getIdMonitor
    public int getIdMonitor() {
        return this.idMonitor;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }    
}
