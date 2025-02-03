
package ejercicios;

public class Promedio {
    public static void main(String[] args) {
        double[] notas = { 7.4, 9.2, 6.5, 5.4, 8.8, 9.9, 5.2, 7.3 };
        /* PROMEDIO DE NOTAS */
        double promedio = 0.0;
        int contador = 0;
        double suma = 0;

        // System.out.println(notas.length);
        for (int i = 0; i < notas.length; i++) {
            contador++;
            suma += notas[i];
            promedio = suma/contador;
        }
        System.out.println("El promedio de las notas es: " + promedio);

         /***** Cuantos estudiantes reprueba la evaluacion, como total y como porcentaje *****/
        int estudiantesReprobados = 0;
        int totalEstudiantes = notas.length;
        for ( int i = 0; i < totalEstudiantes; i++ ) {
            if (notas[i] < 6){
                estudiantesReprobados++;
            }
        }
        double porcentajeReprobados = (estudiantesReprobados / (double) totalEstudiantes) * 100;
        System.out.println("La cantidad de estudiantes que reprueban la evaluacion es: " + estudiantesReprobados);
        System.out.println("El porcentaje de estudiantes que reprueban la evaluacion es: " + porcentajeReprobados + "%");

        /* Nota MINIMA y nota MAXIMA */
        // Se inicializan con la primera nota en el arreglo para comparar con las siguientes
        // Luego, se comparan cada elemento con la variable minima y maxima y se actualizan si es necesario
        double minima = notas[0];
        double maxima = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < minima) {
                minima = notas[i];
            }
            if (notas[i] > maxima) {
                maxima = notas[i];
            }
        }
        System.out.println("La nota minima es: " + minima);
        System.out.println("La nota maxima es: " + maxima);
    }
}
