
package udemy.constantes;

public class Constantes {
    public static void main(String[] args) {
        System.out.println("### Constantes en Java ###");
    
        final int DIAS_SEMANA = 7;
        System.out.println("Los dias de la semana "+ DIAS_SEMANA);

        // DIAS_SEMANA = 9; -- no se puede modificar

        // Biblioteca math
        System.out.println("Math PI: " + Math.PI);

        String cadena = """ 
        Hola mundo
        Probando que se puede hacer un texto en bloque 
        """;
        System.out.println(cadena);



        
    }
}
