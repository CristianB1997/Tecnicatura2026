'''
Dadas las horas trabajadas de 5 personas y la tarifa de pago, calcular el salario,
y la sumatoria de todos los salarios.
'''
suma = 0

for i in range(1, 6):

    print("Salario del empleado", i)

    horas = int(input("Digite las horas trabajadas: "))
    tarifa = float(input("Digite la tarifa por hora: "))

    salario = horas * tarifa

    print("El salario es: $", salario)

    suma = suma + salario

print("La suma de todos los salarios es:", suma)