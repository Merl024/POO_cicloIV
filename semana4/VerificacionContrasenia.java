
package semana4;

import java.util.Scanner;

/* Pasos
 * solicitar contraseña
 * verificar -- si es incorrecta la vuelve a solicitar con hasta 3 intentos -- si sobrepasa manda warning
 *           -- si es correcta manejo de exito
 */
public class VerificacionContrasenia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String contrasena = "Melisa01";
        int intentos = 0;
        
        while (intentos < 3){
            System.out.println("Ingrese su contraseña: ");
            String contrasenaIngresada = scanner.nextLine();
            if (contrasenaIngresada.equals(contrasena)){
                System.out.println("Contraseña correcta. Esta siendo ingresado en el sistema... ");
                break;
            } else{
                System.out.println("Contraseña incorrecta, intente de nuevo.");
                intentos++;
            }
        }
        if (intentos == 3){
            System.out.println("Ha superado el número máximo de intentos. Por favor, intente nuevamente más tarde.");
        }
        scanner.close();
    }
}
