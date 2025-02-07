
package semana4;

import java.util.Arrays;

/* FUNFACT: los pixeles son un arreglo de colores. Eso es lo que guarda la computadora de una imagen */
public class Duplicados {
    public static void main(String[] args) {
        // Verificar si hay elementos duplicados en un arreglo
        int [] arreglo = {2, 6, 8, 10, 12, 2, 5, 7, 4};
        int [] arreglo2 = {2, 6, 8, 12, 3, 5, 7, 4};
        Arrays.stream(arreglo).sorted();

        // Recorrer el arreglo y comparar cada elemento con los demás
        boolean hayDuplicados = false;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j< arreglo.length; j++){
                if (arreglo[i] == arreglo[j] && i != j){
                    hayDuplicados = true;
                    break;
                }
            }
            break;
        }
        if (hayDuplicados){
            System.out.println("Hay al menos un duplicado");
        } else {
            System.out.println("No hay duplicados");
        }
        /********************************************************************************************************************************/
        int[] arregloFill = new int[8];
        Arrays.fill(arregloFill, 10);
        System.out.println(Arrays.toString(arregloFill)); // Arrays.toString sirve para que podamos visualizar el array completo. 



    }
}
