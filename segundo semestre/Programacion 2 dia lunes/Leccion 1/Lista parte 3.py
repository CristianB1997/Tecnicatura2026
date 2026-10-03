#Asi recuperamos un rango de la lista#
nombres = ['Naty','Osvaldo','Ariel','Cristian']
print(nombres)
print(len(nombres)) # Le pasamos como parametro la lista.
nombres.append('Marcelo')
print(nombres)
# Asi se agrega un elemento, el cual se desplaza hacia
#la última posición de la fila

#Ahora se va a insertar un elemento en un índice específico

nombres.insert(1,'Alberto')
print(nombres)
nombres.insert(3,'Mariana')
print(nombres)
nombres[0] = 'Natalia'
print(nombres)
# Ahora asi se elimina un elemento de la lista.
nombres.remove('Alberto')
print(nombres)

#Ahora vamos a eliminar el último elemento de la fila.
nombres.pop()
print(nombres)
#Ahora eliminamos un índice específico

del nombres[2]
print(nombres)

# Eliminar, borrar o limpiar todos los elementos de la lista.
nombres.clear()
print(nombres)

# Ahora eliminamos la lista
del nombres
print(nombres) #Aqui nos mostrara un error por que
# la lista fue borrada por completo.







