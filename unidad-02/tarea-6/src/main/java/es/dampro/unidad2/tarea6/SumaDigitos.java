package es.dampro.unidad2.tarea6;

/**
 * Clase que suma los digitos de un entero
 * @author RhazarDev
 * @version 1.0.0
 */
public final class SumaDigitos {

    /**
     * Funcion que suma los digitos de un entero positivo
     * @param numero String con el numero entero
     * @return int suma numérica de sus dígitos.
     */
    public static int sumarDigitos(String numero) {
        if (numero == null) {
            throw new IllegalArgumentException("El numero no puede ser nulo");
        }

        if (numero.isEmpty()) {
            throw new IllegalArgumentException("El numero no puede estar vacio");
        }

        int suma = 0;

        for (int i = 0; i < numero.length(); i++) {
            char caracter = numero.charAt(i);

            if (caracter < '0' || caracter > '9') {
                throw new IllegalArgumentException("El numero solo puede contener digitos");
            }

            int digito = Integer.parseInt(String.valueOf(caracter));
            suma = suma + digito;
        }

        return suma;
    }
}
