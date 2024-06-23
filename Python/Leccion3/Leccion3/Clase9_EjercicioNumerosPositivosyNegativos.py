"""
Ejercicio 3: Leer 10 números e imprimir cuantos son positivos, cuantos negativos
y cuantos neutros.
"""
conteo_positivos = 0
conteo_negativos = 0
conteo_neutros = 0

for i in range(10):
    num = int(input(f"{i}. Digite un número: "))
    if num == 0:
        conteo_neutros += 1
    elif num > 0:
        conteo_positivos += 1
    else:
        conteo_negativos += 1
print(f"""
        La cantidad de positivos es: {conteo_positivos}
        La cantidad de negativos es: {conteo_negativos}
        La cantidad de neutros es: {conteo_neutros}
""")
