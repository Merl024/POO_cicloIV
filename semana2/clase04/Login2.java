
import java.util.Scanner;

/* Defina en su código un usuario y contraseña.
• Utilice el input en Java para solicitar al usuario un nombre de usuario y contraseña.
• Utilice los métodos de String para comparar el usuario y contraseña ingresada con los guardados en la 
aplicación.
• Para el usuario, no importa si ingresa minúsculas o mayúsculas o espacios de más.
• La contraseña sí debe ser case-sensitive y no contener espacios de más.
• Si ambos coinciden, envíe al usuario el mensaje: “Login exitoso. Se ha autenticado en el sistema”. 
• Si al menos uno no coincide, envíe el mensaje: “Usuario o contraseña incorrectos. No se ha podido autenticar en 
el sistema.”
 */

public class Login2 {
    public static void main(String[] args) {
        String user = "Melisa";
        String password = "Melisa01";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario:");
        String inputUser = scanner.nextLine();
        System.out.println("Ingrese su contraseña:");
        String inputPassword = scanner.nextLine();

        if (inputUser.equalsIgnoreCase(user) && inputPassword.equals(password)){
            System.out.println("Login exitoso. Se ha autenticado en el sistema.");
        } else{
            System.out.println("Usuario o contraseña incorrectos. No se ha podido autenticar en el sistema.");
        }
    }
}
