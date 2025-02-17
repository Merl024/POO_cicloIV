
package semana5.vet;

import java.util.ArrayList;

public class Gato {
    // Constructor
    String nombre;  
    String raza;
    String color; 
    int edad;
    double peso;
    ArrayList<String> vacunas = new ArrayList<>();

    // Cuando solo se va a imprimir datos no es necesario especificar argumentos que se ocuparan
    public void imprimirDetalles(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Color: " + color);
    }
    public void vacunar(String vacuna){
        // Se hace de esta manera y no en forma de array ([ ]) para ponder ocupar el metodo del ArrayList .dd() 
        // El .this() hace referencia al objeto, por lo que ayuda a la ambiguedad en los nombres. 
        // De igual forma, ayuda a referenciar los atributos dentro de la clase publica, no estatica.
        this.vacunas.add(vacuna);
    }
}
