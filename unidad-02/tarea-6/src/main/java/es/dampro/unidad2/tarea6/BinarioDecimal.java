package es.dampro.unidad2.tarea6;

/**
 * Clase que convierte un numero binario a decimal.
 * @author RhazarDev
 * @version 1.0.0
 */
public class BinarioDecimal {

    /**
     * Convierte una cadena en binario a decimal
     * @param sBinario String con el numero binario formado por ceros y unos
     * @return int con el valor decimal del numero binario
     */
    static int convertirBinario(String sBinario) {
        if (sBinario == null) {
            throw new IllegalArgumentException("El binario no puede ser nulo");
        }

        if (sBinario.isEmpty()) {
            throw new IllegalArgumentException("El binario no puede estar vacio");
        }

        int limite = 1073741823;
        int decimal = 0;

        for (int i = 0; i < sBinario.length(); i++) {
            char caracter = sBinario.charAt(i);

            if (caracter != '0' && caracter != '1') {
                throw new IllegalArgumentException("El binario solo puede contener ceros y unos");
            }

            if (decimal > limite) {
                throw new IllegalArgumentException("El binario no cabe en un int");
            }

            int digito = Integer.parseInt(String.valueOf(caracter));
            decimal = decimal * 2 + digito;
        }

        return decimal;
    }
}