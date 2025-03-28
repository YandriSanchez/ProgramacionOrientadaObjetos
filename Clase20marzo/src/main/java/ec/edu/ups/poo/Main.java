package ec.edu.ups.poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ejercicio ejercicios = new Ejercicio();

        System.out.println("------Ejercicio1------");
        System.out.print("Ingrese la cantidad de números a sumar: ");
        int n = scanner.nextInt();
        int resultado = ejercicios.sumarPrimerosNumeros(n);
        System.out.println("La suma de los primeros " + n + " números naturales es: " + resultado);

        System.out.println("------Ejercicio2------");
        System.out.print("Ingrese un número para verificar si es primo: ");
        int num = scanner.nextInt();
        boolean esPrimo = ejercicios.esNumeroPrimo(num);
        if (esPrimo) {
            System.out.println("El número " + num + " es primo.");
        } else {
            System.out.println("El número " + num + " no es primo.");
        }

        System.out.println("------Ejercicio3------");
        System.out.print("Ingrese el número del que quiere encontrar el múltiplo: ");
        int numero = scanner.nextInt();
        System.out.print("Ingrese el límite a partir del cual buscar el múltiplo: ");
        int limite = scanner.nextInt();
        int resultado3 = ejercicios.primerMultiploMayor(numero, limite);
        System.out.println("El primer múltiplo de " + numero + " mayor que " + limite + " es: " + resultado3);
    }
}

