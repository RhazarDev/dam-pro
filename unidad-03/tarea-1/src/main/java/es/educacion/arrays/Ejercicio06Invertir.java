package es.educacion.arrays;

import java.sql.Array;
import java.util.Arrays;

// Devuelve un array nuevo con los elementos en orden inverso. No modifica el original. Null: IllegalArgumentException.
// 
// TODO: implementar el método y documentar la clase y el método mediante Javadoc.
public final class Ejercicio06Invertir {
    private Ejercicio06Invertir() { }

    public static void main(String[] args) {
        int [] numeros = {7,8,2,3,414,280};

        int [] numerosInverso = invertir(numeros);
        System.out.println("Array sin invertir = " + Arrays.toString(numeros));
        System.out.println("Array invertido = " + Arrays.toString(numerosInverso));
    }

    // Devuelve un array nuevo con los elementos en orden inverso. No modifica el original. Null: IllegalArgumentException.
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
