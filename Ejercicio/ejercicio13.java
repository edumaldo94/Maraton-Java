import java.util.Scanner;
/*
 * . Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
public class ejercicio13 {
    
public static void main(String[] args) {
    

    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un numero: ");
    int numero = scanner.nextInt();
int div= numero / 2;
int mod = numero % 2;
int impares = 0;
int conta = 0;
if(mod == 0){
    System.out.println("El numero es par");
}else{
    impares = numero - 2;
}
    for (int i = 0; i < numero; i++) {
       System.out.print(" * ");
    }
    System.out.println();
    for (int j = 0; j < numero-2; j++) {
        
            System.out.print(" * ");
        for (int i = 0; i < numero-2; i++) {
            System.out.print("   ");
        }
        System.out.println(" * ");
    }
    for (int i = 0; i < numero; i++) {
        System.out.print(" * ");
     }
      
       
        System.out.println();
    

}

}
