"""
Ejercicio: Rectángulo
Se solicita calcular el área y el perímetro de un rectangulo.
Para ello debemos crear las siguientes variables
alto(int)
ancho(int)
El usuario debe proporcionar los valores de alto y ancho,
despues se debe imprimir el resultado en el siguiente formato:
Proporciona el alto del rectángulo: 5
Proporciona el ancho del rectángulo: 3
Área: 15
Perímetro: 16
Las fórmulas para calcular el área y el perímetro son:
Área: alto*ancho
Perímetro:(alto+ancho)*2
"""
alto = int(input('Proporciona el alto del rectangulo: '))
ancho = int(input('Proporciona el ancho del rectangulo: '))
area = alto * ancho
perimetro = (alto + ancho) * 2
print("Area: ", area)
print("Perimetro: ", perimetro)





