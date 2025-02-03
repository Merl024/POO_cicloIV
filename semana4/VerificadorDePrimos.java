
package semana4;

import java.util.Scanner;

public class VerificadorDePrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solo pedimos si el numero es primo
        System.out.println("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        int divisor = 3;
        boolean esPrimo = true;
        // Calculamos el limite para el bucle, que es la raiz cuadrada del numero
        int limite  =  (int) Math.sqrt(numero);
        // Casting cuando se fuerza a un numero primitivo a otro numero primitivo
        // Los primos solo son los que son mayor que 1, asi que validamos eso antes de entrar
        if (numero <= 1){
            System.out.println("El numero debe ser mayor o igual a 1.");
        } else if (numero == 2 || numero == 3){ 
            // Sabemos que estos dos son primos y no conviene que sean los primeros que empiecen.
            System.out.println("El numero es primo");
        } else if (numero % 2 == 0) {
            // Sabemos que los demas pares uqe no sea 2, NO SON PRIMOS, asi que hacemos la validacion
            System.out.println("El numero no es primo");
        } else {
            while(divisor <= limite){ 
                if (numero % divisor == 0){
                    System.out.println("El numero no es primo.");
                    esPrimo = false;
                    break;
                }
                divisor += 2;
                // Si no se encuentra ningun divisor, entonces decimos que el numero es primo
            }
            if (esPrimo){
                System.out.println("El número " + numero + " es primo.");
            }
        }
    }
}
