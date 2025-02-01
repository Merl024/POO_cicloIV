/*
 * Java doc es algo que ya viene incorporado al lenguaje de programacion
 * Este ayud a generar la documentacion del codigo
 *
 * Metodos, son acciones
 * Atributos son caracs del objeto*/

public class Pokemon {
    // Se inicializa las variables. Se pone fuera del primer public, para que todas las instacnias
    // que tengamos se apliquen para todos los pokemon que tengamos
    String nombre;
    String tipo;
    int ataque;
    int salud;
    int defensa;
    int velocidad;
    // Double es para numeros mas largos por decimales.
    double altura;
    double peso;

    // Dependiendo del uso del metodo va a depender si lleva static o no. 
    // Instancia un objeto a partir de la plantilla de una clase. 

    //Este es un metodo de instancia. Es decir, que no corre a no ser que se le llame
    public void atacar(){
        System.out.println("Ataque lanzado");
    }

    // Este es un metodo especial que a pesar que no se le llame siempre se ejecutara por default. 
    // Esta podria ir en un archivo llamado Main (como index en JS)
    public static void main(String[] args){
        // Esta es una rden a la computadora, quiero que se ejecute
        Pokemon bulbasaur = new Pokemon();
        bulbasaur.atacar();
        bulbasaur.nombre = "Bulbasaur";
        bulbasaur.tipo = "Planta/veneno";
        bulbasaur.ataque = 49;
        bulbasaur.salud = 45;
        bulbasaur.defensa = 49;
        bulbasaur.velocidad = 45;
        bulbasaur.altura = 0.5;
        bulbasaur.peso = 6.9;
        System.out.println(bulbasaur.nombre + " tiene como salud "+ bulbasaur.salud + " puntos");
    }
}
