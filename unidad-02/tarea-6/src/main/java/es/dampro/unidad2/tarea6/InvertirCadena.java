package es.dampro.unidad2.tarea6;

/**
 * Clase que invierte una cadena de texto
 * @author RhazarDev
 * @version 1.0.0
 */
public final class InvertirCadena {
    /**
     * Crea una palabra o texto invertida a la original
     * @param sPalabra String que almacena la Palabra/texto original
     * @return String Cadena invertida
     */
    static String reverse(String sPalabra) {
        StringBuilder resultado = new StringBuilder();
        if (sPalabra == null || sPalabra.isEmpty()) {
            return resultado.toString();
        }

        for (int i = sPalabra.length() - 1; i >= 0; i--) {
            char caracter = sPalabra.charAt(i);
            resultado.append(caracter);

        }
        return resultado.toString();
    }

}
