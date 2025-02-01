import java.util.Scanner;

public class ConvertidorKgALb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el peso en kilogramos: ");
        double pesoEnKg = scanner.nextDouble();
        double pesoEnLb = pesoEnKg * 2.2;

        System.out.println("El peso en libras es: " + pesoEnLb) ;
    }
}
