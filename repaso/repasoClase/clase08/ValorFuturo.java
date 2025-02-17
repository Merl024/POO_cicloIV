
package repasoClase.clase08;

import java.util.Scanner;

/* Escriba un programa de Java que pida al usuario una cantidad de dinero, una tasa de interés, y un número de 
períodos, para indicar al usuario el valor futuro de dicha cantidad.

VF = p * ( (1+ (r/p) )^(p*r) ) */

public class ValorFuturo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su valor incial: ");
        double principal = scanner.nextDouble();

        System.out.println("Ingrese la tasa de interes anual: ");
        double tasa = scanner.nextDouble();
        tasa /= 100;

        // System.out.println("La tasa de interes anual esta capitalizada anual? Presione 'S' (Si) o 'N' (No) : ");
        // String capitalizadoAnual = scanner.nextLine();

        System.out.println("Cuantas veces se capitaliza en el año: ");
        int capitalizacion = scanner.nextInt();
        double interesCompuesto = tasa / capitalizacion;

        System.out.println("Ingrese el número de periodos en años: ");
        int periodos = scanner.nextInt();
        // VF = p * ( (1+ (r/p) )^(p*r) )
        double valorFuturo = principal * Math.pow((1 + (interesCompuesto)), (capitalizacion * periodos));
        System.out.println("El valor futuro es: $" + Math.round(valorFuturo));

        scanner.close();

    }
}
