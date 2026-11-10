package es.educacion.arrays;

/**
 * Clase que cuenta las notas >= 5. Array vacío: 0. Null: IllegalArgumentException.
 *
 * @author RhazarDev
 * @version 1.0.0
 */
public final class Ejercicio04ContarAprobados {
    private Ejercicio04ContarAprobados() { }

    public static void main(String[] args) {
        int[] notas = {8,7,3,3,10};
        int resultadoAprobados = contarAprobados(notas);
        int resultadoSuspensos = contarSuspensosTop(notas);
        System.out.println("El numero de aprobados es = " +resultadoAprobados);
        System.out.println("El numero de suspensos es = " +resultadoSuspensos);
    }

    /**
     * Funcion que cuenta las notas > 5 como aprobado.
     * @param notas int con las notas
     * @return int con el numero de aprobados
     */
    public static int contarAprobados(int[] notas) {
        if (notas == null || notas.length == 0) {
            throw new IllegalArgumentException("El array es nulo o vacio");
        }
        int aprobados = 0;
        for ( int nota:notas) {
            if (nota >= 5){
                aprobados++;
            }
        }

        return aprobados;
    }

    public static int contarSuspensos(int[] notas) {
        if (notas == null || notas.length == 0) {
            throw new IllegalArgumentException("El array es nulo o vacio");
        }
        int suspensos = 0;
        for ( int nota:notas) {
            if (nota < 5){
                suspensos++;
            }
        }

        return suspensos;
    }

    public static int contarSuspensosTop(int[] notas) {
        return -contarAprobados(notas) + notas.length;
    }
}
