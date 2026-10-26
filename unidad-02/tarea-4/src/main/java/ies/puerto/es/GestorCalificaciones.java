package ies.puerto.es;

import java.util.Scanner;

/**
 * @author RhazarDev
 * @version 1.0.0
 */
public class GestorCalificaciones {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        solicitarNotaValida(teclado);
    }

    /**
     * Funcion que transforma el numero de notas en String a int
     * @param sNumeroNotas String que representa el numero de notas
     * @return int del numero de notas
     */
    static int convertirNumeroNotas (String sNumeroNotas) {
        if (sNumeroNotas == null || sNumeroNotas.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(sNumeroNotas);
    }

    /**
     * Funcion que transforma la nota de String a double
     * @param sNota String que representa la nota
     * @return double de la nota
     */
    static double convertirNota (String sNota) {
        if (sNota == null || sNota.isEmpty()) {
            return 0;
        }
        return Double.parseDouble(sNota);
    }

    /**
     * Funcion que transforma la nota de String/double a un boolean
     * @param sNota String que representa la nota
     * @return boolean de la nota
     */
    static boolean esNotaValida (String sNota) {
        if (sNota == null || sNota.isEmpty()) {
            return false;
        }
        double dNota = convertirNota(sNota);
        return Double.isFinite(dNota) && dNota >= 0 && dNota <= 10;
    }

    static double solicitarNotaValida (Scanner teclado) {
        boolean salida = false;
        do {
            System.out.println("Introduce la nota: ");
            String sNota = teclado.nextLine();
            double nota = convertirNota(sNota);
            if (!esNotaValida(sNota)) {
                System.out.println("Nota no valida");
            }
        } while (!salida);

        return 0;
    }



}
