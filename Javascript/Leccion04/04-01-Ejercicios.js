//Clase 10:
//Ejercicio 1: Calcular estación del año
let mes = -1;
let estación;
if(mes === 1 || mes === 2 || mes === 12)
    estación = "Verano";
else if(mes === 3 || mes === 4 || mes === 5)
    estación = "Otoño";
else if(mes === 6 || mes === 7 || mes === 8)
    estación = "Invierno";
else if(mes === 9 || mes === 10 || mes === 11)
    estación = "Primavera";
else
    estación = "No hay un número de mes para el valor indicado.";
// Utilizamos la interpolación con comillas invertidas:
console.log(`El valor indicado corresponde a la estación de: ${estación} `);

//Utilizando la estructura switch para resolver el ejercicio 1:
switch(mes){
    case 1: case 2: case 12: 
        estación =  "Verano";
    break;
    case 3: case 4: case 5:
        estación = "Otoño";
    break;
    case 6: case 7: case 8:
        estación = "Invierno";
    break;
    case 9: case 10: case 11:
        estación = "Primavera";
    default:
        estación =  "No existente.";
}
console.log('Usando estructura switch e interpolación en Javascript');
console.log(`El valor indicado corresponde a la estación del año: ${estación}`);

//Ejercicio 2: Hora del día
//Como lo hice yo:
let hora = 23;
let mensajeSegunHora;
if (hora >= 6 && hora < 12) {
   mensajeSegunHora = "Buenos días";
} else if (hora >= 12 && hora < 18) {
   mensajeSegunHora = "Buenas tardes";
} else if (hora >= 18 && hora < 24) {
   mensajeSegunHora = "Buenas noches";
} else if(hora >= 0 && hora < 6 || hora == 24){
    mensajeSegunHora = "Deberías estar descansando!!";
}
 else {
    mensajeSegunHora = "Hora inválida";
}
console.log(mensajeSegunHora);
/* Utilizando la estructura switch */
switch (true) {  // Se prepara para validar en true, si ponemos hora como parametro tendremos que poner en caso de cada hora y seria un codigo muy extenso e innecesario
    case (hora >= 6 && hora < 12): // Evalua si hora es mayor o igual a 6 y menor a 12, en caso de ser true envia el mensaje "Buenos dias". En caso de ser false, sigue evaluando los demas casos.
        mensajeSegunHora = "Buenos días";
        break;
    case (hora >= 12 && hora < 18):
        mensajeSegunHora = "Buenas tardes";
        break;
    case (hora >= 18 && hora < 24):
        mensajeSegunHora = "Buenas noches";
        break;
    case (hora >= 0 && hora < 6 || hora == 24):
        mensajeSegunHora = "Deberías estar descansando!!";
        break;
    default:
        mensajeSegunHora = "Hora inválida";
}
console.log(`Mensaje utilizando la estructura switch: ${mensajeSegunHora}`);

//Planteo del ejercicio Profe Ariel:
let horaDia = 7;
let mensaje;
if(horaDia >= 6 && horaDia <= 11){
    mensaje = "Good morning";
}
else if(horaDia >= 12 && horaDia <= 16){
    mensaje = "Good afternoom";
}
else if(horaDia >= 17 && horaDia <= 19){
    mensaje = "Good evening";
}
else if(horaDia >= 20 && horaDia <= 23){
    mensaje = "Good night";
}
else{
    mensaje = "Valor incorrecto";
}
console.log(`Mensaje del ejercicio Profe Ariel: ${mensaje}`);

//Ampliando el uso de var let y const 
/*
Con var puedes reasignar en cualquier momento
éste forma parte del ambito global
Un error es que se sobreescriba 
*/
var nombre = 'Maria';
nombre = 'Ariel';
console.log(nombre);

function saludar(){
    var nombre = 'Natalia';
    console.log(nombre);
}
console.log(nombre); //Aquí no lee el dato en la función

if(true){
    var edad = 34;
    console.log(edad);
}
console.log(edad); //En la función funciono correctamente, en la estructura if fallo

/*
let: esta puede ser reasignada en cualquier momento 
la diferencia es que su ambito es de bloque,
solo disponible dentro de un bloque de llaves
o dentro de una función
*/

function saludar2(){
    let nombre2 = "Maria";
    console.log(nombre2);
}
//console.log(nombre2);

if(true){
    let edad2 = 33;
    console.log(edad2);
}
//console.log(edad2);

/*
const se utiliza para valores constantes que no pueden ser reasignadas
*/

const fechaNacimiento = 2015;
console.log(fechaNacimiento);
//fechaNacimiento = 2024;
//console.log(fechaNacimiento); //Solo se ejecuta el console anterior

