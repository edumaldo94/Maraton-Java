/*
 * 
 * 
 */

import java.util.Scanner;

public class ejercicio18 {
    
public static void main(String[] args) {
    
    Scanner scanner = new Scanner (System.in);
    System.out.println("Introduce el tamaño fila: ");
    int fila = scanner.nextInt();
    System.out.println("Introduce el tamaño columna: ");
    int col = scanner.nextInt();
    int[][] arreglo= new int[fila][col];

    for (int i=0; i<fila; i++){
        for (int j=0; j<col; j++){
            System.out.println("Introduce el valor de la fila "+i+" columna "+j);
            arreglo[i][j]=scanner.nextInt();
        }
    }

    for (int i=0; i<fila; i++){
        for (int j=0; j<col; j++){
            System.out.print(arreglo[i][j]+" ");
        }
        System.out.println();
    }
}


}
