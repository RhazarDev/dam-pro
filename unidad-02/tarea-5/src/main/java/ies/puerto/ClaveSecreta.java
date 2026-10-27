package ies.puerto;

import java.util.Scanner;

/**
 * @author RhazarDev
 * @version 1.0.0
 */
public class ClaveSecreta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la palabra para generar la clave: ");
        String sPalabra = teclado.nextLine();
        String clave = generarClaveSegura(sPalabra);
        System.out.println("Tu clave segura es: " +clave);
    }

    /**
     * Funcion que genera una clave segura a partir de un String
     * @param sPalabra String que almacena la palabra
     * @return String con la clave segura
     */
    static String generarClaveSegura(String sPalabra) {
        if (sPalabra == null || sPalabra.isEmpty()) {
            return "";
        }

        sPalabra.replace("a", "?");
        sPalabra.replace("A", "?");
        sPalabra.replace("e", "S");
        sPalabra.replace("E", "S");
        sPalabra.replace("u", "x");
        sPalabra.replace("U", "x");
        sPalabra.replace("i", "!");
        sPalabra.replace("I", "!");
        sPalabra.replace("o", "4");
        sPalabra.replace("O", "4");

        String clave = sPalabra;
        return clave;
    }
}
