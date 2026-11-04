package es.dampro.unidad2.tarea6;

import java.util.Scanner;

import static es.dampro.unidad2.tarea6.BinarioDecimal.convertirBinario;
import static es.dampro.unidad2.tarea6.ContadorVocales.contarVocales;
import static es.dampro.unidad2.tarea6.EcuacionCuadratica.calcularDiscriminante;
import static es.dampro.unidad2.tarea6.Factorial.calcularFactorial;
import static es.dampro.unidad2.tarea6.InvertirCadena.invertir;
import static es.dampro.unidad2.tarea6.MayorNumero.obtenerMayor;
import static es.dampro.unidad2.tarea6.MediaNumeros.calcularMedia;
import static es.dampro.unidad2.tarea6.NumeroPrimo.esPrimo;
import static es.dampro.unidad2.tarea6.Palindromo.esPalindromo;
import static es.dampro.unidad2.tarea6.SumaDigitos.sumarDigitos;

public class Main {

    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena");
        String texto = teclado.nextLine();

        System.out.println("Introduce el numero binario");
        String binario = teclado.nextLine();

        System.out.println("Introduce los digitos a sumar");
        String numeroSuma = teclado.nextLine();

        System.out.println("Introduce numeros para calcular una media");
        String numerosMedia = teclado.nextLine();

        System.out.println("Introduce un numero para calcular factorial");
        int numeroFactorial = teclado.nextInt();

        System.out.println("Introduce el numero para ver si es primo");
        String numeroPrimo = teclado.nextLine();

        System.out.println("Introduce el termino cuadratico de la ecuacion cuadratica:");
        String numeroA = teclado.nextLine();

        System.out.println("Introduce el termino lineal de la ecuacion cuadratica:");
        String numeroB = teclado.nextLine();

        System.out.println("Introduce el termino independiente de la ecuacion cuadratica:");
        String numeroC = teclado.nextLine();

        System.out.println("Introduce los una serie de digitos separados por comas");
        String numeros = teclado.nextLine();






        int vocales = contarVocales(texto);
        System.out.println("Contar Vocales: " + vocales);

        boolean palindromo = esPalindromo(texto);
        System.out.println("Es palindromo? " + palindromo);


        boolean primo = esPrimo(numeroPrimo);
        System.out.println("Es primo el  numero?" + primo);

        int suma = sumarDigitos(numeroSuma);
        System.out.println("Suma de los digitos: " + suma);

        int mayor = obtenerMayor(numeros);
        System.out.println("Obtener Mayor: " + mayor);

        double media = calcularMedia(numerosMedia);
        System.out.println("La media es:" + media);

        String cadenaInvertida = invertir(texto);
        System.out.println("Cadena Invertida: " + cadenaInvertida);

        int binarioConvertido = convertirBinario(binario);
        System.out.println("Binario convertido a decimal: " + binarioConvertido);

        int factorial = calcularFactorial(numeroFactorial);
        System.out.println("Numero factorial: " + factorial);


        double discriminante = calcularDiscriminante(numeroA, numeroB, numeroC);
        System.out.println("Discriminante calculado: " + discriminante);


    }
}
