'''
Ejercicio 2: Etapas de Vida
Se debe hacer un programa que cuando el usuario ingrese su edad
le diga o imprima la etapa de su vida en una breve oración:

0 a 10 = La infancia es increible y bella.
10 a 19 = Tienes muchos cambios, mucho que estudiar.
20 a 29 = Amor y comienza el trabajo.
'''
edad = int(input("Digite su edad: "))
mensaje = None
if 0 <= edad < 10:
    mensaje = 'La infancia es increible y bella.'
elif 10 <= edad < 20:
    mensaje = 'Tienes muchos cambios, mucho que estudiar.'
elif 20 <= edad < 30:
    mensaje = 'Amor y comienza el trabajo.'
    #Se agregaron más edades
elif 30 <= edad < 40:
    mensaje = 'El aprendizaje y trabajo duro, dan sus primeros frutos'
elif 40 <= edad < 50:
    mensaje = 'Madurez y sabiduria, van de la mano'
elif 50 <= edad < 60:
    mensaje = 'Las canas te sientan muy bien'
else:
    mensaje = ' Error, etapa de la vida no reconocida'
print(f'Tu edad es: {edad}, {mensaje} ')


