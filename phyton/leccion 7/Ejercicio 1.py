'''
Ejercicio 1: Calcular estación del año

pedir al usuario que ingrese un mes del año, el valor debe ser entree 1 y 12,
luego le decimos en que estación esta:

VERANO:           OTOÑO           INVIERNO         PRIMAVERA
21/12 al 21/03   21/03 al 21/06   21/06 al 21/09   21/09 al 21/12
1,2,3            4,5,6            7,8,9            10,11,12
'''
mes = int(input('Digite un mes del año (1 - 12): '))
estacion = None
if mes == 1 or mes == 2 or mes == 3:
    estacion = 'Verano'
elif mes == 4 or mes == 5 or mes == 6:
    estacion = 'Otoño'
elif mes == 7 or mes == 8 or mes == 9:
    estacion = 'Invierno'
elif mes == 10 or mes == 11 or mes == 12:
    estacion = 'Primavera'
else:
    estacion = 'Error, no hay número para este mes'
print(f'Para el mes {mes} la estación es: {estacion}')

# en el ejercicio se utilizo el None: indica que la variable aun no tiene asignado
# valor(esta vacía), el None es equivalente a null en otros lenguajes como Java.





