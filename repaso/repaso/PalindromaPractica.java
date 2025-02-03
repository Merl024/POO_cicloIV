
package repaso;

import java.util.Scanner;

/* Los palindromos es cuando se lee igual al reves y al derecho
 * No importan los espacio ni signos ni puntuacion. 
 */

public class PalindromaPractica {
    public static boolean esPalindromo(String palabra){
        // La ruta nos aportó otro paso natura -- es palindromo
        palabra = palabra.toLowerCase();
        palabra = palabra.replace(" ", "");
        palabra = palabra.replace("[áéíóú]", "[aeiou]");
        palabra = palabra.replaceAll("[.,;:!?/¿¡\"'()\\[\\]{}0-9]", "");
        
        int a = 0;
        int b = palabra.length() - 1;

        for(int i = 0; i < palabra.length(); i++){
            if(palabra.charAt(a) == palabra.charAt(b)){
                a++; // -- Vamos subiendo el indice para que vaya yendo a la derecha
                b--; // -- Vamos bajando el indice para que vaya a la izq. 
            } else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabra;

        System.out.println("Ingrese una palabra o una frase: ");
        palabra = scanner.nextLine();

        boolean palindroma = false;
        if (esPalindromo(palabra)){
            System.out.println("Es palindromo.");
        } else{
            System.out.println("No es palindromo.");
        }

    }
}
