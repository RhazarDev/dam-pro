package es.educacion.arrays;


import java.util.Arrays;

/**
 * Clase que devuelve cuántas veces aparece un valor. Se admiten negativos y ceros. Null: IllegalArgumentException.
 *
 * @author RhazarDev
 * @version 1.0.0
 */
public final class Ejercicio13Frecuencia {
    private Ejercicio13Frecuencia() { }

    public static void main(String[] args) {
        int [] numeros = {7,8,2,2,2,3,414,280};
        int objetivo = 2;
        int resultado = frecuencia(numeros, objetivo);

        System.out.println("El objetivo aparece este numero de veces = " + + resultado);
    }

    /**
     * Funcion que devuelve cuántas veces aparece un valor. Se admiten negativos y ceros. Null: IllegalArgumentException.
     * @param numeros Array de int con los numeros almacenados
     * @param objetivo int con el numero objetivo
     * @return int con el numero de veces que aparece el objetivo
     */
    public static int frecuencia(int[] numeros, int objetivo) {
        if (numeros == null) {
            throw new IllegalArgumentException("El array es nulo");
        }
        if (numeros.length == 0) {
            return 0;
        }
        int resultado = 0;

        for (int numero:numeros) {
            if (numero == objetivo) {
                resultado++;
            }
        }

        return resultado;
    }
}
