'''
# Clase 2
miVariable = 3  # Al ser varibles dinamicas, no hace falta poner el tipo de
print(miVariable)  # variable
miVariable = "Hola a todos los alumnos de la tecnicatura"
print(miVariable)
miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x + y
print(id(x))

# Las literales se escriben x528 (son las direcciones de memoria), la variable y = x272, la variable z = x592
# cuando se ejecuta el programa, tiene ese valor pero al finalizar la ejecucion
# se borra y cambia por otro valor en la literal -- Referencia de memoria.

# a: str = "Hola alumnos" #Referencias del tipo de dato
# a = 10.78
# print(type(a)) #Para imprimir el tipo de dato
# a = True #False, valores boolean primera letra mayúsc.

# Clase 3
# Tipos int, float, String, Bool
x = 10
print(x)
print(type(x))
x = 14.5
print(x)
print(type(x))
x = "Hola alumnos"
print(x)
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(x)
print(type(x))

# Manejo de cadenas (String)

miGrupoFavorito = "Airbang:"
caracteristicas = "Rata Blanca"
print("Mi grupo favorito es:", miGrupoFavorito, caracteristicas)

numero1 = "7"  # Los datos aqui tienen que ser numeros para poder parsearlo a int sino arroja error
numero2 = "8"
print(int(numero1) + int(numero2))

# Tipos booleanos (bool)
miBooleano = 3 > 2
print(miBooleano)

if miBooleano:
    print("El resultado es verdadero")
else:
    print("El resultado es falso")
# Hasta aqui hemos procesado codigo duro (sin entrada del usuario)

# Procesar la entrada del usuario
# Función input
# resultado = input("Digite un numero: ")  # Regresa un dato tipo string
# print(resultado)

# Conversión de la entrada de datos
numero1 = int(input("Escribe el primer numero: "))
numero2 = int(input("Escribe el segundo numero: "))
resultado = numero1 + numero2
print("El resultado de la suma es: ", resultado)
'''

# Clase 4


















