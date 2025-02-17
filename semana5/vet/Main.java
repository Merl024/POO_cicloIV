
package semana5.vet;

public class Main {
    public static void main(String[] args) {
        Perro firulais = new Perro();
        firulais.nombre = "Firulais";
        firulais.raza = "Labrador Retriever";
        firulais.color = "Café";
        firulais.edad = 5;
        firulais.peso = 10.5;
        firulais.vacunas = new String[]{"Rabia", "Parvovirus", "Leptospirosis"};
        System.out.println(firulais.raza);

        Gato thiago = new Gato();
        thiago.nombre = "Thiago";
        thiago.raza = "Chihuahua";
        thiago.color = "Café";
        thiago.edad = 5;
        thiago.peso = 10.5;

        thiago.imprimirDetalles();
    }
}
