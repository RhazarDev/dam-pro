package ies.puerto;

import java.util.Scanner;

/**
 * @author RhazarDev
 * @version 1.0.0
 */
public class Ahorrador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        float ahorroTotal = 0;
        float aporteTotal = 0;
        float aporte = 0;
        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("¿Cuanto dinero tienes ahorrado? ");
        float ahorroInicial = teclado.nextFloat();
        System.out.println("Hola, " + nombre);
        do {
            System.out.println("Introduce una cantidad para ahorrar: ");
            aporte = teclado.nextFloat();
        } while (aporte < 0);
        int contador = 0;
        aporteTotal = aporteTotal + aporte;
        ahorroTotal = ahorroInicial + aporte;
        System.out.println("Aportación registrada. Ahorro actual: " +ahorroTotal);
        teclado.nextLine();

        do {
            System.out.println("¿Deseas realizar otra aportación? (S/N): ");
            String opcion = teclado.nextLine();
            switch (opcion) {
                case "s", "S":
                    do {
                        System.out.println("Introduce una cantidad para ahorrar: ");
                        aporte = teclado.nextFloat();
                    } while (aporte < 0);
                    ahorroTotal = ahorroTotal + aporte;
                    aporteTotal = aporteTotal + aporte;
                    System.out.println("Aportación registrada. Ahorro actual: " +ahorroTotal);
                    teclado.nextLine();
                    contador ++;
                    break;
                case "N", "n":
                    System.out.println("===========================");
                    System.out.println("RESUMEN DEL AHORRO");
                    System.out.println("===========================");
                    System.out.println("Ahorro inicial: " +ahorroInicial);
                    System.out.println("Aportaciones realizadas: "+contador);
                    System.out.println("Total aportado: " +aporteTotal);
                    System.out.println("Ahorro final: " +ahorroTotal);
                    return;
                default:
                    System.out.println("Opción no valida");
                    break;
            }

        } while (!salir);

        teclado.close();
    }
}
