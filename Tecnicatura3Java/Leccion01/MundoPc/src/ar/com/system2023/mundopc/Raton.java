/*creamos  
1.2 Creamos la clase hija Raton y la clase Teclado
 */
package ar.com.system2023.mundopc;

public class Raton extends DispositivoEntrada {
    private final int idRaton;
    private static int contadorRatones;
    

    public Raton(String tipoEntrada, String marca) { // invocamos al constructir
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones; // ++pre incremento.
    }
    
    // insertamos la insformacion de la clase padre
    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton +", "+super.toString()+  '}';
    }
    

}
