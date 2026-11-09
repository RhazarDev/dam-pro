package es.dampro.unidad2.tarea7;

import java.time.LocalDate;

/**
 * Analiza una fecha y devuelve sus datos principales en una sola cadena: fecha ISO, día de la semana, día del año, si el año es bisiesto y días del mes.
 *
 * @author RhazarDev
 * @version 1.0
 */
public final class AnalizadorFecha {
    private AnalizadorFecha() { }

    /**
     * Construye una cadena con los datos de la fecha.
     * @param fecha fecha que se quiere analizar
     * @return cadena con la fecha ISO
     */
    public static String analizarFecha(LocalDate fecha) {
        String resultado = fecha.toString() + "|" + fecha.getDayOfWeek() + "|" + fecha.getDayOfYear() + "|" + fecha.isLeapYear() + "|" + fecha.lengthOfMonth();
        return resultado;
    }
}
