package es.educacion.arrays;

/**
 * Clase que cuenta las apariciones de un valor en una matriz, incluso irregular. Matriz o filas nulas: IllegalArgumentException.
 * @author RhazarDev
 * @version 1.0.0
 */
public final class Ejercicio19ContarMatriz {
    private Ejercicio19ContarMatriz() { }

    public static void main(String[] args) {
        int[][] matriz = {{1, 2}, {2} , {4, 5}, {-1, -2, 2}};
        int objetivo = 2;
        int resultado = contar(matriz, objetivo);
        System.out.println("El numero objetivo aparece " +resultado+ " veces.");
    }

    /**
     * Funcion que cuenta las apariciones de un valor en una matriz, incluso irregular. Matriz o filas nulas: IllegalArgumentException.
     * @param matriz int[][] de enteros
     * @param objetivo int con el numero a encontrar
     * @return int con el numero de apariciones del objetivo
     */
    public static int contar(int[][] matriz, int objetivo) {
        if (matriz == null) {
            throw new IllegalArgumentException("La matriz no puede ser nula");
        }
        int longitudMatriz = matriz.length;
        if (longitudMatriz == 0) {
            return 0;
        }
        int resultado = 0;

        for (int i = 0; i < matriz.length; i++) {
            int[] fila = matriz[i];
            for (int j = 0; j < fila.length; j++) {
                if (fila[j] == objetivo) {
                    resultado++;
                }
            }

        }

        return resultado;
    }
}
