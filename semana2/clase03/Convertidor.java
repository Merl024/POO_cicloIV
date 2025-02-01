
import java.util.Scanner;
/*  Scanner lo que hace al momento de capturar un dato es que mantiene una comunicacion abbierta, hasta que
no se le de una instruccion */

public class Convertidor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Ingrese la cantidad de litro que quiere convertir\n");
        // double litros = scanner.nextDouble();

        // double gal = litros * 3.78;
        // System.out.println(litros + "litros son " + gal + " galones");

        System.out.println("Ingrese la cantidad de litros que quiere convertir\n");

        double gal = scanner.nextDouble();
        double volumen = gal /= 3.785;
        long resultado = Math.round(volumen); // este metodo ayuda a que los numeros se redondeen a enteros

        System.out.println("La cantidad de galones es:  " + resultado);

        // DIFERNCIA ENTRE % Y / 
        double resultado1 = 7 / 3; // Devuelve el cociente de la división
        double resultado2 = 7 % 3; // Devuelve el residuo o resto de la división

        System.out.println(resultado1 + " este es el cociente de la división");
        System.out.println(resultado2 + " este es el residuo de la division");
        
        scanner.close(); // Es buena practica cerrar el scanner !!!
    }
}
