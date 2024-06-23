"""
Ejercicio 3:
Intercambiar el valor de dos variables.
Por ejemplo:
a = 10 --> a = 5
b = 5 ---> b = 10
"""
a = int(input("Digite el valor de a: "))
b = int(input("Digite el valor de b: "))
aux = a
print(f"El valor de a es: {a} y el valor de b es: {b}")
a = b
b = aux
print(f"El valor nuevo de a es: {a} y el valor nuevo de b es: {b}")