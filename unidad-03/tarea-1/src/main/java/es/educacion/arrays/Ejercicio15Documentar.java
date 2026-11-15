package es.educacion.arrays;

// Ejercicio 15: documentación Javadoc. Añade Javadoc descriptivo a la clase y ambos métodos.
// Describe su finalidad y documenta cada parámetro y valor de retorno.

/**
 * Clase que calcula la longitud de un Array de int. Devuelve IllegalArgumentException si el Array es nulo.
 *
 * @author RhazarDev
 * @version 1.0.0
 */
public final class Ejercicio15Documentar {
    private Ejercicio15Documentar() { }

    // Número de elementos (un array nulo no está permitido).

    /**
     * Funcion que calcula la longitud de un Array de int. En caso de que el Array sea nulo devuele IllegalArgumentException.
     * @param numeros Array de int con los numeros alamacenados
     * @return int con la longitud del Array
     */
    public static int longitud(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("Array nulo");
        }
        return numeros.length;
    }

    // Indica si el array contiene algún elemento (un array nulo no está permitido).

    /**
     * Funcion que indica con un boolean si el Array contiene elementos o no
     * @param numeros Array de int con los numeros almacenados
     * @return int con la longitud del Array
     */
    public static boolean tieneElementos(int[] numeros) {
        return longitud(numeros) > 0;
    }
}
