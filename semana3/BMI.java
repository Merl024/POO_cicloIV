import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        // paso 1: solicitar input del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su peso en kilogramos");
        double peso = scanner.nextDouble();
        //System.out.println(peso);
        System.out.println("Ingrese su estatura en metros");
        double estatura = scanner.nextDouble();
        // calcular BMI
        double bmi = peso / (Math.pow(estatura, 2));
        //System.out.println(bmi);

        String rangoBmi = "";
        // PASO 3: Clasificar el BMI
        if (bmi < 18.5) {
            rangoBmi = "peso insuficiente";
        } else if (bmi >= 18.5 && bmi <25 ){
            rangoBmi = "peso saludable";
        } else if (bmi >= 25 && bmi < 30) {
            rangoBmi = "sobrepeso";
        } else {
            rangoBmi = "obesidad";
        }

        // PASO 4: IMPRIMIR UN MENSAJE AL USUARIO CON EL RESULTADO
        System.out.println("Su Indice de Masa Corporal es de "+bmi+
                " y su peso se encuentra en el rango de: "+rangoBmi);
         
        scanner.close(); 

    }
}

