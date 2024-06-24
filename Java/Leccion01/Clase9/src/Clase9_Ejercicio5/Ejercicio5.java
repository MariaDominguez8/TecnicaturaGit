/* Hacer un programa que calcule e imprima la suma de tres calificaciones.
* Pedir las calificaciones al usuario, crear un proyecto nuevo llamado Ejercicio5
* */
package Clase9_Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float calificacion1, calificacion2,calificacion3,sumaCalificaciones;
        System.out.println("Ingrese la calificación 1: ");
        calificacion1 = Float.parseFloat(entrada.nextLine());
        System.out.println("Ingrese la calificación 2: ");
        calificacion2 = Float.parseFloat(entrada.nextLine());
        System.out.println("Ingrese la calificación 3: ");
        calificacion3 = Float.parseFloat(entrada.nextLine());

        sumaCalificaciones = calificacion1 + calificacion2 + calificacion3;
        System.out.println("La suma de todas las calificaciones es: " + sumaCalificaciones);

    }
}
