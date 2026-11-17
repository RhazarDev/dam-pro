package es.educacion.arrays;

/**
 * Clase que devuelve longitud de la mayor secuencia contigua estrictamente creciente. Array vacío: 0. Repetidos no prolongan racha. Null: IllegalArgumentException.
 * @author RhazarDev
 * @version 1.0.0
 */
public final class Ejercicio20RachaCreciente {
    private Ejercicio20RachaCreciente() { }

    public static void main(String[] args) {
        int [] numeros = {7,8,2,1,414,420,280,300,400,600,700,800};
        int resultado = longitudMayorRacha(numeros);
        System.out.println("La mayor racha es de: " +resultado);
    }

    /**
     * Funcion que devuelve longitud de la mayor secuencia contigua estrictamente creciente. Array vacío: 0. Repetidos no prolongan racha. Null: IllegalArgumentException.
     * @param numeros int[] de enteros
     * @return int con la mayor racha contigua observada
     */
    public static int longitudMayorRacha(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("El array es nulo");
        }
        if (numeros.length == 0) {
            return 0;
        }
        int racha = 0;
        int resultado = 1;

        for (int i = 0; i < numeros.length-1; i++) {
            if (numeros[i] < numeros[i+1]) {
                racha++;
                if (racha >= resultado) {
                    resultado++;
                }
            }
            if (numeros[i] >= numeros[i+1]) {
                racha = 0;
            }
        }

        return resultado;
    }
}
