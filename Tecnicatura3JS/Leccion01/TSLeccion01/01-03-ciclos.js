//ciclo WHILE

let contador=0;
while (contador<3){
    console.log(contador);
    contador++;
}
console.log('Fin del ciclo while');

//CICLO DO WHILE (primero ejecuta 1 vez en do, y luego revisa la condicion del while)
let conteo= 0;
do {
    console.log(conteo);
    conteo++;
}
while (conteo<3);

console.log('Fin del ciclo do-while')

//ciclo for
for(let contando=0;contando<3;contando++){
    console.log(contando);
}

console.log('Fin del ciclo for')

//Palabra reservada break (voy a imprimir los numeros pares de 0 a 10)con BREAK imprimo primer n par
for(let contando=0;contando<=10;contando++){
    if (contando%2==0){
            console.log(contando);
            break
    }

}

console.log('Termina ciclo alencontrar el primer numero par')


//Palabra continue (pregunto si la palabra no es par, si no lo es, paso a la siguiente iteracion)

for(let contando=0;contando<=10;contando++){
    if (contando%2!=0){
            continue; //continua a la siguiente iteracion
    }
    console.log(contando)
}


//Etiquetas labels (me permite ir a una parte de mi programa que desee NO RECOMENDADA)
inicio:
for(let contando=0;contando<=10;contando++){
    if (contando%2!=0){
            continue inicio; //continua a la siguiente iteracion
    }
    console.log(contando)
}
