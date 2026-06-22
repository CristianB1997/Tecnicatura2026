'''
Ejercicio 5: Sistema de calificaciones

El objetivo del programa será crear un sistema de calificaciones
 de la siguiente manera :
 Le pedimos al usuario que ingrese un valor del 0 al 10.

 Luego si ingreso 9 a 10 imprimimos A.
 Entre 8 y menor a 9 imprimimos B.
 Entre 7 y menor a 8 imprimimos C.
 Entre 6 y menor a 7 imprimimos D.
 Entre 0 y menor a 6 imprimimos F.

 De lo contrario el valor ingresado es incorrecto.
'''
calificacion = int(input('Digite su calificación entre 0  y 10: '))
if 9 <= calificacion <= 10:
    print('A')
elif 8 <= calificacion <= 9:
    print('B')
elif 7 <= calificacion <= 8:
    print('C')
elif 6 <= calificacion <= 7:
    print('D')
elif 0 <= calificacion <= 6:
    print('F')
else:
    print('Valor ingresado, es incorrecto')



