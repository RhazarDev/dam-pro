package es.educacion.arrays;

/**
 * Clase que cuenta los elementos pares, incluidos cero y negativos. Array vacío: 0. Null: IllegalArgumentException.
 *
 * @author RhazarDev
 * @version 1.0.0
 */

public final class Ejercicio11ContarPares {
    private Ejercicio11ContarPares() { }

    public static void main(String[] args) {
        int[] numeros = {8,7,3,3,10,-2,0};
        int resultadoPares = contarPares(numeros);
        System.out.println("El numero de pares es = " +resultadoPares);
    }

    /**
     * Funcion que cuenta los elementos pares, incluidos cero y negativos. Array vacío: 0. Null: IllegalArgumentException.
     * @param numeros Array de int que almacena numeros
     * @return int cantidad de numeros pares
     */
    public static int contarPares(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("El array es nulo");
        }
        if (numeros.length == 0) {
            return 0;
        }
        int resultado = 0;

        for (int numero:numeros) {
            if (numero % 2 == 0) {
                resultado ++;
            }
        }

        return resultado;
    }
}
