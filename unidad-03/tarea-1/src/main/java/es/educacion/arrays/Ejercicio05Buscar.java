package es.educacion.arrays;

/**
 * Devuelve el índice de la primera aparición o -1. No requiere ordenar. Null: IllegalArgumentException.
 *
 * @author RhazarDev
 * @version 1.0.0
 */
public final class Ejercicio05Buscar {
    private Ejercicio05Buscar() { }

    public static void main(String[] args) {
        int [] numeros = {7,8,2,3,414,280};
        int objetivo = 3;
        int posicion = buscar(numeros, objetivo);
        System.out.println("El numero objetivo esta en la posicion = " + buscar(numeros,objetivo));

    }

    /**
     * Funcion que devuelve la primera aparicion del numero indicado.
     * @param numeros Array con los numeros a buscar
     * @param objetivo int que buscar en el Array
     * @return int posicion en el Array con el numero
     */
    public static int buscar(int[] numeros, int objetivo) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("El array es nulo o vacio");
        }
        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            if (numero == objetivo) {
                return i;
            }
        }
        return -1;
    }
}
