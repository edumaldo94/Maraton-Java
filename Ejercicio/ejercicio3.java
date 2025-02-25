/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
*/

import java.util.Scanner;

public class ejercicio3 {
    
    public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
String frase;
System.out.println("Ingrese una frase--");
frase=scanner.nextLine();

System.out.println("La frase en mayusculas es: "+frase.toUpperCase());
System.out.println("La frase en minusculas es: "+frase.toLowerCase());
    }
}
