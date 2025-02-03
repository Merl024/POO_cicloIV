
import java.util.Scanner;


public class Login {
    public static void main(String[] args) {
        // Hardacode es dejar algo ya preestablecido en el codigo. 
        String usuario = "Melisa";
        String password = "1234";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre de usuario:");
        String inputUsuario = scanner.nextLine();
        System.out.println("Ingrese su contraseña:");
        String inputPassword = scanner.nextLine();

        /*Comparar si el usuario y pass ingresados son iguales a los correctos, si es asi, imprimir el estado de autentificacion (boolean) */
        // boolean autenticado = (password == inputPassword &&  usuario == inputUsuario);  
                // El signo de igualdad es para hacer comparaciones de tipos primitivos. Y los string NO SON PRIMITIVOS
        boolean autenticado = password.equals(inputPassword) && usuario.equalsIgnoreCase(inputUsuario);
        System.out.println("Usted esta autenticado: " + autenticado);

        scanner.close();
    }
}
