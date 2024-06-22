"""
Diseñar un programa que ingresando un año, nos devuelva por consola
si es un año bisiesto o no, repetir la acción hasta que el usuario
lo desida.
"""
print("Comprobamos que año es bisiesto")
opcion = 1

while not(opcion != 1):
    num = int(input("Ingrese un año: "))
    if (num % 4 == 0) and (num % 100 != 0) or (num % 400 == 0):
        print("El año es Bisiesto")
    else:
        print("El año no es Bisiesto")
    opcion = int(input("Para seguir adelante digite la opción 1: "))
