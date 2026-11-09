package es.dampro.unidad2.tarea7;

import java.time.LocalDate;

/**
 * Calcula fechas de vencimiento sumando o restando años, meses y días a una fecha.
 *
 * @author RhazarDev
 * @version 1.0
 */
public final class CalculadoraVencimientos {
    private CalculadoraVencimientos() { }

    /**
     * Aplica a la fecha primero los años, después los meses y por último los días.
     *
     * @param fecha fecha de partida
     * @param dias días que se suman (o restan si es negativo)
     * @param meses meses que se suman (o restan si es negativo)
     * @param anios años que se suman (o restan si es negativo)
     * @return fecha de vencimiento resultante
     */
    public static LocalDate calcularVencimiento(LocalDate fecha, int dias, int meses, int anios) {
        LocalDate resultado = fecha.plusYears(anios);
        resultado = resultado.plusMonths(meses);
        resultado = resultado.plusDays(dias);
        return resultado;
    }
}
