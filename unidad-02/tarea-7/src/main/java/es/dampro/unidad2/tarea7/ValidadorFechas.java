package es.dampro.unidad2.tarea7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

/**
 * Valida y convierte textos con formato dd/MM/uuuu en fechas.
 *
 * @author RhazarDev
 * @version 1.0
 */
public final class ValidadorFechas {
    private ValidadorFechas() { }

    /**
     * Convierte un texto con formato dd/MM/uuuu en una fecha.
     *
     * @param texto texto con la fecha en formato dd/MM/uuuu
     * @return fecha correspondiente al texto
     * @throws java.time.format.DateTimeParseException si el texto es inválido
     */
    public static LocalDate validarFecha(String texto) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
        return LocalDate.parse(texto, formato);
    }
}
