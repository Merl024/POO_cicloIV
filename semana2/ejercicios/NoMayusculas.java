
import java.util.Scanner;

/*Escriba un programa que le pida al usuario su primer nombre y su primer apellido, y verifique si ambos están 
escritos en mayúscula. Si no lo están, imprima un mensaje en consola diciendo al usuario: “Recuerde que nombres 
y apellidos se escriben con su primera letra en mayúscula */

public class NoMayusculas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = s.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = s.nextLine();

        if (Character.isUpperCase(nombre.charAt(0)) && Character.isUpperCase(apellido.charAt(0))){
            System.out.println("El nombre esta escrito correctamente");
        } else{
            System.out.println("Los nombres y apellidos se escriben con mayúscula");
        }

        /* EJEMPLO DE ITERADOR FOR */
        // String str = "Programación Orientada a Objetos";
        // for (int i = 0; i < str.length(); i++) {
        // System.out.println(str.charAt(i));
        // }

    }
}
