package ies.puerto.es;

import java.util.Scanner;

/**
 * @author RhazarDev
 * @version 1.0.0
 */
public class AnalizadorContrasena {
    /**
     * Programa principal
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la cadena");
        String sCadena = teclado.nextLine();
        String resultado = generarInforme(sCadena);
        System.out.println(resultado);

    }

    /**
     * Funcion que cuenta el numero de mayusculas de una cadena
     * @param sCadena String cadena de texto
     * @return int con el numero de mayusculas
     */
    static int contarMayusculas (String sCadena) {
        int numero = 0;
        for (int i = 0; i < sCadena.length(); i++) {
            char caracter = sCadena.charAt(i);

            if (Character.isAlphabetic(caracter) && Character.isUpperCase(caracter)){
                numero ++;
            }
        }
        return numero;
    }

    /**
     * Funcion que cuenta el numero de minusculas de una cadena
     * @param sCadena String cadena de texto
     * @return int con el numero de minusculas
     */
    static int contarMinusculas (String sCadena) {
        return sCadena.length() - contarMayusculas(sCadena) - contarDigitos(sCadena) - contarSimbolos(sCadena);
        /**
        for (int i = 0; i < sCadena.length(); i++) {
            char caracter = sCadena.charAt(i);
            if (Character.isAlphabetic(caracter) && Character.isLowerCase(caracter)){
                numero ++;
            }
        }
         **/
    }

    /**
     * Funcion que cuenta el numero de digitos en una cadena
     * @param sCadena String cadena de texto
     * @return int con el numero de digitos
     */
    static int contarDigitos (String sCadena) {
        int numero = 0;
        for (int i = 0; i < sCadena.length(); i++) {
            char caracter = sCadena.charAt(i);
            if (Character.isDigit(caracter)){
                numero ++;
            }
        }
        return numero;
    }

    /**
     * Funcion que cuenta el numero de simbolos de una cadena
     * @param sCadena String cadena de texto
     * @return int con el numero de digitos
     */
    static int contarSimbolos (String sCadena) {
        int numero = 0;
        for (int i = 0; i < sCadena.length(); i++) {
            char caracter = sCadena.charAt(i);
            if (!Character.isLetterOrDigit(caracter)){
                numero ++;
            }
        }
        return numero;
    }

    /**
     * Funcion que comprueba si la contraseña es tiene 8 caracteres
     * @param sCadena String cadena de texto
     * @return boolean que devuelve si la contraseña es valida
     */
    static boolean tieneLongitudMinima(String sCadena) {
        return sCadena.length() >= 8;
    }

    /**
     * Funcion que comprueba si la contraseña es valida
     * @param sCadena String cadena de texto
     * @return boolean que devuelve si la contraseña es valida
     */
    static boolean esContrasenaValida(String sCadena) {
        if (!tieneLongitudMinima(sCadena)) {
            return false;
        }
        if (contarMayusculas(sCadena) < 1) {
            return false;
        }
        if (contarDigitos(sCadena) < 1) {
            return false;
        }
        if (contarMinusculas(sCadena) < 1) {
            return false;
        }
        return true;
    }

    static String generarInforme(String sCadena) {
        return "Digitos: " +contarDigitos(sCadena)+
                " Resultado: " +esContrasenaValida(sCadena);
    }
}
