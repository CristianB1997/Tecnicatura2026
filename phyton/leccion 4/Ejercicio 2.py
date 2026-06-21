"""
Ejercicio 2

Pedir un número al usuario
Almacenar el valor en una variable
Usar la estructura "if else"
La formula es: <num>>=18
True: Eres mayor de edad, Imprimir
False: Eres menor de edad, Imprimir
Hacer el ejercicio en PyCharm
"""

edadAdulto = 18
edadPersona = int(input("Ingrese su edad: "))
if edadPersona >= edadAdulto:
    print(f"Su edad es {edadPersona} años, usted es Mayor de edad")
else:
    print(f"Su edad es {edadPersona} años, usted es Menor de edad")

