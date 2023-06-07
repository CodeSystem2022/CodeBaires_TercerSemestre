//let persona3 = new Persona('Carla', 'Ponce');// NO SE PUEDE HACER: Persona is not defined.

class Persona{ //Clase padre

    static contadorObjetosPersona = 0;  //Atributo Estatico (se relaciona con la CLASE no con el objeto)
    email = 'Valor default email';      // Atributo NO Estatico (se relaciona con el objeto)

    constructor(nombre, apellido){      //Creo constructor y paso como parametros ambos atributos: nombre y apellido
        this._nombre = nombre;          // escribo _nombre, _apellido para diferenciar el ATRIBUTO o PROPERTY(propiedad)
        this._apellido = apellido;      // del metodo get y set que luego creare, en javascript no pueden llevar el mismo nombre (como en java)
        Persona.contadorObjetosPersona++;
        console.log('Se incrementa el contador: '+Persona.contadorObjetosPersona);
    }

    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre=nombre;
    }
   //  Creamos el metodo get y set para apellido
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
    //sobre escribiendo el método de la clase padre (object)
    toString(){// Regresa un String
        //se aplica el polimorfismo que significa = multples formas en tiempo de ejecucion
        // El metodo que se ejecuta depende si es una referencia de tipo padre o hija
        return this.nombreCompleto();
    }

    static saludar(){
        console.log("Saludos desde este método static");
    }

    static saludar2(persona){
        console.log(persona.nombre + ' ' + persona.apellido);

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

    //Sobreescritura
    nombreCompleto(){
       return super.nombreCompleto()+', '+this._departamento;
    }

}


let persona1 = new Persona("Martin","Perez");    // creo OBJETO persona1 y persona2 con el metodo constructor de la clase Persona que me pide los 2 atributos como parametros
//console.log(persona1);
//console.log(persona1.nombre);
persona1.nombre='Juan Carlos';
//console.log(persona1.nombre);
persona1.apellido="Rodriguez";
//console.log(persona1)

let persona2 = new Persona('Carlos','Lara');
//console.log(persona2.nombre);
persona2.nombre='Maria Laura';
//console.log(persona2.nombre);
persona2.apellido = "Juarez";
//console.log(persona2);

let empleado1 = new Empleado('Maria', 'Gimenez', 'Sistemas');
console.log(empleado1);
console.log(empleado1.nombre);


//Object.prototype.toString Esta es la manera de acceder a atributos y métodos de manera dinamica
console.log(empleado1.toString());
console.log(persona1.toString());

//persona1.saludar(); no se utiliza desde el objeto
Persona.saludar();
Persona.saludar2(persona1);

Empleado.saludar();
Empleado.saludar2(empleado1);


//Atributo no estatico puedo acceder desde el objeto, tanto de la clase padre como hija
console.log(persona1.email);
console.log(empleado1.email);
console.log(Persona.email);   //NO se puede acceder directamente desde la clase

//console.log(persona1.contadorObjetosPersona); undefined
console.log(Persona.contadorObjetosPersona); 5
console.log(Empleado.contadorObjetosPersona); 5