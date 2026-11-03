package es.dampro.unidad2.tarea6;

/**
 * Clase que calcula el mayor numero de una lista
 * @author RhazarDev
 * @version 1.0.0
 */
public final class MayorNumero {
    /**
     * Clase que calcula el mayor numero de una lista separado por comas
     * @param numeros String que contiene los numeros
     * @return int con el numero mayor
     */
    static int obtenerMayor(String numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("Los numeros no pueden ser nulos ni estar vacio");
        }

        char coma = ',';
        numeros = numeros + coma;
        numeros = numeros.replace(" ", "");
        String numeroActual = "";
        int mayor = 0;
        boolean primerNumero = true;

        for (int i = 0; i < numeros.length(); i++) {
            char caracter = numeros.charAt(i);

            if (caracter != coma) {
                numeroActual = numeroActual + caracter;
            }

            if (caracter == coma) {
                int numero = Integer.parseInt(numeroActual);
                if (primerNumero || numero > mayor) {
                    mayor = numero;
                    primerNumero = false;
                }
                numeroActual = "";
            }
        }
        return mayor;
    }
}
