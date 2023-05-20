    

class Persona{

    constructor(nombre, apellido){      //Creo constructor y paso como parametros ambos atributos: nombre y apellido
        this._nombre = nombre;          // escribo _nombre, _apellido para diferenciar el ATRIBUTO o PROPERTY(propiedad)
        this._apellido = apellido;      // del metodo get y set que luego creare, en javascript no pueden llevar el mismo nombre (como en java)
    }
  
    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre=nombre;
    }
}

let persona1 = new Persona("Martin","Perez");    // creo OBJETO persona1 y persona2 con el metodo constructor de la clase Persona que me pide los 2 atributos como parametros
console.log(persona1.nombre);
persona1.nombre='Juan Carlos';
console.log(persona1.nombre);
//console.log(persona1);

let persona2 = new Persona('Carlos','Lara');     
console.log(persona2.nombre);
persona2.nombre='Maria Laura';
console.log(persona2.nombre);
//console.log(persona2);