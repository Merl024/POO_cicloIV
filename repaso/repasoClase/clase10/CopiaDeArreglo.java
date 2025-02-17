
package repasoClase.clase10;

import java.util.Arrays;


public class CopiaDeArreglo {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        /* Usando el metodo de arrays copyOf */
        int[] copia = Arrays.copyOf(numeros, numeros.length);

        System.out.println("Original Array: " + Arrays.toString(numeros));
        System.out.println("Copied Array: " + Arrays.toString(copia));

        // Crear un nuevo arreglo que sea una copia del original
        // int[] copia = new int[numeros.length];
        // for (int i = 0; i < copia.length; i++){
        //     copia[i] = numeros[i];
        //     System.out.print(copia[i] + " ");
        // }
    }
           
}

