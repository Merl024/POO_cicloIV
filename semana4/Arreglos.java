
package semana4;

import java.util.Arrays;

public class Arreglos {
    public static void main(String[] args) {
        int [] arreglo = new int[4]; // Aqui empezamos a guardar en la memoria local el arreglo que tendremos
        // System.out.println(Arrays.toString(arreglo)); // [0, 0, 0, 0]
        /* En esta sintaxis inicializa con un arreglo de 0, aun no recibe datos por lo que por default agarra 0 */
        int [] arreglo2 = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Inicializamos con valor ya determinados
        // System.out.println(Arrays.toString(arreglo2));

        double[] notasTarea = {5.5, 9.1, 7.4, 8.0, 6.2};
        System.out.println(Arrays.toString(notasTarea));
        // Sumandole 1 punto a cada nota
        int i = 0;
        for ( double nota : notasTarea){ // esto es un for each
            notasTarea[i] = Math.min(nota + 1, 10);
            i++;
            // if(notasTarea[1] > 10){x
            //     notasTarea[i] = 10;
            // }
        }
        System.out.println(Arrays.toString(notasTarea));
        // INVESTIGAR COMO FUNCIONA EL SORT
    }
}
