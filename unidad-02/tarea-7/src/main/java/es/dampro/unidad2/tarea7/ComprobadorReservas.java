package es.dampro.unidad2.tarea7;

import java.time.LocalDateTime;

/**
 * Comprueba si dos reservas se solapan en el tiempo.
 *
 * @author RhazarDev
 * @version 1.0
 */
public final class ComprobadorReservas {
    private ComprobadorReservas() { }

    /**
     * Indica si dos reservas del tipo [inicio, fin) se cruzan.
     *
     * @param inicio1 inicio de la primera reserva
     * @param fin1 fin de la primera reserva
     * @param inicio2 inicio de la segunda reserva
     * @param fin2 fin de la segunda reserva
     * @return true si las reservas se solapan, false en caso contrario
     * @throws IllegalArgumentException si algún fin no es posterior a su inicio
     */
    public static boolean haySolapamiento(LocalDateTime inicio1, LocalDateTime fin1, LocalDateTime inicio2, LocalDateTime fin2) {
        if (!fin1.isAfter(inicio1)) {
            throw new IllegalArgumentException("El fin de la primera reserva debe ser posterior a su inicio");
        }
        if (!fin2.isAfter(inicio2)) {
            throw new IllegalArgumentException("El fin de la segunda reserva debe ser posterior a su inicio");
        }
        return inicio1.isBefore(fin2) && inicio2.isBefore(fin1);
    }
}
