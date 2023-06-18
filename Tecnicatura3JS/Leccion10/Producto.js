class Producto {
    static contadorProductos = 0;      // atributo estatico 
    constructor (nombre, precio) {
        this._idProducto = ++Producto.contadorProductos;  // llamo al atributo desde la clase Producto
        this._nombre = nombre;                            // (en lugar desde el objeto) ya que se trata de un atributo estatico
        this._precio = precio;


    }

    get idProducto (){
        return this._idProducto;
    }

    get nombre (){
        return this._nombre;
    }
    set nombre(nombre){
        this._nombre = nombre;
    }

    get precio(){
        return this._precio;
    }
    set precio (precio){
        this._precio = precio;
    }

    toString(){  // Template Literals: nos permite insertar codigo dinamicamnete
        return `idProducto : ${this._idProducto}, nombre: ${this._nombre}, precio: ${this._precio}`
    }
}// fin de la clase producto


let producto1 = new producto('pantalon', 200);
let producto2 = new producto('camisa', 150);
console.log(producto1.toString());
console,log(producto2.toString());


