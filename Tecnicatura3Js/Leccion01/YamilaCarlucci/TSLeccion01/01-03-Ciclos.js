//While
let contador = 0;
while(contador < 3){
    console.log(contador);
    contador ++;
}
console.log("Fin del ciclo While");

//doWhile
let conteo = 0;
do{
    console.log(conteo);
    conteo ++;
} while(conteo < 3)
console.log("Fin del ciclo DoWhile");

//for
for(let contando = 0; contando < 3; contando ++){
    console.log(contando);
}
console.log("Fin del ciclo For");

//Palabra reservada Break
for(let contando = 0; contando <= 10; contando ++){
    if(contando % 2 == 0){
        console.log(contando); //Muestra todos los pares
        break;
    }
}
console.log("Fin del ciclo de encontrar los pares");

//Palabra reservada Continue y Labels
inicio:
for(let contando = 0; contando <= 10; contando ++){
    if(contando % 2 !== 0){
        continue inicio; //Ir a la siguiente iteración
    }
    console.log(contando); 
}
console.log("Fin del ciclo");



