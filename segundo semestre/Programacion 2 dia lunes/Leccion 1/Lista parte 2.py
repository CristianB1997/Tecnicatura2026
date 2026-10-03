#Asi recuperamos un rango de la lista#
nombres = ['Naty','Osvaldo','Ariel','Cristian']
print(nombres)

print(nombres[0:2])
# Solo muestra el indice 0, 1 pero no el indice 2
# Ahora va a ir del inicio de la lista al indice (sin incluirlo)
print(nombres[:3]) #Indices a mostrar 0, 1, 2
#Desde el indice indicado hasta el final

print(nombres[1: ])
# Ahora vamos a modificar el valor dentro de la lista

nombres[3] = 'Liliana'
nombres[2] = 'Mariana'
nombres[0] = 'Natalia'
print(nombres)

# Ahora vamos a iterar un nombre en nuestra lista.
for nombres in nombres: # La primer variable, el nombre es singular, la lista es plural.
    print(nombres)
else:
    print('Se acabaron los elementos de la lista')

