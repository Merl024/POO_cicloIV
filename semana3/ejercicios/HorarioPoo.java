/*Escriba un programa que pida al usuario el día de la semana y le indique si hay clase de Programación Orientada a 
Objetos (en horario regular), utilizando una instrucción switch 
-Lunes, miercoles y viernes
*/
package ejercicios;

import java.util.Scanner;

public class HorarioPoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el día de la semana (1-7): ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1 -> {
                System.out.println("Hay clase de Programación Orientada a Objetos.");
            }
            case 2 -> {
                System.out.println("No hay clase de Programación Orientada a Objetos.");
            }
            case 3 -> {
                System.out.println("Hay clase de Programación Orientada a Objetos.");
            }
            case 4 -> {
                System.out.println("No hay clase de Programación Orientada a Objetos.");
            }
            case 5 -> {
                System.out.println("Hay clase de Programación Orientada a Objetos.");
            }
            case 6, 7 -> {
                System.out.println("Es fin de semana, por lo que no hay clases");
            }
            default -> {
                System.out.println("Ingrese un dia valido.");
            }
        }
    }
}
