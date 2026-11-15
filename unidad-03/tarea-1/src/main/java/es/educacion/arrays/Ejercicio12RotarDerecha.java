package es.educacion.arrays;

import java.util.Arrays;

/**
 * Clase que devuelve una copia rotada a la derecha el número no negativo de posiciones. Vacío devuelve vacío. No modifica el original. Null o posiciones negativas: IllegalArgumentException.
 * @author RhazarDev
 * @version 1.0.0
 */
public final class Ejercicio12RotarDerecha {
    private Ejercicio12RotarDerecha() { }

    public static void main(String[] args) {
        int [] numeros = {7,8,2,3,414,280};
        int posiciones = 2;
        int [] resultado = rotar(numeros,posiciones);

        System.out.println("El rango es de =" + Arrays.toString(resultado));

    }

    /**
     * Funcion que devuelve una copia rotada a la derecha el número no negativo de posiciones. Vacío devuelve vacío. No modifica el original. Null o posiciones negativas: IllegalArgumentException.
     * @param numeros Array de int con los numeros almacenados
     * @param posiciones Int con el numero de posiciones a rotar
     * @return Array de int con los numeros rotados
     */
    public static int[] rotar(int[] numeros, int posiciones) {
        if (numeros == null) {
            throw new IllegalArgumentException("El array es nulo");
        }
        if (numeros.length == 0) {
            return numeros;
        }
        if (posiciones < 0) {
            throw new IllegalArgumentException("El numero de posiciones no puede ser negativo");
        }
        int[] resultado = new int [numeros.length];

        if (posiciones == 0) {
            return resultado;
        }

        for (int i = 0; i < numeros.length; i++) {
            resultado[(i + posiciones) % numeros.length] = numeros[i];
        }

        return resultado;
    }
}
