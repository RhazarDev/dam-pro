package es.educacion.arrays;

/**
 * Clase que devuelve el mayor valor. Vacío o null: IllegalArgumentException.
 *
 * @author RhazarDev
 * @version 1.0.0
 */
public final class Ejercicio03Maximo {
    private Ejercicio03Maximo() { }

    public static void main(String[] args) {

        int [] numeros = {7,8,2,3,414,280};
        int resultado = maximo(numeros);
        System.out.println("Maximo del array = " + resultado);
    }

    /**
     * Funcion que devuelve el mayor valor. Vacío o null: IllegalArgumentException.
     *
     * @param numeros Array con los numeros int
     * @return int con el maximo
     */
    public static int maximo(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("El array es nulo o vacio");
        }
        int maximo = numeros[0];
        for (int numero:numeros) {
            maximo = Math.max(maximo, numero);
        }
        return maximo;
    }
}