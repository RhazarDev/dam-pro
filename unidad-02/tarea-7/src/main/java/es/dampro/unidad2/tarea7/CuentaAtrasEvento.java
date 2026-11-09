package es.dampro.unidad2.tarea7;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Calcula cuántos días faltan para un evento.
 *
 * @author RhazarDev
 * @version 1.0
 */
public final class CuentaAtrasEvento {
    private CuentaAtrasEvento() { }

    /**
     * Calcula los días naturales entre hoy y la fecha del evento.
     *
     * @param hoy fecha de hoy
     * @param evento fecha del evento
     * @return días que faltan para el evento
     */
    public static long calcularDiasRestantes(LocalDate hoy, LocalDate evento) {
        return ChronoUnit.DAYS.between(hoy, evento);
    }
}
