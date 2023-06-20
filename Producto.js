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

class Orden{
    static contadorOrdenes = 0;
    static getMAX_PRODUCTOS(){
        return 5;
    }

    constructor(){
        this._idOrden = ++Orden.contadorOrdenes;
        this._productos = [];
        this._contadorProductosAgregados = 0;
    }

    get idOrden(){
        return this._idOrden;
    }

    agragarProducto(producto){
        if(this._productos.length < Orden.getMAX_PRODUCTOS()){
            this._productos.push(producto); // tenemos dos tipos de sintaxis : 1
            //this._productos[this._contadorProductosAgregados++] = producto; // segunda sintaxis
        }
        else{
            console.log('No se puede agragar mas productos');
        }
    }// Fin del metodo agregarProducto

    calcularTotal(){
        let totalVenta = 0;
        for(let producto of this._productos) {
            totalVenta+= producto.precio;
        }//Fin ciclo for
        return totalVenta;
    }//Fin de la clase Orden

    mostrarOrden(){
        let productoOrden = ' ';
        for(let producto of this._productos){
            productosOrden +=producto.toString()+' ';
        } //Fin del ciclo for
        console.log('Orden: ${this._idOrden}, Total: $${this.calcularTotal()}, Productos: ${productosOrden}');
    }//Fin Metodo mostrarOrden
}// Fin de la clase Orden

       
}


let producto1 = new producto('pantalon', 200);
let producto2 = new producto('camisa', 150);
console.log(producto1.toString());
console,log(producto2.toString());


