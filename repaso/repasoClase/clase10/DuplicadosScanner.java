
package repasoClase.clase10;

import java.util.Scanner;

/* Escriba un programa de Java que haga lo siguiente:
• Pida al usuario 10 valores enteros y los guarde en un arreglo.

• Verifique si existen elementos repetidos (duplicados) en el arreglo.

• Le informe al usuario cuál o cuáles son los elementos repetidos, y cuántas veces está repetido cada uno de 
esos elementos.

Ejemplo, si el usuario proporciona los valores 1, 1, 1, 3, 4, 4, 5, 7, 7, el programa informa:
Existen 3 elementos repetidos

    - El elemento 1 está repetido 3 veces
    - El elemento 4 está repetido 2 veces
    - El elemento 7 está repetido 2 veces
  */

public class DuplicadosScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        boolean[] procesado = new boolean[10];

        System.out.println("Ingresa 10 números de tu preferencia.");

        // Pidiendo numeros al usuario e ingresandolos en el array
        for(int i= 0; i < 10; i++){
            System.out.println("Ingrese su " + (i+1) + "° valor:");
            numeros[i] = scanner.nextInt();
        }
        
        int totalRepetidos = 0;
        // Procesamos cuantos elementos repetidos hay 
        for(int i = 0; i < numeros.length; i++){
            if(!procesado[i]){
                int repeticiones = 1;

                for (int j = i + 1 ; j < numeros.length; j++){
                    if(numeros[i] == numeros[j] && i != j){
                        repeticiones++; 
                        procesado[j] = true; 
                    }
                }

                if(repeticiones > 1){
                    totalRepetidos++; 
                    System.out.println("- El elemento " + numeros[i] + " está repetido " + repeticiones + " veces");    
                }
            }
        }
        
        // Imprimimos el total de los elementos repetidos sin entrar en detalle. 
        if (totalRepetidos == 0) {
            System.out.println("No hay elementos repetidos.");
        } else {
            System.out.println("Existen " + totalRepetidos + " elementos repetidos.");
        }


    }
}


/*
import java.util.Scanner;

public class ElementosRepetidosSinProcesado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10]; // Arreglo para almacenar los 10 valores

        System.out.println("Introduce 10 valores enteros:");

        // Leer los 10 valores y almacenarlos en el arreglo
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        // Verificar elementos repetidos
        System.out.println("\nResultados:");
        int totalRepetidos = 0;

        for (int i = 0; i < arreglo.length; i++) {
            int repeticiones = 1; // Inicializar el contador de repeticiones

            // Verificar si el elemento ya fue contado previamente
            boolean yaContado = false;
            for (int k = 0; k < i; k++) {
                if (arreglo[i] == arreglo[k]) {
                    yaContado = true;
                    break;
                }
            }

            // Si el elemento no ha sido contado previamente, contar sus repeticiones
            if (!yaContado) {
                for (int j = i + 1; j < arreglo.length; j++) {
                    if (arreglo[i] == arreglo[j]) {
                        repeticiones++; // Incrementar el contador
                    }
                }

                if (repeticiones > 1) { // Si el elemento está repetido
                    totalRepetidos++;
                    System.out.println("- El elemento " + arreglo[i] + " está repetido " + repeticiones + " veces");
                }
            }
        }

        if (totalRepetidos == 0) {
            System.out.println("No hay elementos repetidos.");
        } else {
            System.out.println("Existen " + totalRepetidos + " elementos repetidos.");
        }

        scanner.close();
    }
}
 */