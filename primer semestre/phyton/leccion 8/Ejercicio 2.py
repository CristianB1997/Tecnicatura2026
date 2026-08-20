#Ejercicio 2:
# Calcular la suma de "N" primeros números.
'''
num1 = int(input('Ingrese un número: '))
num2 = int(input('Ingrese el segundo número: '))
resultado = num1 + num2
print(f'El resultado de la suma es: ', resultado)
'''

suma = 0

for i in range(2):
    numero = int(input("Digite un numero: "))
    suma = suma + numero

print("La suma es:", suma)
