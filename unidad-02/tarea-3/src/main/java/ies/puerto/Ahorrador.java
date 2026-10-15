package ies.puerto;

import java.util.Scanner;

/**
 * @author RhazarDev
 * @version 1.0.0
 */
public class Ahorrador {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        float ahorroTotal = 0;
        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("¿Cuanto dinero tienes ahorrado? ");
        float ahorroInicial = teclado.nextFloat();
        System.out.println("Hola, " + nombre);
        System.out.println("Introduce una cantidad para ahorrar: ");
        float aporte = teclado.nextFloat();
        ahorroTotal = ahorroInicial + aporte;
        System.out.println("Aportación registrada. Ahorro actual: " +ahorroTotal);

        do {
            teclado.nextLine();
            System.out.println("¿Deseas realizar otra aportación? (S/N): ");
            String opcion = teclado.nextLine();
            switch (opcion) {
                case "S", "s":
                    System.out.println("Introduce una cantidad para ahorrar: ");
                    aporte = teclado.nextFloat();
                    ahorroTotal = ahorroTotal + aporte;
                    System.out.println("Aportación registrada. Ahorro actual: " +ahorroTotal);
                case "N", "n":
                    System.out.println("RESUMEN DEL AHORRO");

            }


        } while (!salir);






        teclado.close();

    }
}
