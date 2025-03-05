package ejercicio14;
/*
En esta implementación estamos utilizando dos conceptos fundamentales de diseño de software:

Patrón de diseño Strategy.

Principio SOLID, específicamente el principio Open/Closed.

 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad de euros: ");
        double cantidad = scanner.nextDouble();

        System.out.print("Introduce la moneda a convertir (1: libras, 2: dolares, 3: yenes, 4: pesos): ");
        String moneda = scanner.next().toLowerCase();

        ConversionStrategy estrategia;
        switch (moneda) {
            case "1":
                estrategia = new ConversionALibras();
                break;
            case "2":
                estrategia = new ConversionADolares();
                break;
            case "3":
                estrategia = new ConversionAYenes();
                break;
                case "4":
                estrategia = new ConversionAPesosMexicanos();
                break;
            default:
                System.out.println("Moneda no válida.");
                return;
        }

        ConversorMoneda conversor = new ConversorMoneda(estrategia);
        conversor.convertir(cantidad);
    }
}