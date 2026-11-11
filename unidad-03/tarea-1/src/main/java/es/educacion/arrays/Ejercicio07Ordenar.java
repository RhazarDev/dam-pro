package es.educacion.arrays;

import java.util.Arrays;

/**
 * Clase que devuelve un array nuevo ordenado ascendentemente, sin modificar el original. Null: IllegalArgumentException.
 *
 * @author RhazarDev
 * @version 1.0.0
 */
public final class Ejercicio07Ordenar {
    private Ejercicio07Ordenar() { }

    public static void main(String[] args) {
        int [] numeros = {7,8,2,3,414,280};
        int [] resultado = ordenar(numeros);
        System.out.println("El array = " + Arrays.toString(resultado));
    }

    /**
     * Funcion que devuelve un array nuevo ordenado ascendentemente, sin modificar el original. Null: IllegalArgumentException.
     * @param numeros Array con los numeros int
     * @return Array con los numeros int ordenados
     * @throws IllegalArgumentException
     */
    public static int[] ordenar(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("El array es nulo");
        }
        if (numeros.length == 0) {
            return numeros;
        }
        int[] resultado = Arrays.copyOf(numeros, numeros.length);
        Arrays.sort(resultado);
        return resultado;
    }
}