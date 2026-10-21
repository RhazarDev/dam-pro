package ies.puerto.es;

import java.util.Scanner;

/**
 * @author RhazarDev
 * @version 1.0.0
 */
public class DatosPersonales {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String sNombre = teclado.nextLine();
        System.out.println("Introduce la edad");
        String sEdad = teclado.nextLine();
        System.out.println("Introduce la altura");
        String sAltura = teclado.nextLine();
        System.out.println("Introduce la matricula");
        String sMatricula = teclado.nextLine();
        System.out.println("Introduce la edad");
        double dAltura = convertirAltura(sAltura);
        int iEdad = convertirEdad(sEdad);
        boolean bMatricula = convertirMatricula(sMatricula);
        boolean bMayorEdad = esMayorDeEdad(iEdad);

        String ficha = formatearFicha(sNombre,iEdad,dAltura,bMatricula,bMayorEdad);
        System.out.println(ficha);
    }

    /**
     * Funcion que transforma la edad en String a int
     * @param sEdad String que almacena la edad
     * @return int de la edad
     */
    static int convertirEdad(String sEdad) {
        if (sEdad == null) {
            return  0;
        }
        return Integer.parseInt(sEdad);
    }

    /**
     * Funcion que transforma la altura en String a double
     * @param sAltura String que almacena la edad
     * @return double de la altura
     */
    static double convertirAltura (String sAltura) {
        if (sAltura == null || sAltura.isEmpty()) {
            return 0;
        }
        return Double.parseDouble(sAltura);
    }

    /**
     * Funcion que transforma la matricula a boolean
     * @param sMatricula String que almacena la matricula
     * @return boolean de la matricula
     */
    static boolean convertirMatricula (String sMatricula) {
        if (sMatricula == null || sMatricula.isEmpty()) {
            return false;
        }
        return Boolean.parseBoolean(sMatricula);
    }

    /**
     * Funcion que comprueba si es mayor de edad y transforma un int a un boolean
     * @param iEdad int que almacena la edad
     * @return boolean de la edad
     */
    static boolean esMayorDeEdad (int iEdad) {
        return iEdad >= 18;
    }

    /**
     * Funcion que transforma un int a un Integer
     * @param iEdad int que almacena la edad
     * @return Integer de la edad
     */
    static Integer convertirEdadAEnvolvente (int iEdad) {
        return Integer.valueOf(iEdad);
    }

    /**
     * Funcion que transforma un Integer a un int
     * @param iEdad integer que almacena la edad
     * @return int de la edad
     */
    static int recuperarEdadPrimitiva (Integer iEdad) {
        if (iEdad == null) {
            return 0;
        }
        return iEdad.intValue();
    }

    /**
     * Funcion que formatea la ficha
     * @param sNombre String que almacena el nombre de la ficha
     * @param iEdad Integer edad de la ficha
     * @param dAltura doble altura de la ficha
     * @param bMatricula boolean matricula de la ficha
     * @param bMayorEdad boolean mayor de edad de la ficha
     * @return String de la ficha
     */
    static String formatearFicha (String sNombre, int iEdad, double dAltura
            , boolean bMatricula, boolean bMayorEdad) {
        return "Ficha: "+sNombre+" ,edad: " +iEdad+ " ,altura: "+dAltura
                +" ,matricula: "+bMatricula+" ,mayor de edad: "+bMayorEdad;

    }

}

