/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("");
System.out.println("Ingrese una palabra--");
String palabra= scanner.nextLine();

if(palabra.equals("eureka")){
    System.out.println("Correcto");
}else{
    System.out.println("Incorrecto");
}

    }
}
