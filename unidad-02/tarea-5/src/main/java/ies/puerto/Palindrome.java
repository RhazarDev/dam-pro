package ies.puerto;

import java.util.Scanner;

/**
 * @author RhazarDev
 * @version 1.0.0
 */
public class Palindrome {

    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la palabra o frase a analizar: ");
        String sFrase = teclado.nextLine();
        boolean bPalindrome = esPalindrome(sFrase);
        System.out.println("La palabra/frase es palindrome = " +bPalindrome);
    }

    /**
     * Funcion que recibe una palabra o frase y verifica si es palindrome
     * @param sFrase String que almacena la palabra o frase
     * @return boolean que dice si la frase es palindromo
     */
    static boolean esPalindrome (String sFrase) {
        if (sFrase == null || sFrase.isEmpty()) {
            return false;
        }
        sFrase = sFrase.toLowerCase(); // Transforma a minuscula
        sFrase = sFrase.replace(" ", "");
        for (int i = 0; i < sFrase.length(); i++) {
            char letraIzquierda = sFrase.charAt(i);

            char letraDerecha = sFrase.charAt(sFrase.length() - 1 - i);

            if (letraIzquierda != letraDerecha) {
                return  false;
            }
        }
        return true;
    }
}