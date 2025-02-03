/*
Desarrolle un programa que reescriba un texto usando mayúsculas y minúsculas en forma alternada. 
Por ejemplo, el texto “Programacion” lo transforma a “PrOgRaMaCiOn
 */

package ejercicios;

import java.util.Scanner;

public class AlternacionMayusculas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una materia:");
        String materia = s.nextLine();
        String output = "";
        for (int i = 0; i < materia.length(); i++) {
            char caracter = materia.charAt(i);
            if ( i % 2 == 0){ // Si numero del caracter de la palabra es par la hara mayuscula
                output += Character.toUpperCase(caracter);
            }else{ // caso contrario, la hara pequeña
                output += Character.toLowerCase(caracter);
            }
        }
        System.out.println(output);
    }
}
