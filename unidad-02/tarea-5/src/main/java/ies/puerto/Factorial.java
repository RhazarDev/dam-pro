package ies.puerto;

import java.util.Scanner;

/**
 * @author RhazarDev
 * @version 1.0.0
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = teclado.nextInt();
        int resultado = calcular(numero);
        System.out.println("Factorial: "+resultado);
    }

    /**
     * Calcula el factorial de un numero dado
     * @param numero int para el calculo de un factoria
     * @return int con el resultado
     */
    static int calcular(int numero) {
        if (numero <= 1) {
            return 1;
        }
        int resultado = 1;
        for (int i = 2; i < numero ; i++) {
            resultado = resultado * i;

        }

        return resultado;
    }
}
