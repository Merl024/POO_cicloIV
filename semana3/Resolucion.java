
import java.util.Scanner;
/* Elabore un programa que pida al usuario un numero natural y luego calcule
 * la suma de todos los numeros naturales menores o iguales a dicho numero
    La logica del ejercicio es como los factoriales
        Round 1: 1
        Round 2: 1 + 2 = 3  
        Round 3: 3 + 2 + 1 = 6
    Es decir el numero ingresado es cuantos rounds se va a sumar
 */

public class Resolucion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero (Del 1 en adelante y sin decimales): ");
        int numero = scanner.nextInt();
        int total = 0;

        for (int i = 0; i <= numero; i++){
            total += i;
        }

        System.out.println("La suma de 1 hasta " + numero +" es igual a: " + total);
        
        scanner.close();
    }
    
}
