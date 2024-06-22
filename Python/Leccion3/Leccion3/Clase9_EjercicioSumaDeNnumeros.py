"""
Ejercicio: Calcular la suma de "N" primeros números.
"""
n = int(input("Digite la cantidad de numeros a sumarse: "))
suma = 0
for i in range(n+1): # n + 1 no tiene en cuenta al 0.
    suma += i
else:
    print(f"La suma es: {suma}")