package ec.edu.ups.poo;

public class Ejercicio {

    public int sumarPrimerosNumeros(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    public boolean esNumeroPrimo(int num) {
        int contadorDivisores = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contadorDivisores++;
            }
        }

        return contadorDivisores == 2;
    }

    public int primerMultiploMayor(int numero, int limite) {
        int multiplo = limite + 1; // Comenzamos con el siguiente número después del límite
        do {
            if (multiplo % numero == 0) {
                break; // Si encontramos un múltiplo, salimos del bucle
            }
            multiplo++;
        } while (true); // Continuamos el bucle hasta que encontremos el múltiplo
        return multiplo;
    }

}
