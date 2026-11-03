package es.dampro.unidad2.tarea6;

/**
 * Clase que calcula el discriminante de una funcion cuadratica
 * @author RhazarDev
 * @version 1.0.0
 */
public final class EcuacionCuadratica {
    private EcuacionCuadratica() { }

    /**
     * Funcion que calcula el discriminante de una funcion cuadratica
     * @param coeficienteA String con el numero que representa A.
     * @param coeficienteB String con el numero que representa B.
     * @param coeficienteC String con el numero que representa C.
     * @return Documenta el valor devuelto.
     */
    public static double calcularDiscriminante(String coeficienteA, String coeficienteB, String coeficienteC) {
        double A = Double.parseDouble(coeficienteA);
        double B = Double.parseDouble(coeficienteB);
        double C = Double.parseDouble(coeficienteC);
        if (A == 0) {
            return 0;
        }
        A = Math.abs(A);
        B = Math.abs(B);
        C = Math.abs(C);

        return (B*B) - 4*A*C;
    }
}
