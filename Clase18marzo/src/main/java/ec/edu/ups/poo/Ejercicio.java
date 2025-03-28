package ec.edu.ups.poo;

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nElige una opción:");
            System.out.println("1. Calculadora");
            System.out.println("2. Sistema de Calificaciones");
            System.out.println("3. Conversión de Notas");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calculadora(scanner);
                    break;
                case 2:
                    sistemaDeCalificaciones(scanner);
                    break;
                case 3:
                    conversionDeNotas(scanner);
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Terminado....");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
        scanner.close();
    }

    public static void calculadora(Scanner scanner) {
        System.out.println("Introduce el primer número:");
        int num1 = scanner.nextInt();

        System.out.println("Introduce el segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Elige una operación: 1. suma, 2. resta , 3. multiplicación " +
                ", 4. división:");
        int operacion = scanner.nextInt();

        switch (operacion) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
        }
    }

    public static void sistemaDeCalificaciones(Scanner scanner) {
        System.out.println("Introduce la calificación (0-100):");
        int calificacion = scanner.nextInt();

        if (calificacion >= 70) {
            System.out.println("¡APROBADO!");
        } else {
            System.out.println("REPROBADO.");
        }
    }

    public static void conversionDeNotas(Scanner scanner) {
        System.out.println("Introduce la calificación (0-10):");
        int calificacion = scanner.nextInt();
        char nota;

        switch (calificacion) {
            case 10:
            case 9:
                nota = 'A';
                break;
            case 8:
                nota = 'B';
                break;
            case 7:
                nota = 'C';
                break;
            case 6:
                nota = 'D';
                break;
            default:
                nota = 'F';
        }

        System.out.println("La nota correspondiente es: " + nota);
    }
}
