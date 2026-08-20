"""
Ejercicio 1: Valor dentro de un rango

1. Pedimos al usuario un valor numérico
2. Verificar si el valor ingresado se encuentra entre el rango de 0 a 5.
3. La formula es: <num> >=0 and <num> <=5.
"""

valor = int(input("Digite un número dentro del rango 0 al 5: "))
valorMinimo = 0
valorMaximo = 5
dentroRango = valor >= valorMinimo and valor <= valorMaximo #Se esta usando el operador "And"
if dentroRango:
    print(f' El valor {valor} esta dentro del rango')
else:
    print(f' El valor {valor} No esta dentro del rango')


