
package repasoClase.clase08;

import java.util.Scanner;

/* Escriba un programa de Java para encontrar el mayor de tres números ingresados por el usuario. */

public class numeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        int numero2 = scanner.nextInt();
        System.out.println("Ingrese el tercer número:");
        int numero3 = scanner.nextInt();

        int[] numeros = {numero1, numero2, numero3};
        int mayor = numeros[0];
        /*  Se inicializa con la primera posicion del arreglo y no con 0, para 
        * asegurarse que 1. se esta comparando con los numeros de su arreglo
        * 2. si en algun caso llega a poner numeros negativos no haya una mala comparacion
        */
        /* int mayor = 0;
         * Ingrese el primer número:
            -19
            Ingrese el segundo número:
            -20
            Ingrese el tercer número:
            -1
            El número mayor es: 0 --> siempre sera 0 el numero mayor
        */
         
        for (int numero : numeros){
            if (numero > mayor){
                mayor = numero;
            }
        }

        System.out.println("El número mayor es: " + mayor);
    }
}
