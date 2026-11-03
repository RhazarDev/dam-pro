package es.dampro.unidad2.tarea6;

/**
 * Clase que comprueba si una palabra es palindroma
 */
public final class Palindromo {
    /**
     * Funcion que comprueba si una palabra se lee del frente que al reves.
     * @param frase String que tiene una frase.
     * @return Boolean que pone True si una frase es palindrome.
     */
    public static boolean esPalindromo(String frase) {
        if (frase == null) {
            throw new IllegalArgumentException("La frase no puede ser nula");
        }

        if (frase.isEmpty()) {
            return false;
        }

        frase = frase.toLowerCase();
        frase = frase.replace(" ", "");

        if (frase.isEmpty()) {
            return false;
        }

        for (int i = 0; i < frase.length(); i++) {
            char letraIzquierda = frase.charAt(i);
            char letraDerecha = frase.charAt(frase.length() - 1 - i);
            if (letraIzquierda != letraDerecha) {
                return false;
            }
        }
        return true;
    }
}
