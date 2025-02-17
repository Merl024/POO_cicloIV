
package repasoClase.clase08;

import java.util.Scanner;

/* • Escriba un programa que pida al usuario un número entero positivo y
genere la suma de todos los enteros del 1 al número ingresado, usando un loop while */

public class SumaProgresiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero sin decimales arriba de 0: ");
        int numero = scanner.nextInt();
        int contador = 1;
        int suma = 0;
        while (contador <= numero) {
            suma += 1;
            contador++;
        }
        System.out.println(suma);
    }
}
