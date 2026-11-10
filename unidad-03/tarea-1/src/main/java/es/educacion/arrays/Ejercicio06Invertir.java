package es.educacion.arrays;

import java.sql.Array;
import java.util.Arrays;

/**
 * Clase que que devuelve un array nuevo con los elementos en orden inverso. No modifica el original. Null: IllegalArgumentException.
 *
 * @author RhazarDev
 * @version 1.0.0
 */
public final class Ejercicio06Invertir {
    private Ejercicio06Invertir() { }

    public static void main(String[] args) {
        int [] numeros = {7,8,2,3,414,280};

        int [] numerosInverso = invertir(numeros);
        System.out.println("Array sin invertir = " + Arrays.toString(numeros));
        System.out.println("Array invertido = " + Arrays.toString(numerosInverso));
    }

    /**
     * Funcion que devuelve un array nuevo con los elementos en orden inverso. No modifica el original. Null: IllegalArgumentException.
     * @param numeros Array que contiene los numeros int
     * @return Array que contiene los numeros int invertidos
     */
    public static int[] invertir(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("El array es nulo");
        }
        if (numeros.length == 0) {
            return numeros;
        }

        int[] numerosInverso = new int [numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            numerosInverso[i] = numeros[numeros.length -1 -i];
        }
        return numerosInverso;
    }
}
