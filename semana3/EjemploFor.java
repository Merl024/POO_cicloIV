/* Elabore un programa que pida al usuario un numero natural y luego calcule
 * la suma de todos los numeros naturales menores o iguales a dicho numero
 */
import java.util.Scanner;

public class EjemploFor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero (Del 1 en adelante y sin decimales): ");
        int numero = scanner.nextInt();

        int suma = 0;
        int resta = 0;

        // System.out.println("\nSuma");
        for (int i = suma; i<= numero; i++){
            // System.out.println(i);
        } 

        // System.out.println("\nResta");
        for (int i = numero; i>= resta; i--){
            // System.out.println(i);
        } 
        scanner.close();

        /* ############ EJEMPLOS CON ARREGLOS ############ */
        int[] arreglo = {1, 2, 3, 4, 5}; 
        // int largo = arreglo.length;
        // for(int i=0; i<largo; i++){
            // System.out.println("El cuadrado de " + arreglo[i] + " es " +
            // (arreglo[i]*arreglo[i]));
        // }   
        
        String[] carrerasEsen = {"LEN", "LCJ", "IDN", "ISND"}; 
        int largo = carrerasEsen.length;
        for ( int i=0; i<largo; i++ ){
            // Se ouede ocupar esto para ignorar los espacios
            if(carrerasEsen[i].equals("LCJ")){
                continue;
            }
            System.out.println(carrerasEsen[i]);
        }

        String text = "Hola, mi nombre es melisa. ";


    }
}
