"""
Ejercicio 3: Calcular estación del año
Pedir al usuario que ingrese un mes del año, el valor debe ser entre
1 y 12, luego le decimos en que estación del año esta:
Verano --> 21/12 al 21/03 1,2,3
Otoño --> 21/03 al 21/06 4,5,6
Invierno --> 21/06 al 21/09 7,8,9
Primavera --> 21/09 al 21/12 10,11,12
En el ejercicio utilizo None: esto indica que la variable aun no tiene
asignado un valor. (esta vacía) Este None es el equivalente a null en
otros lenguajes de programación como Java
"""
mes = int(input("Digite un mes del año (1 - 12): "))
estacion = None
if mes == 1 or mes == 2 or mes == 3:
    estacion = "Verano"
elif mes == 4 or mes == 5 or mes == 6:
    estacion = "Otoño"
elif mes == 7 or mes == 8 or mes == 9:
    estacion = "Invierno"
elif mes == 10 or mes == 11 or mes == 12:
    estacion = "Primavera"
else:
    estacion = "no existente para ese número - mes"
print(f"Para el mes {mes} la estación es {estacion}")











