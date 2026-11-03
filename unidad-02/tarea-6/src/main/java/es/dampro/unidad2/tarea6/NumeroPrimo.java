package es.dampro.unidad2.tarea6;

/**
 * Clase que calcula si un numero es primo
 * @author RhazarDev
 * @version 1.0.0
 */
public final class NumeroPrimo {
    /**
     * Funcion que calcula si un numero es primo.
     * @param numero String con un numero.
     * @return Boolean Verdadero si es primo; falso en otro caso.
     */
    public static boolean esPrimo(String numero) {
        if (numero == null || numero.isEmpty()) {
            throw new IllegalArgumentException("Los numeros no pueden ser nulos ni estar vacio");
        }

        int iNumero = Integer.parseInt(numero);

        if (iNumero < 2) {
            return false;
        }

        for (int i = 2; i <= iNumero / i; i++) {
            if (iNumero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
