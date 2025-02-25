/*
 Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.

 */

import java.util.Scanner;

public class ejercicio9 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("|||||||");
        System.out.println("Ingrese una frase");
        String frase=scanner.nextLine();
  
        if(frase.substring(0, 1).equals("a")){

            System.out.println("La frase comienza con la letra: "+ frase.substring(0, 1) );

        }else {
            System.out.println("La frase no comienza con la letra: "+ frase.substring(0, 1));
        }
    }
}
