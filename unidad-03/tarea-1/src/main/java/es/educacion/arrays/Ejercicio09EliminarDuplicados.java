package es.educacion.arrays;


import java.util.Arrays;

/**
 * Elimina los elementos repetidos preservando el orden de primera aparición. Devuelve array nuevo. Null: IllegalArgumentException.
 *
 * @author RhazarDev
 * @version 1.0.0
 */
public final class Ejercicio09EliminarDuplicados {
    private Ejercicio09EliminarDuplicados() { }

    public static void main(String[] args) {

        int [] numeros = {7,8,8,8,2,3,414,280};

        int[] resultado = sinDuplicados(numeros);
        System.out.println("El array es = " + Arrays.toString(resultado));
    }

    /**
     * Elimina los elementos repetidos preservando el orden de primera aparición. Devuelve array nuevo. Null: IllegalArgumentException.
     *
     * @param numeros Array de int con los numeros
     * @return Array con los numeros int con los numeros repetidos eliminados
     * @throws IllegalArgumentException
     */
    public static int[] sinDuplicados(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("El array es nulo");
        }
        if (numeros.length == 0) {
            return numeros;
        }

        int[] resultado = new int[numeros.length];
        int cantidad = 0;

        for (int numero:numeros) {
            boolean repetido = false;
            for (int i = 0; i < cantidad; i++) {
                if (resultado[i] == numero) {
                    repetido = true;
                }
            }
            if (!repetido) {
                resultado[cantidad] = numero;
                cantidad++;
            }
        }
        return Arrays.copyOf(resultado, cantidad);
    }
}