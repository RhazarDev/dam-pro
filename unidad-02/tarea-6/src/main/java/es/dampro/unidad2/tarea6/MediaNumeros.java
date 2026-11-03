package es.dampro.unidad2.tarea6;

/**
 * Clase que calcula la media de unos numeros
 * @author RhazarDev
 * @version 1.0.0
 */
public final class MediaNumeros {
    private MediaNumeros() { }

    /**
     * Funcion que calcula la media de unos numeros en un String
     * @param numeros String con los numeros
     * @return double media de los numeros
     */
    public static double calcularMedia(String numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("Los numeros no pueden ser nulos ni estar vacio");
        }
        
       numeros = numeros.replace(" ", "");

        char coma = ',';
        numeros = numeros + coma;
        numeros = numeros.replace(" ", "");
        String numeroActual = "";
        double suma = 0;
        int cantidad = 0;

        for (int i = 0; i < numeros.length(); i++) {
            char caracter = numeros.charAt(i);

            if (caracter != coma) {
                numeroActual = numeroActual + caracter;
            }

            if (caracter == coma) {
                suma = suma + Integer.parseInt(numeroActual);
                cantidad++;
                numeroActual = "";
            }
        }

        return suma / cantidad;
    }
}
