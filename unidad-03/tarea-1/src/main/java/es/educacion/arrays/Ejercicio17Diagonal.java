package es.educacion.arrays;

/**
 * Clase que suma diagonal principal de una matriz cuadrada, incluida la matriz 0x0. Si matriz es nula o no cuadrada: IllegalArgumentException.
 *
 * @author RhazarDev
 * @version 1.0.0
 */
public final class Ejercicio17Diagonal {
    private Ejercicio17Diagonal() { }

    /**
     * Funcion que suma diagonal principal de una matriz cuadrada, incluida la matriz 0x0. Si matriz es nula o no cuadrada: IllegalArgumentException.
     * @param matriz int[][] de enteros
     * @return int con la suma en diagonal de la matriz
     */
    public static int sumarDiagonal(int[][] matriz) {
        if (matriz == null) {
            throw new IllegalArgumentException("La matriz no puede ser nula");
        }
        int filas = matriz.length;
        int resultado = 0;
        for (int i = 0; i < filas; i++) {
            // int[] fila = matriz[i];
            if (matriz[i] == null || matriz[i].length != filas) {
                throw new IllegalArgumentException();
            }
            resultado += matriz[i][i];
        }
        return resultado;
    }
}
