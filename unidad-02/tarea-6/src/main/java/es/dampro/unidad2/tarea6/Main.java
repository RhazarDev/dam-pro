package es.dampro.unidad2.tarea6;

/**
 * Main que llama a cada algoritmo y enseña los resultados.
 * @author RhazarDev
 * @version 1.0.0
 */
public class Main {

    public static void main(String[] argumentos) {
        System.out.println("BinarioDecimal: " + BinarioDecimal.convertirBinario("11001"));
        System.out.println("InvertirCadena: " + InvertirCadena.invertir("UwU hola"));
        System.out.println("EcuacionCuadratica" + EcuacionCuadratica.calcularDiscriminante("4", "2", "3"));
        System.out.println("Factorial: " + Factorial.calcularFactorial(7));
        System.out.println("Palindromo: " + Palindromo.esPalindromo("Oso baboso"));
        System.out.println("ContadorVocales: " + ContadorVocales.contarVocales("Arándanos"));
        System.out.println("SumaDigitos: " + SumaDigitos.sumarDigitos("20192"));
        System.out.println("MayorNumero: " + MayorNumero.obtenerMayor("28,-4,98"));
        System.out.println("MediaNumeros: " + MediaNumeros.calcularMedia("5525"));
        System.out.println("NumeroPrimo: " + NumeroPrimo.esPrimo("7"));

    }
}


