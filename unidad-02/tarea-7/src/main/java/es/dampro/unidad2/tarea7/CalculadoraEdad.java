package es.dampro.unidad2.tarea7;

import java.time.LocalDate;
import java.time.Period;

/**
 * Calcula la edad exacta de una persona en años, meses y días.
 *
 * @author RhazarDev
 * @version 1.0
 */
public final class CalculadoraEdad {
    private CalculadoraEdad() { }

    /**
     * Calcula el tiempo transcurrido entre el nacimiento y una fecha de referencia.
     *
     * @param nacimiento fecha de nacimiento de la persona
     * @param fechaActual fecha de referencia hasta la que se calcula la edad
     * @return periodo con los años, meses y días de edad
     * @throws IllegalArgumentException si el nacimiento es posterior a la fecha de referencia
     */
    public static Period calcularEdad(LocalDate nacimiento, LocalDate fechaActual) {
        if (nacimiento.isAfter(fechaActual)) {
            throw new IllegalArgumentException("El nacimiento no puede ser posterior a la fecha actual");
        }
        return Period.between(nacimiento, fechaActual);
    }
}
