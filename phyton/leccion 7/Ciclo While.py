# Ciclo While (Mientras o durante)

# Esta parte, al no tener una condición o un final, se ejecuta infinitamente.
#condicion = True
#while condicion:
#    print('Ejecutando el ciclo while')
#else:
#    print('Fin del ciclo while')


# De esta manera se ejecuta con un principio, que es el 0,
# y frena llegando al final del contador, en este caso al empezar desde 0, finaliza en 77.
contador = 0
while contador < 78:
    print('Ejecutando el ciclo while', contador)
    contador += 1
else:
    print('Fin del ciclo while')
