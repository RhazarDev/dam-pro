package ies.puerto;

import java.util.Scanner;

/**
 * @author RhazarDev
 * @version 1.0.0
 */
public class Numero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int numero1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero");
        int numero2 = teclado.nextInt();

        int resultado = mayor(numero1, numero2);

    }


    static int mayor(int numero1, int numero2) {
        if (numero1 > numero2) {
            return numero1;
        }
        return numero2;

    }
}
