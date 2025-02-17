
package repasoClase.clase10;

public class ElementoMayor {
    public static void main(String[] args) {
        int[] numeros = { 1, 34, 34563, 2120, 490233, 2398910 };

        int mayor = numeros[0];
        for (int numero : numeros ){
            if( numero > mayor)// SI numero es mayor el que el numero mayor antes establecido
                mayor = numero; // Entonces el nuevo numero mayor sera el numero (iterador).
        }
        System.out.println("El número mayor es: " + mayor);
    }
}
