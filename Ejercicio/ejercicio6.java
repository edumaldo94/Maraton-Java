/*
 Crear un programa que dado un numero determine si es par o impar.

 */

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("Ingrese un él primer numero--");
        int primerNumero = scanner.nextInt();

int par= primerNumero % 2;
        if(par == 0) {
        System.out.println("El numero ingresado es par "+ par);
        }else{
        System.out.println("El numero ingresado es impar "+ par);
        }


    }
    
}
