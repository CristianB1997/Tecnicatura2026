var nombre = 'Jose';
var apellido = ' Montes';
var nombreCompleto = nombre+' '+apellido;
console.log(nombreCompleto);
var nombreCompleto2 = 'Cristian'+' '+'Balmaceda';
console.log(nombreCompleto2);
var juntos = nombre + 219;//Lee de izquierda a derecha siguiendo la cadena lee el numero comp str
console.log(juntos);
juntos = nombre + 78 + 17;//Aqui se puede diferenciar a través de los paréntesis
console.log(juntos);
juntos = 78 + 17 + nombre;
console.log(juntos);


nombre += apellido; //Concatenamos usando el operador simplificado
console.log(nombre);