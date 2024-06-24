/* Guillermo tiene N dólares. Luis tiene la mitad de lo que posee Guillermo.
Juan tiene la mitad de lo que poseen Luis y Guillermo juntos. Hacer un programa
que calcule e imprima la cantidad de dinero que tienen entre los tres.
Crear un nuevo proyecto llamado Ejercicio6
* */
package Clase9_Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float guillermo,luis,juan,sumDinero;
        System.out.println("Ingrese la cantidad de dinero que posee Guillermo: ");
        guillermo = Float.parseFloat(entrada.nextLine());
        luis = guillermo / 2;
        juan = (luis + guillermo) / 2;
        sumDinero = guillermo + luis + juan;
        System.out.println("La suma de dinero que tienen entre los tres es de: $" + sumDinero);
    }
}
