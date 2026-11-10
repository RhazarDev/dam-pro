package es.educacion.arrays;

import java.util.Arrays;

/**
 * Clase que devuelve una copia desde inicio (incluido) hasta fin (excluido). Usa índices válidos con 0 <= inicio <= fin <= length. Intervalo inválido: IllegalArgumentException. Null: IllegalArgumentException.
 *
 * @author RhazarDev
 * @version 1.0.0
 */
public final class Ejercicio08CopiarRango {
    private Ejercicio08CopiarRango() { }

    public static void main(String[] args) {
        int [] numeros = {7,8,2,3,414,280};
        int inicio = 2;
        int fin = 5;
        int [] rango = copiarRango(numeros, inicio, fin);

        System.out.println("El rango es de =" +Arrays.toString(rango));

    }

    /**
     * Funcion que devuelve una copia desde inicio (incluido) hasta fin (excluido). Usa índices válidos con 0 <= inicio <= fin <= length. Intervalo inválido: IllegalArgumentException. Null: IllegalArgumentException.
     * @param numeros Array con los numeros int de los que analizar el rango
     * @param inicio int con el inicio del rango
     * @param fin int con el final del rango
     * @return Array con el rango
     */
    public static int[] copiarRango(int[] numeros, int inicio, int fin) {
        if (numeros == null) {
            throw new IllegalArgumentException("El array es nulo");
        }
        if (numeros.length == 0) {
            return numeros;
        }

        if (inicio < 0 || inicio > fin || fin > numeros.length) {
            throw new IllegalArgumentException("Intervalo inválido");
        }

        int[] rango = Arrays.copyOfRange(numeros, inicio, fin);
        return rango;
    }
}
