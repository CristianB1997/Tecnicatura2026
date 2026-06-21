"""
Ejercicio 1

Solicitamos que el usuario ingrese un número
este se le asigna una variable
Utilizaremos la estructura "if else"
formula <num>%2==0. Esta operacion nos dice si es numero
par.
Si es True imprimimos que es par.
Si es false imprimimos que es impar.
A hacer el ejercicio en PyCharm.
"""

a = int(input("Digite un numero: "))
print(f"El residuo de la división es: {a % 2}")
if a % 2 == 0:
    print(f"El valor de a es: {a} es un número PAR")
else:
    print(f"El valor de a es: {a} es un número IMPAR")






