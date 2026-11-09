package es.dampro.unidad2.tarea7;

import java.time.LocalDate;

/**
 * Calcula la fecha del próximo cumpleaños de una persona.
 *
 * @author RhazarDev
 * @version 1.0
 */
public final class ProximoCumpleanios {
    private ProximoCumpleanios() { }

    /**
     * Devuelve la fecha del próximo cumpleaños.
     *
     * @param nacimiento fecha de nacimiento
     * @param hoy fecha de hoy
     * @return fecha del próximo cumpleaños
     * @throws IllegalArgumentException si el nacimiento es posterior a hoy
     */
    public static LocalDate calcularProximoCumpleanios(LocalDate nacimiento, LocalDate hoy) {
        if (nacimiento.isAfter(hoy)) {
            throw new IllegalArgumentException("El nacimiento no puede ser posterior a hoy");
        }
        LocalDate cumple = nacimiento.withYear(hoy.getYear());
        if (cumple.isBefore(hoy)) {
            cumple = nacimiento.withYear(hoy.getYear() + 1);
        }
        return cumple;
    }
}
