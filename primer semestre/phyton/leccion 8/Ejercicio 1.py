'''
Ejercicio 1:
Diseñar un programa que ingresando un año, nos devuelva por consola
si es un año bisiesto o no, repetir la acción hasta que el usuario lo decida.
'''

opcion = 1
anio: 1
while opcion == 1:
    anio = int(input("Digite el año que quiere consultar: "))
    if anio % 4 == 0 and anio % 100 != 0 or anio % 400 == 0:
        print(f'El año {anio} Si es un año bisiesto')
    else:
        print(f'El año {anio} No es un año bisiesto')
