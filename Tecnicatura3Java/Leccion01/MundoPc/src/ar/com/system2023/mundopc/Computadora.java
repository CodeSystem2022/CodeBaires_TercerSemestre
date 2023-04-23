/*  clase computadora no se extiende de otra clase pero, utiliza internamente clases 
 */
package ar.com.system2023.mundopc;

public class Computadora { // no interactua con la clase dispositivo entrada.
// atributos
    private final int idComputadora; //
    private String nombre;
    private Teclado teclado; 
    private Raton raton;
    private Monitor monitor; //es la relacion de agregaron?, es decir que existen sin necesitad de objetos de tipo computadora 
    private static int contadorComputadoras; //
    
//constructor vacio
    private Computadora(){
        this.idComputadora = ++Computadora.contadorComputadoras; // con cada creacion de objeto y llamamos desde el this al preincremento
    }

//Constructor 2, con los parametros con permite crear objetos
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton){
        this (); //llamamos al constructor vacio
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }
    
//agregamos los metodos getters and setters
    public int getIdComputadora(){ //lo agremaos manualmente sin es seter pq no puede ser modificado al ser final.
        return idComputadora;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    
//agregamos el motodo toString, se imprime por completo un objeto computadora y al hacerlos los parametros llaman a su metodo
//To string nos muestra la relacion que hay entre los metodos
    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", teclado=" + teclado + ", raton=" + raton + ", monitor=" + monitor + '}';
    }
    
    
}
