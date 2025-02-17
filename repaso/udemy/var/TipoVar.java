
package udemy.var;

public class TipoVar {
    public static void main(String[] args) {
        System.out.println("## Trabajando con el uso de var en Java ##");

        var nombre = "Melisa"; // la variable "nombre" dependera del valor que le asigne y a partir de ahora, solo puede almacenar valores del tipo cadena
        System.out.println("Nombre: " + nombre);
        //nombre = 4; // Dara ERROR

        var edad = 19;
        System.out.println("Edad: " + edad);
        // Se debe definir su valor
        // var precio; -- dara un error de compilacion 
    }
}
