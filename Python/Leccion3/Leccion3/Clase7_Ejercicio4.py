"""
Ejercicio 4: Etapas de vida
Haremos un programa que cuando el usuario ingrese su edad le diga,
o imprima la etapa de su vida en una breve oración:
0 a 10 = La infancia es increíble y bella
10 a 19 = Tienes muchos cambios, mucho que estudiar
20 a 29 = Amor y comienza el trabajo
Para las siguientes etapas, deberás completarlo
"""
edad = int(input("Digite su edad: "))
mensaje = None
if 0 <= edad < 10:
    mensaje = "La infancia es increíble y bella"
elif 10 <= edad < 20:
    mensaje = "Tienes muchos cambios, mucho que estudiar"
elif 20 <= edad < 30:
    mensaje = "Amor y comienza el trabajo"
elif 30 <= edad < 40:
    mensaje = "No te haces mayor, te haces mejor"
elif 40 <= edad < 50:
    mensaje = "Disfruta más de tu familia y deja de lado un poco el trabajo"
elif 50 <= edad < 60:
    mensaje = "Ya es hora de descansar y disfrutar la vida"
elif 60 <= edad < 70:
    mensaje = "Se vienen los nietos, deja de renegar y disfruta cada momento compartido"
elif 70 <= edad < 80:
    mensaje = "La vejez no es una carga, es una oportunidad para compartir la sabiduría"
elif 80 <= edad < 90:
    mensaje = "No importan los años de tu vida, lo que importa es la vida de tus años"
elif 90 <= edad < 100:
    mensaje = "Woow tu si que disfrutas la vida!"
else:
    mensaje = "Haz ingresado una edad que no existe en el sistema."
print(f"Tu edad es {edad} años, {mensaje} ")