
package repasoClase.clase08;

import java.util.Scanner;
/* Escriba un juego de computadora donde la computadora genera un número aleatorio de 1 a 100, y el usuario intenta adivinar. 
En cada intento, la computadora le indica al usuario si el número provisto es muy alto o muy bajo, hasta que el usuario acierte. */

public class JuegoAdivinanza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                           // (int)(Math.random() * range) + min     
        int numeroRandom = (int)(Math.random() * 100) + 1;

        System.out.println("Adivina un número entre 1 y 100:");
        int numeroUsuario = scanner.nextInt();

        while (numeroUsuario != numeroRandom){
            if (numeroUsuario > numeroRandom){
                System.out.println("El numero es muy alto. Intenta de nuevo:");
                numeroUsuario = scanner.nextInt();
            } else{
                System.out.println("El numero es muy bajo. Intenta de nuevo:");
                numeroUsuario = scanner.nextInt();
            }
        }
        System.out.println("Felicidades! Has acertado el número. " + numeroRandom);
    }
}
