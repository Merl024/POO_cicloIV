// Los string en java son inmutables, pues no es como en py que se puede hacer un append, sino que hay que declararle una nueva clase para
// modificarlo

/* 
//La clases son un OBJETO no un arreglo, por lo que no le podemos pasar posicion por medio de los []
    Por ejemplo:
        print(clase[1]) // esto no se puede hacer en java

    Fun fact: dependiendo del primer numero de tarjeta podemos deducir de que banco es
*/

public class StringEjemplo {
    public static void main(String[] args){
        String clase = "Programacion Orientada a Objetos";
        System.out.println(clase);
        System.out.println(clase.length());
        System.out.println(clase.indexOf("o"));
        System.out.println(clase.indexOf("objeto"));
        System.out.println(clase.toLowerCase());

        // Crear subcadenas o substring
        String palabra = clase.substring(3,4);

        // Extraer la primera palabra de la frase clase sin contar hasta que caracter extraer.
        int posicionFinal = clase.indexOf(" "); // Primer paso, encontrar el primer espacio
                                                    //porque ese es el indicativo que ahi es donde termina la primer palabra
        String primeraPalabra = clase.substring(0, posicionFinal);
        System.out.println(primeraPalabra);

        String frase =  " Base de datos I";
        //int posicionF = frase.indexOf(' '); // COmo la frase ya de por si tiene un espacio al inicio, no imprimiria la primera palabra.
        int posicionF = frase.trim().indexOf(' ');
        String primeraF = frase.trim().substring(0, posicionF);
        System.out.println(primeraF);

        // Para cambiar los string la unica maneera es reasignarlo
        // String frase =  " Base de datos I";
        System.out.println(frase); // Aqui no se ha reasignado el valor, por lo que sigue saliendo  Base
        frase = frase.replace("Base", "Programacion"); // Reasignando al sting para cambiar su contenido
        System.out.println(frase);
        
    }
}
