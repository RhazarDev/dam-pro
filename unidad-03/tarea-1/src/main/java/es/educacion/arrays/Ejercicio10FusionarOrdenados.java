package es.educacion.arrays;

import java.util.Arrays;

/**
 * Clase que fusiona dos arrays ya ordenados ascendentemente, conservando repetidos, en un array nuevo ordenado. Null: IllegalArgumentException.
 *
 * @author RhazarDev
 * @version 1.0.0
 */
public final class Ejercicio10FusionarOrdenados {
    private Ejercicio10FusionarOrdenados() { }

    public static void main(String[] args) {
        int [] primero = {1,5,7,9,111,211};
        int [] segundo = {1,6,8,11,95,126,715};
        int[] resultado = fusionar(primero,segundo);

        System.out.println("La fusion de los arrays es = " + Arrays.toString(fusionar(primero,segundo)));
    }

    /**
     * Funcion que fusiona dos arrays ya ordenados ascendentemente, conservando repetidos, en un array nuevo ordenado. Null: IllegalArgumentException.
     * @param primero primer Array con los numeros int
     * @param segundo segundo Array con los numeros int
     * @return Array fusionado con los numeros en int
     */
    public static int[] fusionar(int[] primero, int[] segundo) {
        if (primero == null || segundo == null) {
            throw new IllegalArgumentException("El array es nulo");
        }
        int[] resultado = new int[primero.length + segundo.length];
        int iPrimero = 0;
        int iSegundo = 0;
        int iResultado = 0;

        while (iPrimero < primero.length && iSegundo < segundo.length) {
            if (primero[iPrimero] <= segundo[iSegundo]){
                resultado[iResultado] = primero[iPrimero];
                iResultado++;
                iPrimero++;
            } else {
                resultado[iResultado] = segundo[iSegundo];
                iResultado++;
                iSegundo++;
            }
        }

        while (iPrimero < primero.length) {
            resultado[iResultado] = primero[iPrimero];
            iResultado++;
            iPrimero++;
        }

        while (iSegundo < segundo.length) {
            resultado[iResultado] = segundo[iSegundo];
            iResultado++;
            iSegundo++;
        }


        return resultado;
    }
}
