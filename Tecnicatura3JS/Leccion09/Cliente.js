class Cliente extends Persona{
    static contadorClientes = 0;

    constructor(nombre, apellido, edad, fecharesgistro){
        super(nombre, apellido, edad);
        this._idCliente = ++Cliente.contadorClientes;
        this._fecharesgistro = fecharesgistro;
    }
    get idCliente(){
        return this._idCliente;
    }
    get fecharesgistro(){
        return this._fecharesgistro
    }
    set fecharesgistro(fecharesgistro){
        this._fecharesgistro = fecharesgistro;
    }
    toString(){
        return super.toString()+' '+this._idCliente+' '+this._fecharesgistro;
    }
}