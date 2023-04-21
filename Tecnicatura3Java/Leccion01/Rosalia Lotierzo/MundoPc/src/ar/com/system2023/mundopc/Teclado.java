package ar.com.system2023.mundopc;

public class Teclado extends DispositivoEntrada{
    //Atributos
    private final int idTeclado; 
    private static int contadorTeclados;
    
    //Constructor
    public Teclado(String tipoEntrada, String marca) {
        //Llama a la clase padre a traves del super
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado +", "+super.toString()+ '}';
    }
}
