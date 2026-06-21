'''
Ejercicio 2: Operador Or

La pregunta es si un padre puede asistir al juego de su hijo.

1. Verificamos si tiene vacaciones.
2. Verificamos si tiene el dia libre.
3 Usar estructura 'if else' conel operador Or
4. Imprimir el resultado
'''
# Ejercicio con el operador or , Operador not
vacaciones = False
diaDescanso = False
if not (vacaciones or diaDescanso): # El "not" cambia la logica del ejercicio
    print('Tiene trabajo que hacer')
else:
    print('Puede asistir al juego')
