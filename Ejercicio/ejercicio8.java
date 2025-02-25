/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 */

import java.util.Scanner;

public class ejercicio8 {
    
    public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
System.out.println("");
System.out.println("Ingrese una frase: ");
String frase= scanner.nextLine();

if(frase.length() == 8){
System.out.println("Correcto: " +frase.length());
}else{
System.out.println("Incorrecto: " +frase.length());
}

    }
}
