
package semana4;

import java.util.ArrayList;

/* Los arreglos tienen una longitud fija. Eso se puede ver como un probla
 * Los arrayList da la oportunidad que sean mutables
 * 
 * No se puede usar tipos primitivos con los arrayList
 * 
 * Clase wrapper -> envuelve una clase, da nuevos datos y nuevos atributos.
 *      Esta contiene los tipos primitivos y permite implementar metodos adicionales. 
 */

public class EjemploArrayList {
    public static void main(String[] args) {
        // ArrayList<int> carnet = new ArrayList<int>() -->> dara error
        ArrayList<Integer> carnets = new ArrayList<>(); 
                            /* Por el tipo de version que tengo, no se pone ArrayList<Integer>() al final, porque lo infiere cuando se pone al
                             * inicio de la linea de codigo. */
        carnets.add(20245324);
        carnets.add(20245895);
        carnets.add(20246324);
        carnets.add(20242024);
        System.out.println(carnets);
        System.out.println(carnets.size());

        System.out.println(carnets.indexOf(20246324));
        carnets.remove(2);
        System.out.println(carnets);
        System.out.println(carnets.size());
        // El metodo .get() funciona para mandarle un indice e imprima el valor que esta en esa posicion. 
        // Con .set() se le da el index y el nuevo valor. Y cada nuevo elemento se va agregando al final. 
        // Pero hay un metodo que se llama .addFirst
    }
}
