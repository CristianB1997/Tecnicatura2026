'''
Ejercicio 5:
Calcular el factorial de un número mayor o igual a 0.
'''
num = int(input("Digite un número: "))

# Inicializar el factorial
factorial = 1

# Calcular el factorial
for i in range(1, num + 1):
    factorial = factorial * i

# Mostrar el resultado
print("El factorial es:", factorial)


