/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
TIPOS DE DATOS PRIMITIVOS:
byte: 8 bits
short: 16 bits 
int: 32 bits
long: 64 bits
float: 32 bits
double: 64 bits
char: 16 bits
boolean: 1 bit
String: 2 bits


 */

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un él primer numero--");

int primerNumero = leer.nextInt();
System.out.println("Ingrese un él segundo numero--");
int segundoNumero = leer.nextInt();
int suma = primerNumero + segundoNumero;

System.out.println("La suma de los dos numeros es: " + suma);

    }

}