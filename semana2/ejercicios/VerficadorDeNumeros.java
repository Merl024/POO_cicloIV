
import java.util.Scanner;

/*• Escriba un programa que verifique si un número es impar y positivo, simultáneamente. */
public class VerficadorDeNumeros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int numero = s.nextInt();
        boolean esPositivo = numero > 0;
        boolean esImpar = numero % 2 !=0; // Aqui el % sirve para decir el residuo de algo
                        // Si al dividir el numero entre 2 el residuo NO es 0, entonces no es par
        if (esPositivo && esImpar){
            System.out.println("El numero entero ingresado es impar y negativo");
        } else if ( numero == 0 ){
            System.out.println("El numero ingresado es cero. Por lo que no es ni impar ni negativo");
        } else if (!esImpar || !esPositivo){
            System.out.println("El numero ingresado es par o negativo");
        } 
    }
}
