package es.dampro.unidad2.tarea7;

import java.time.Duration;
import java.time.LocalTime;

/**
 * Calcula el tiempo trabajado en una jornada dentro de un mismo día.
 *
 * @author RhazarDev
 * @version 1.0
 */
public final class CalculadoraJornada {
    private CalculadoraJornada() { }

    /**
     * Calcula la duración entre la entrada y la salida y le resta el descanso.
     *
     * @param entrada hora de entrada al trabajo
     * @param salida hora de salida del trabajo
     * @param descansoMinutos minutos de descanso que se descuentan
     * @return duración del tiempo trabajado
     * @throws IllegalArgumentException si las horas o el descanso no son válidos
     */
    public static Duration calcularTiempoTrabajado(LocalTime entrada, LocalTime salida, int descansoMinutos) {
        if (!salida.isAfter(entrada)) {
            throw new IllegalArgumentException("La salida debe ser posterior a la entrada");
        }
        if (descansoMinutos < 0) {
            throw new IllegalArgumentException("El descanso no puede ser negativo");
        }
        Duration jornada = Duration.between(entrada, salida);
        Duration descanso = Duration.ofMinutes(descansoMinutos);
        if (descanso.compareTo(jornada) > 0) {
            throw new IllegalArgumentException("El descanso no puede ser mayor que la jornada");
        }
        return jornada.minus(descanso);
    }
}
