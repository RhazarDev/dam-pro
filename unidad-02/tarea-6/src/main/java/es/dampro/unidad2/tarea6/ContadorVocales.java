package es.dampro.unidad2.tarea6;

/**
 * Clase que cuenta las vocales de un texto
 * @author RhazarDev
 * @version 1.0.0
 */
public class ContadorVocales {

    /**
     * Funcion que cuenta las vocales de una cadena
     * @param sCadena String que contiene la cadena
     * @return int con el numero de vocales
     */
    static int contarVocales (String sCadena) {
        if (sCadena == null || sCadena.isEmpty()) {
            return 0;
        }
        int resultado = 0;
        sCadena = sCadena.toLowerCase();
        for (int i = 0; i < sCadena.length(); i++) {

            char caracter = sCadena.charAt(i);

            if (caracter == 'a' || caracter == 'á' || caracter == 'e' || caracter == 'é'
                    || caracter == 'i' || caracter == 'í' || caracter == 'ó'
                    || caracter == 'o' || caracter == 'u' || caracter == 'ú' || caracter == 'ü') {
                resultado ++;
            }

        }

        return resultado;
    }

}