/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        System.out.println("|||||||");
        System.out.println("Ingrese la cantidad de grados centigrados--");
        celsius=scanner.nextDouble();
        fahrenheit = 32 + (9 * celsius / 5);
        System.out.println("La cantidad de grados fahrenheit es: "+fahrenheit);

    }
    
}
