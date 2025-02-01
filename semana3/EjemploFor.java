/* Elabore un programa que pida al usuario un numero natural y luego calcule
 * la suma de todos los numeros naturales menores o iguales a dicho numero
 */
import java.util.Scanner;

public class EjemploFor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero (Del 1 en adelante y sin decimales): ");
        int numero = scanner.nextInt();

        int suma = 0;
        int resta = 0;

        System.out.println("\nSuma");
        for (int i = suma; i<= numero; i++){
            System.out.println(i);
        } 

        System.out.println("\nResta");
        for (int i = numero; i>= resta; i--){
            System.out.println(i);
        } 
    }
}
