
package repasoClase.clase08;

import java.util.Scanner;

/*• Escriba un programa de Java que redondee el resultado de la división de dos números ingresados por el usuario. */

public class Redondeo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = num1 / num2;
        double redondeado = Math.round(resultado);
        System.out.println("El resultado redondeado es: " + redondeado);
    }
}
