/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
*/

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
System.out.println("");
        System.out.println("Ingrese un él primer numero--");
int primerNumero = scanner.nextInt();

int doble= primerNumero * 2;
int triple= primerNumero * 3;
double raizCuadrada= (double) Math.sqrt(primerNumero);
System.out.println("El doble del numero ingresado es: "+doble);
System.out.println("El triple del numero ingresado es: "+triple);
System.out.println("La raiz cuadrada del numero ingresado es: "+raizCuadrada);

    }
}
