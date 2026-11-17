package es.educacion.arrays;

import java.util.Arrays;

/**
 * Clase que devuelve la transpuesta de una matriz rectangular, sin modificarla. Matriz 0x0 devuelve 0x0. Matriz o fila nula, o irregular: IllegalArgumentException.
 * @author RhazarDev
 * @version 1.0.0
 */
public final class Ejercicio18Transponer {
    private Ejercicio18Transponer() { }

    public static void main(String[] args) {
        int[][] matriz = {{1, 2}, {4, 5}, {-1, -2}};
        int[][] resultado = transponer(matriz);
        System.out.println("La matriz transpuesta es: " + Arrays.deepToString(resultado));
    }

    /**
     * Funcion que devuelve la transpuesta de una matriz rectangular, sin modificarla. Matriz 0x0 devuelve 0x0. Matriz o fila nula, o irregular: IllegalArgumentException.
     * @param matriz int[][] de enteros
     * @return int[][] de enteros transpuestos
     */
    public static int[][] transponer(int[][] matriz) {
        if (matriz == null) {
            throw new IllegalArgumentException("La matriz no puede ser nula");
        }
        int filas = matriz.length;
        int[][] matrizVacia = new int[0][0];
        if (filas == 0) {
            return matrizVacia;
        }
        int columnas = matriz[0].length;

        for (int i = 1; i < filas; i++) {
            if (matriz[i] == null || matriz[i].length != columnas) {
                throw new RuntimeException("La matriz es irregular");
            }
        }
        int[][] resultado = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[j][i] = matriz[i][j];
            }
        }
        return resultado;
    }
}
