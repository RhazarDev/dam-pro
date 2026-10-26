package ies.puerto.es;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author RhazarDev
 * @version 1.0.0
 */
public class GestorCalificaciones {

    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        boolean salir = false;
        Scanner teclado = new Scanner(System.in);

        do {
            Double nota = solicitarNotaValida(teclado);
            notas.add(nota);
            System.out.println("Deseas añadir otra nota: true/false");
            String sSalir = teclado.nextLine();
            salir = Boolean.parseBoolean(sSalir);
        } while (salir);

        System.out.println("Lista de notas:"+notas);
        double media = calcularMedia(notas);
        System.out.println("La nota media es:"+media);
        double minimo = obtenerMinima(notas);
        System.out.println("El valor minimo es:"+minimo);
        double maximo = obtenerMaxima(notas);
        System.out.println("El valor maximo es:"+maximo);

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

    /**
     * Funcion que solicita la nota del usuario y solo la devuelve en double si es valida
     * @param teclado Scanner de teclado
     * @return double de la nota
     */
    static Double solicitarNotaValida (Scanner teclado) {
        boolean salida = false;
        String sNota;
        System.out.println("Introduce la nota: ");
        sNota = teclado.nextLine();
        double dNota = 0;
        try{
           dNota = convertirNota(sNota);
        } catch (NumberFormatException e) {
            throw new RuntimeException("El numero insertado es incorrecto");
        }
        /**
        do {
            System.out.println("Introduce la nota: ");
            sNota = teclado.nextLine();
            dNota = convertirNota(sNota);
            if (!esNotaValida(sNota)) {
                System.out.println("Nota no valida");
            }
        } while (!esNotaValida(sNota));
         **/
        return dNota;
    }

    /**
     * Funcion que calcula la media de las notas en una lista
     * @param lNotas List de Double que contiene las notas
     * @return double de las notas
     */
    static double calcularMedia (List<Double> lNotas) {
        double media = 0;
        double suma = 0;
        for (int i = 0; i < lNotas.size(); i++) {
            suma = suma + lNotas.get(i);
        }
        media = suma/lNotas.size();
        return media;

    }

    /**
     * Funcion que obtiene la nota maxima de una lista
     * @param lNotas List de Double que contiene las notas
     * @return double del maximo
     */
    static double obtenerMaxima (List<Double> lNotas) {

        double maximo = 0;

        for (int i = 0; i < lNotas.size(); i++) {
            if (lNotas.get(i) > maximo) {
                maximo = lNotas.get(i);
            }
            if (maximo == 10) {
                return maximo;
            }

        }

        return maximo;

    }
    /**
     * Funcion que obtiene la nota minima de una lista
     * @param lNotas List de Double que contiene las notas
     * @return double del minimo
     */
    static double obtenerMinima (List<Double> lNotas) {

        double minimo = 10;

        for (int i = 0; i < lNotas.size(); i++) {
            if (lNotas.get(i) < minimo) {
                minimo = lNotas.get(i);
            }
            if (minimo == 0) {
                return minimo;
            }

        }

        return minimo;

    }


}
