import java.util.Scanner;
/*
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
public class ejercicio11 {
    
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un valor de numeros");
    int num1=scanner.nextInt();
    System.out.println("Ingrese un valor de numeros");
    int num2=scanner.nextInt();
    int opcion = 0;
    do {
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicacion");
        System.out.println("4 - Division");
        System.out.println("5 - Salir");
        System.out.println("Ingrese una opcion");
 opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("La suma de los numeros es: "+(num1+num2));
                break;
            case 2:
                System.out.println("La resta de los numeros es: "+(num1-num2));
                break;
            case 3:
                System.out.println("La multiplicacion de los numeros es: "+(num1*num2));
                break;
            case 4:
                System.out.println("La division de los numeros es: "+(num1/num2));
                break;
            case 5:
                System.out.println("Saliendo del programa");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    } while (opcion != 5);
    
}

}
