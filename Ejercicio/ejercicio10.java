import java.util.Scanner;
/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial. 
 */
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("|||||||");
        System.out.println("Ingrese valor limite de numeros");
        int limite=scanner.nextInt();
int suma=0;
        for (int i=0; i<limite; i++){
            System.out.println("ingrese un valor");
            int valor=scanner.nextInt();
            if(valor > limite || suma >= limite){
                System.out.println("El valor ingresado es mayor al limite");
                break;
            }else{
           suma = valor + suma;
            System.out.println("La suma de los valores ingresados es: "+suma); 
            }
            }
        

    }

}
