
package repasoClase.clase08;
// • Construya un programa que cuente cuantos dígitos tiene un número entero ingresado por el usuario.

import java.util.Scanner;


public class ContadorDeDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        int contador = 0;  

        while (numero>0){ // Sigue iterando hasta que se haga negativo. 
            numero /= 10;
            contador++;
    /* For example:
        1234 / 10 = 123 (4 is removed)
        123 / 10 = 12 (3 is removed)
        12 / 10 = 1 (2 is removed)
        1 / 10 = 0 (1 is removed)
        By repeatedly dividing by 10, the algorithm is systematically removing one digit at a time from the right side of the number. 
        The loop continues this process until the number becomes 0, at which point all digits have been removed and counted. 
    */
        }
        System.out.println("Tiene " + contador + " digitos.");
    
    }
}
