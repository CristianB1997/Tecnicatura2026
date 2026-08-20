'''
Ejercicio 3:
Leer 10 números e imprimir cuantos son positivos, cuantos son negativos,
 y cuantos son néutros.
'''
conteo_positivos = 0
conteo_negativos = 0
conteo_neutros = 0

for i in range(1, 11):

    num = int(input(f"{i}. Digite un número: "))

    if num > 0:
        conteo_positivos = conteo_positivos + 1

    elif num < 0:
        conteo_negativos = conteo_negativos + 1

    else:
        conteo_neutros = conteo_neutros + 1

print("Cantidad de positivos:", conteo_positivos)
print("Cantidad de negativos:", conteo_negativos)
print("Cantidad de neutros:", conteo_neutros)