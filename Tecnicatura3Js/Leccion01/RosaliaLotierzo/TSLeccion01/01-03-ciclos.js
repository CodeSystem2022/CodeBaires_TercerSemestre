//Ciclo while
let contador = 0;
while(contador < 3){
    console.log(contador);
    contador++; //Para que no sea un ciclo infinito
}
console.log("Fin del ciclo while");

//Ciclo do while (el codigo dentro del bloque se va a ejecutar primero y luego va a revisar la condicion)
let conteo = 0;
do{
    console.log(conteo);
    conteo++;    
}while(conteo < 3);
console.log("Fin del ciclo do while");

//Ciclo for
for(let contando = 0; contando < 3; contando++){
    console.log(contando)
}
console.log("Fin del ciclo for");

//Palabra reservada 'break'
for(let contando = 0; contando <= 10; contando++){
    if(contando % 2 == 0){
        console.log(contando);
        break; //Va a mostrar solo el primer numero par y va a romper el ciclo
    }
}
console.log("Termina el ciclo al encontrar los pares");

//Palabra reservada 'continue' y etiquetas labels
inicio:
for(let contando = 0; contando <= 10; contando++){
    if(contando % 2 !== 0){
        continue inicio; //Se va a ejecutar la siguiente iteración del ciclo
    }
    console.log(contando);
}
console.log("Termina el ciclo");


