public class HelloWorld{
    // Si se declara fuera del metodo public no funcionara porque no esta dentro de su scope
    // String nombre = "Melisa";

    public static void main(String[] args) {
        String nombre = "Melisa";
        int carnet = 20245324;
        System.out.println("Hola " + nombre + ". Carnet: " + carnet);
    }

    // Estructura base de un Hola Mundo
    // public static void main(String[] args){
    //     System.out.println("Hello World");
    // }
}

// El que tiene extension .class es el bytecode del archivo .java. 
// Para poder acceder a ese archivo es necesario otro tipo de lector

// El bytecode es el lenguaje hexadecimal, es decir, la traduccion que la maquina hace 
// para que la maquina entienda que tiene que hacer. El hexadecimal va del 0 a la f

// Una vez se compile y se cree la clase no es necesario volver a poner la extension .java  
// Sino que solo con hacer mencino de la clase es suficiente 

// Java no reconoce las comillas simples como string. 
// Solo y solo si se pone un caracter si es posible ocupar la comilla simple