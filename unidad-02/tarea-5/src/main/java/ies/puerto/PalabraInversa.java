package ies.puerto;

import java.util.Scanner;

/**
 * @author RhazarDev
 * @version 1.0.0
 */
public class PalabraInversa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        String sPalabra = teclado.nextLine();
        String sInvertida = reverse(sPalabra);
        System.out.println("Palabra invertida: " +sInvertida);

    }

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

        for (int i = sPalabra.length() -1; i >= 0; i--) {
            char caracter = sPalabra.charAt(i);
            resultado.append(caracter);

        }

        return resultado.toString();
    }

}
