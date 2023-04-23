/* Creamos la clase Teclado
 */
package ar.com.system2023.mundopc;

public class Teclado extends DispositivoEntrada { //extension a la clase padre
    private final int idTeclado;
    private static int contadorTeclados;
    

    public Teclado(String tipoEntrada, String marca) { // invocamos al constructir
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados; // ++pre incremento.
    }
    
    // insertamos la insformacion de la clase padre
    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idTeclado +", "+super.toString()+  '}';
    }
}
