import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        // int edad = 17;
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        int edad = s.nextInt();

        boolean puedeVotar = false;
        if (edad >= 18){
            puedeVotar = true;
            System.out.println(puedeVotar);
        } else{
            System.out.println(puedeVotar);
        }
        s.close();
    }
}
