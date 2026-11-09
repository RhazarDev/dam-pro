package es.dampro.unidad2.tarea7;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Convierte fechas y horas con zona horaria a otra zona horaria.
 *
 * @author RhazarDev
 * @version 1.0
 */
public final class ConversorZonasHorarias {
    private ConversorZonasHorarias() { }

    /**
     * Convierte una fecha y hora a otra zona horaria.
     *
     * @param fechaOrigen fecha y hora con su zona de origen
     * @param zonaDestino zona horaria a la que se quiere convertir
     * @return fecha y hora equivalente en la zona de destino
     */
    public static ZonedDateTime convertirZona(ZonedDateTime fechaOrigen, ZoneId zonaDestino) {
        return fechaOrigen.withZoneSameInstant(zonaDestino);
    }
}
