// Java es de tipado fuerte, es decir, que hay que especificar que tipo de dato es al 
// momento de declarar una variable 


// 1 gal 3.78
public class OperacionesAritmeticas {
    public static void main(String[] args) {
        int edad = 45;
        edad--;
        System.out.println(edad);

        int residuo = edad % 6; // El % indica el residuo que se hace de una division. 
        System.out.println(residuo);
    }
}

/*  Los strings de java son inmutables, es decir, si yo quiero poner un nuevo mensaje en mayusculas, tengo que crearr una nueva variables
 * no se puede hacer directamente al string, por ejemplo en py es: 
         hola = "Hola mundo "
         print(hola.upper()) 
 * Esto es java no se puede hacer, seria: 
 *      String mensaje = "Hola mundo"
        String saludo = mensaje.toUpperCase()
*/
