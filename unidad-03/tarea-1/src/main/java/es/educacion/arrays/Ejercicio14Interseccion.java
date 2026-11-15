package es.educacion.arrays;

import java.util.Arrays;

/**
 * Clase que devuelve valores presentes en ambos arrays, sin repetir y respetando el orden de primera aparición en a. No modifica entradas. Null: IllegalArgumentException.
 * @author RhazarDev
 * @version 1.0.0
 */
public final class Ejercicio14Interseccion {
    private Ejercicio14Interseccion() { }

    public static void main(String[] args) {
        int [] a = {1,5,7,9,111,211};
        int [] b = {1,6,5,8,9,11,95,126,715};
        int[] resultado = interseccion(a,b);

        System.out.println("La interserccion de los Arrays es = " + Arrays.toString(resultado));
    }

    /**
     * Funcion que devuelve valores presentes en ambos arrays, sin repetir y respetando el orden de primera aparición en a. No modifica entradas. Null: IllegalArgumentException.
     * @param a Array de int que almacena numeros y toma prioridad a b
     * @param b Array de int que almacena numeros
     * @return Array de int de a y b juntos sin duplicados
     */
    public static int[] interseccion(int[] a, int[] b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("El array es nulo");
        }
        int [] arrayTemporal = new int[a.length + b.length];
        int contador = 0;
        int posicion = 0;
        boolean esDuplicado = false;
        for (posicion = 0; posicion < a.length; posicion++) {
            arrayTemporal[posicion] = a[posicion];
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]){
                    esDuplicado = true;
                }
            }
            if (esDuplicado != true) {
                arrayTemporal[posicion] = b[i];
                posicion++;
            }
            esDuplicado = false;
        }

        return Arrays.copyOf(arrayTemporal, posicion);
    }
}
