
package repasoClase.clase08;

import java.util.Scanner;

/* Escriba un programa que pida al usuario dos o más números enteros y luego calcule el promedio de los mismos, 
también pidiéndole al usuario cuándo ha terminado de ingresar números. */

public class PomedioNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean scan = true;
        boolean proceso = true;

        while (scan) {
            System.out.println("Cuantos datos le gustaria promediar? ");
            System.out.println("O presione 0 para salir.");
            int numero = scanner.nextInt();
            int suma = 0;
            int[] datos = new int[numero]; // Creando el arreglo para alamcenar todos los datos. 
            // [0, 0, 0]
            if (numero == 0) {
                scan = false;
                proceso = false;
                System.out.println("Saliendo del sistema...");
            } else{
                while(proceso){
                    System.out.println("Escriba el numero: ");
                    for (int i=0; i <datos.length; i++){
                        datos[i] = scanner.nextInt(); // Cada vez que cambie de posicion, se guardara un numero nuevo en memoria.
                        suma += datos[i];
                    }
                    break; 
                }
                double promedio =  suma / (double) numero; // Tambien se puede dividir entre el datos.length
                System.out.println(String.format("El promedio es de %.2f", promedio));
                
            }
            
        }
        
    }
}
