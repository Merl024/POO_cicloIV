import java.util.Scanner;

public class EjemploInput{
    public static void main(String[] args) {
        /*/ Este es el input de Java, se tiene que crear la instancia para poder utilizar 
        la libreria (la cual se importa automaticamente). Y dentro del parentesis de la creacion de la instancia
        va de donde se saca, es decir el source
        */
        Scanner scanner = new Scanner(System.in); // La manera en que se nombra la libreria puede ser solo 's'
                                                  // pero por buena practica es bueno poner scanner

        // Solicitamos informacion al usuario
        System.out.println("Ingrese su nombre: ");
            //El metodo .nextline es un metodo propio de Scanner y en nombre es donde se guardara el dato
        String nombre = scanner.nextLine(); //Capturamos el datos

        System.out.println("Bienvenida " + nombre); // Imprimimos el dato capturado.
    }
}