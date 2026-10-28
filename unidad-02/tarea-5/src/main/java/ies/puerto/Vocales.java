package ies.puerto;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author RhazarDev
 * @version 1.0.0
 */
public class Vocales {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cadena de texto: ");
        String sCadena = teclado.nextLine();
        int resultado = contarVocales(sCadena);
        System.out.println("El numero de vocales es igual a: "+resultado);


    }


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
                    || caracter == 'o' || caracter == 'u' || caracter == 'ú') {
                resultado ++;
            }

        }

        return resultado;
    }

}
