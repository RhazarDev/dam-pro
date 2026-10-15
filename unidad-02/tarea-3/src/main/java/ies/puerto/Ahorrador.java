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
        int opcion = 0;
        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("¿Cuanto dinero tienes ahorrado? ");
        float ahorroInicial = teclado.nextFloat();
        System.out.println("Hola, " + nombre);






        teclado.close();

    }
}
