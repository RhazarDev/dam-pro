package es.dampro.unidad2.tarea7;

import java.time.LocalDateTime;

/**
 * Calcula la fecha y hora de llegada de un viaje.
 *
 * @author RhazarDev
 * @version 1.0
 */
public final class CalculadoraViaje {
    private CalculadoraViaje() { }

    /**
     * Suma las horas y los minutos de duración del viaje a la fecha y hora de salida.
     *
     * @param salida fecha y hora de salida
     * @param horas horas de duración del viaje
     * @param minutos minutos de duración del viaje
     * @return fecha y hora de llegada
     * @throws IllegalArgumentException si las horas o los minutos son negativos
     */
    public static LocalDateTime calcularLlegada(LocalDateTime salida, long horas, long minutos) {
        if (horas < 0 || minutos < 0) {
            throw new IllegalArgumentException("Las horas y los minutos no pueden ser negativos");
        }
        return salida.plusHours(horas).plusMinutes(minutos);
    }
}
