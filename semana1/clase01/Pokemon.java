/* 
Utilice el input en Java para crear variables que almacenen las estadisticas basicas de su Pokemon 
Entre las caracteristicas a preguntar estan: nombre, tipo, habilidades, PS, ataque, defensa, velocidad
Luego imprima los datos en consola  
*/

public class Pokemon {
    public static void main(String[] args) {
     String nombre = "Eevee" ;
     String tipo = "Evolucion / Normal";
     String habilidades = "fuga, adaptable";
     int puntosDeVida = 55;
     int ataque = 55;
     int defensa = 50;
     int velocidad = 55;    
     String mensaje = String.format("El nombre de tu Pokemon es: %s \nEs de tipo %s y sus habilidades son %s.\nSus estadisticas son:\n\tPuntos de vida: %d\n\tAtaque: %d\n\tDefensa: %d\n\tVelocidad: %d", nombre, tipo, habilidades, puntosDeVida, ataque, defensa, velocidad);
    System.out.println(mensaje);
    }
}
