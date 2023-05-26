//let persona3 = new Persona('Carla', 'Ponce');// NO SE PUEDE HACER: Persona is not defined. 

class Persona{ //Clase padre

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
   //  Cramos el metodo get y set para apellido 
    get apellido(){ 
        return this._apellido;
    }

    set apellido(apellido){
        this._apellido=apellido;
    }
    // Metodo nombreCompleto 
    nombreCompleto(){
        return this._nombre+' '+this._apellido;  
    }
}

class Empleado extends Persona{// Clase hija 
    constructor(nombre, apellido, departamento){
        super(nombre, apellido);
        this._departamento = departamento;
    }
    get departamento(){
        return this._departamento;
    }
    set departamento(departamento){
        this._departamento = departamento;
    }
}
    


let persona1 = new Persona("Martin","Perez");    // creo OBJETO persona1 y persona2 con el metodo constructor de la clase Persona que me pide los 2 atributos como parametros
console.log(persona1);
console.log(persona1.nombre);
persona1.nombre='Juan Carlos';
console.log(persona1.nombre);
persona1.apellido="Rodriguez";
console.log(persona1)

let persona2 = new Persona('Carlos','Lara');     
console.log(persona2.nombre);
persona2.nombre='Maria Laura';
console.log(persona2.nombre);
persona2.apellido = "Juarez";
console.log(persona2);

let empleado1 = new Empleado('Maria', 'Gimenez', 'Sistemas');
console.log(empleado1);
console.log(empleado1.nombre);

console.log(empleado1.nombreCompleto()); //la clase hija heredo el metodo nombreCompleto 


