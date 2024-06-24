import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola mundo desde Java");

       /* int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        //Tipo String
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en programación";
        System.out.println(miVariableCadena);*/

        // Var - interencia de tipos en Java
       /* var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2" + miVariableEntera2);
        System.out.println("miVariableCadena2 =" + miVariableCadena2);
        //Reglas para definir una variable en Java


        var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var a = 8;
        var b = 4;
        System.out.println(usuario+ (a + b));
        //Ejercicio: Caracteres Especiales con Java
        var nombre = "Natalia";
        System.out.println("Nueva linea \n" + nombre); //Diagonal inversa y letra n
        System.out.println("Tabulador: \t" + nombre); // Tabulador un espacio para centrar
        System.out.println("\t\t.:MENÚ:.");
        System.out.println("Retroceso: \b\b" + nombre); //Caracter de Retroceso
        System.out.println("Comillas simples: \'" + nombre + "\'");
        System.out.println("Comillas Dobles: \"" + nombre + "\"");

        //Clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: " + titulo2 +" "+ usuario2);

        //Ejercicio Detalles Libro
        System.out.println("Proporciona el título: ");
        String titulo = entrada.nextLine();
        System.out.println("Proporciona el autor: ");
        String autor = entrada.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);*/
        
        /*byte numEnteroByte = 127;
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor mínimo del Byte: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo del Byte: " + Byte.MAX_VALUE);

        short numEnteroShort = 32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor mínimo del Short: " + Short.MIN_VALUE);
        System.out.println("Valor máximo del Short: " + Short.MAX_VALUE);

        int numEnteroInt = 2147483647;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor mínimo del Int: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo del Int: " + Integer.MAX_VALUE);

        long numEnteroLong = 9223372036854775807L;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor mínimo del Long: " + Long.MIN_VALUE);
        System.out.println("Valor máximo del Long: " + Long.MAX_VALUE);

        float numFloat = 3.4028235E38F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor mínimo de Float: " + Float.MIN_VALUE);
        System.out.println("El valor máximo de Float: " + Float.MAX_VALUE);

        double numDouble = 1.7976931348623157E308D;
        System.out.println("numFloat = " + numDouble);
        System.out.println("El valor mínimo de Double: " + Double.MIN_VALUE);
        System.out.println("El valor máximo de Double: " + Double.MAX_VALUE);*/

        //Inferencias de tipos var y tipos primitivos
        /*var numEntero = 20; //Las literales sin punto automaticamente son de tipo int
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0F; //Automaticamente con el punto se transforma en tipo double
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);*/

        //Tipos primitivos char
       /* char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);

        char varCaracter ='\u0024'; //Indicamos a Java la asignación con el código unicode
        System.out.println("varCaracter = " + varCaracter);

        char varCaracterDecimal = 36; //Valor decimal del juego de caracteres unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);

        char varCaracterSimbolo = '$'; //Un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);

        //con var
        var varCaracter1 ='\u0024'; //Indicamos a Java la asignación con el código unicode
        System.out.println("varCaracter = " + varCaracter1);

        var varCaracterDecimal1 = (char) 36; //Valor Entero y le asigna un tipo int
        System.out.println("varCaracterDecimal = " + varCaracterDecimal1);

        var varCaracterSimbolo1 = '$'; //Un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo1);
        
        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);*/

        //Tipos primitivos tipos booleanos
       /* boolean varBool = false;
        System.out.println("varBool = " + varBool);

        if(varBool) {
            System.out.println("La bandera es verde");
        }
        else{
            System.out.println("La bandera es roja");
        }
        //Algoritmo: ¿Es mayor de edad?
        var edad = 18; //Literal tener presente la interferencia de tipos
       //var adulto = edad >= 18; //Esta es una expresión booleana
        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }*/

        //Conversión de tipos primitivos
        /*var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);;*/
        
       /* Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su edad: ");
        edad = Integer.parseInt(entrada.nextLine());
        System.out.println("edad = " + edad)*/

        //Conversión de tipos primitivos en Java Parte 2:
       /* var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var fraseChar = "programadores".charAt(6);
        System.out.println("fraseChar = " + fraseChar);

        System.out.println("Digite un caracter: ");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);*/

       /* int num1 = 5, num2 = 4;
        var solucion = num1 + num2;
        System.out.println("solución de la suma = " + solucion);

        solucion = num1 - num2;
        System.out.println("solucion de la resta = " + solucion);

        solucion = num1 * num2;
        System.out.println("solucion de la multiplicación = " + solucion);

        solucion = num1 / num2;
        System.out.println("solucion de la división = " + solucion);

        var solucion2 = 3.4 / num2;
        System.out.println("solucion2 resultado de la división = " + solucion2);
        
        solucion = num1 % num2; //Guarda el residuo entero de la división
        System.out.println("solucion = " + solucion); // 5/4

        if(num2 % 2 == 0)
            System.out.println("Es un número PAR");
        else
            System.out.println("Es un número IMPAR");*/

      /*  int varNum1 = 1, varNum2 = 4;
        int varNum3 = varNum1 + 6 - varNum2; //Una operación
        System.out.println("varNum3 = " + varNum3);
        varNum1 += 1; // varNum1 = varNum1 + 1;
        System.out.println("varNum1 = " + varNum1);
        varNum2 -= 2;
        System.out.println("varNum2 = " + varNum2);
        varNum1 *= 5;
        System.out.println("varNum1 = " + varNum1);
        varNum3 /= 4;
        System.out.println("varNum3 = " + varNum3);
        varNum1 %= 6;
        System.out.println("varNum1 = " + varNum1);*/

        //Operadores Unarios: Cambio de Signo
        /*var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB); //El resultado será un número negativo

        //Operador de Negación
        var varC = true; //Esta literal por default en Java es de tipo boolean
        var varD = !varC; //Aqui esta invirtiendo el valor
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);

        //Operadores unarios de incremento: Preincremento
        var varE = 9; //Se va a modificar su valor
        var varF = ++varE; //Simbolo anbtes de la variable
        //Primero se incrementa la variable y después se usa su valor
        System.out.println("varE = " + varE); //Se incrementa en la unidad
        System.out.println("varF = " + varF); //Va a sumar uno

        //Posincremento (el simbolo va después de la variable)
        var varG = 3;
        var varH = varG++; //Primero el valor de la variable, luego el incremento
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);

        //Operadores Unarios de decremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI);//La variable ya esta con decremento
        System.out.println("varJ = " + varJ);

        var varK = 8;
        var varL = varK--; //Primero el valor de la variable, luego queda el decremento
        System.out.println("varK = " + varK); //Aqui va a decrementar en L
        System.out.println("varL = " + varL);*/
        
        //Operadores de igualdad y Relacionales
        /*var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);
        
        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);
        
        var cadenaA = "Hello";
        var cadenaB = "bye bye";
        var cVar = cadenaA == cadenaB; //Comparación de referencias
        System.out.println("cVar = " + cVar);
        
        var fVar = cadenaA.equals(cadenaB); //Compara el contenido de los objetos tipo Str
        System.out.println("fVar = " + fVar);

        var gVar = aNum >= bNum; // > >= < <= == !=
        System.out.println("gVar = " + gVar);

        if(aNum % 2 == 0) {
            System.out.println("El número es PAR");
        } else{
            System.out.println("El número es IMPAR");
        }

        var edad = 15;
        var adulto = 18;
        if(edad >= adulto){
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("Es menor de edad");
        }*/

        /*var valorA = 7;
        var valorMinimo = 0; //rango del 0 al 10
        var valorMaximo = 10;
        var respuesta = valorA >= valorMinimo && valorA <= valorMaximo;

        if(respuesta){
            System.out.println("Esta dentro del rango establecido");
        } else{
            System.out.println("Esta fuera del rango establecido");
        }

        var vacaciones = true;
        var diaLibre = false;
        if(vacaciones || diaLibre){
            System.out.println("Papá puede asistir al juego de su hijo");
        } else {
            System.out.println("Papá no puede asistir al juego de su hijo");
        }*/
        
        //Operador Ternario
       /* var resultadoT = (5 > 8) ? "Verdadero" : "Falso";
        System.out.println("resultadoT = " + resultadoT);
        
        var numeroT = 4;
        resultadoT = (numeroT % 2 == 0) ? "Es par" : "Es impar";
        System.out.println("resultadoT = " + resultadoT);*/

        var x = 5;
        var y = 10;
        var z = ++x + y--; //Resultado 1ro incrementa x, luego decrementa y. Por último realiza la suma
        System.out.println("x = " + x); //6
        System.out.println("y = " + y); //9
        System.out.println("z = " + z); //16

        var solucionAritmetica = 4 + 5 * 6 / 3; //Primero multiplica 5 * 6, divide el resultado por 3 y luego realiza la suma 
        System.out.println("solucionAritmetica = " + solucionAritmetica); // 4 + ((5 * 6) / 3) = 30 / 3 - 10 + 4 = 14
        
        solucionAritmetica = (4 + 5) * 6 / 3; //Primero resuelve los parentesis, luego multiplica por 6 y por último divide por 3
        System.out.println("solucionAritmetica = " + solucionAritmetica); // 4 + 5 = 9 * 6 = 54 / 3 = 18
    }
}

