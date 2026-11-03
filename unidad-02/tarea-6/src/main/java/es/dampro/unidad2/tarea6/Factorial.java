package es.dampro.unidad2.tarea6;

/**
 * Clase que calcula el factorial de un numero entre 0 y 12
 * @author RhazarDev
 * @version 1.0.0
 */
public final class Factorial {
    /**
     * Calcula el factorial de un numero dado
     * @param numero int para el calculo de un factorial
     * @return int con el resultado
     */
    static int calcular(int numero) {
        if (numero <= 1) {
            return 1;
        }
        if (numero < 0 | numero > 12) {
            throw new IllegalArgumentException("El numero tiene que estar entre 0 y 12");
        }
        int resultado = 1;
        for (int i = 2; i < numero ; i++) {
            resultado = resultado * i;

        }
        return resultado;
    }
}

