import java.util.Scanner;

public class TextProcessor {
    
    /* OPERACION 1 */
    /*  contabilizar cuantas palabras tiene el texto.
            - No tome en cuenta las mayúsculas. 
            - No contabilice signos de puntuación. */
    public static int conteoPalabras(String texto) {
        // Ignoramos mayusculas
        texto = texto.toLowerCase();

        // Reemplazar a los signos de puntuacion y numeros para evitar que aparezcan en el conteo
        texto = texto.replaceAll("[.,;:!?/¿¡\"'()\\[\\]{}0-9]", " ");
        
        // Identificamos las palabras. 
        String[] palabras = texto.trim().split("\\s+");

        // Imprimos con conteo las palabras para comprobar 
        System.out.println("Palabras detectadas:");
        int contador = 0;
        for (String palabra : palabras) {
            contador+=1;
            System.out.println(contador + ". " + palabra);
        }
        // Contamos las palabras
        return contador;
    }

    /* OPERACION 2 */
    /*  Palabra mas frecuente y cuantas veces se repite.
        No tome en cuenta si está en mayúscula o minúscula. Tampoco cuente los signos de puntación. */
    public static String palabraFrecuente(String texto){
        
        // Convertimos el párrafo a minúsculas y eliminamos puntuaciones básicas
        texto = texto.toLowerCase().replaceAll("[.,;:!?/¿¡\"'()\\[\\]{}0-9]", "");
        
        // Dividir el párrafo en palabras
        String[] palabras = texto.trim().split(" ");
        int n = palabras.length;
        
        // Array para marcar palabras ya contadas
        boolean[] contadas = new boolean[n];

        System.out.println("\nPalabras repetidas en el párrafo:");
        String palabraMasRepetida = "";
        int maxRpeticiones = 0;

        for (int i = 0; i < n; i++) {
            if (contadas[i]) continue; // Si ya se contó, saltar

            int contador = 1; // Contamos la palabra actual

            for (int j = i + 1; j < n; j++) {
                if (palabras[i].equals(palabras[j])) {
                    contador++;
                    contadas[j] = true; // Marcar palabra como contada
                }
            }

            if (contador > maxRpeticiones){
                maxRpeticiones = contador;
                palabraMasRepetida = palabras[i];
            }
            if(maxRpeticiones < 0){
                return "No hay palabras repetidas";
            }
            
        }
        return "La palabra mas frecuente es '" + palabraMasRepetida + "' apareciendo " + maxRpeticiones + " repeticiones.";
    }
    
    /* OPERACION 3 */
    /* Encontrar todas las palabras palíndromas en el texto.
        - Listar las PALABRAS palíndromas encontradas y su posición en el texto. */
    public static String palabrasPalindromas(String texto) {
        // Ignoramos las mayusculas
        texto = texto.toLowerCase();

        // Eliminamos signos de puntuación y números
        texto = texto.replaceAll("[.,;:!?¿¡\"'()\\[\\]{}0-9]", " ");

        // Dividimos el texto en palabras
        String[] palabras = texto.trim().split("\\s+");

        // Variable para almacenar las palabras palíndromas con sus posiciones
        String resultado = "";
        boolean hayPalindromos = false;

        // Verificamos cada palabra
        for (int i = 0; i < palabras.length; i++) {
            if (esPalindromo(palabras[i])) {
                resultado += "Posición " + (i + 1) + ": " + palabras[i] + "\n";
                hayPalindromos = true;
            }
        }


        if (!hayPalindromos) {
            return "No hay palabras palíndromas en el texto.";
        }

        return "Palabras palíndromas encontradas:\n" + resultado;
    }
    public static boolean esPalindromo(String texto) {
        int izquierda = 0;
        int derecha = texto.length() - 1;

        while (izquierda < derecha) {
            if (texto.charAt(izquierda) != texto.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }

    /* OPERACION 4 */
    /* Generar estadísticas de vocales y consonantes.
        - Para un texto dado, contabilizar cuántas veces aparece cada una de las vocales y qué porcentaje corresponde a cada vocal 
        (sobre el total de vocales en el texto). Luego, señalar el ratio de vocales a consonantes. 
        Ignore las mayúsculas y los signos de puntuación. */
    public static void contadorDeVocales(String texto) {
        texto = texto.toLowerCase();
        texto = texto.replaceAll("[.,;:!?¿¡\"'()\\[\\]{}0-9]", " ");
        texto = texto.replaceAll("[áéíóú]", "aeiou");
        texto = texto.replace(" ", "");

        int totalLetras = texto.length();
        int contadorVocal = 0, i;
        int contadorConsonante = 0;
        // char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        char letra;

        for ( i = 0; i < totalLetras; i++){
            letra = Character.toLowerCase(texto.charAt(i));
            if ( letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contadorVocal++;
            } else{ 
                contadorConsonante++;
            }
        }
        System.out.println("La cantidad de vocales es " + contadorVocal);
    }

    /* FUNCION MAIN */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Ingrese su parrafo: ");
        // String parrafo = scanner.nextLine();

        /* ?????? No contamos las palabras que tengan acentuacion?????  */
        String parrafo = """
                Ejercicio 2: Procesador de Texto Avanzado (50 puntos) 
                Desarrolla un programa que procese un texto y realice 
                varios análisis utilizando bucles y estructuras de control. 
                El programa debe demostrar comprensión de bucles while/for  
                y manejo de strings. Ana lava la tina y reconoce el nivel de radar.
                """;
        System.out.println(parrafo);
        boolean condicion = true;
    
        while (condicion) {
            System.out.println("\tEscoja una de las siguientes opciones: ");
            System.out.println("""                
                1. Contar las palabras en el texto.
                2. Encontrar la palabra mas frecuente y cuántas veces aparece.
                3. Encontrar todas las palabras palíndromas en el texto.
                4. Generar estadísticas de vocales y consonantes.
                5. Invertir cada palabra de 4 letras o más que aparece en el texto
                6. Salir.\n
                """);
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1 -> {
                    System.out.println("La cadena tiene " + conteoPalabras(parrafo) + " palabras\n");
                    break;
                }
                case 2 -> {
                    System.out.println(palabraFrecuente(parrafo));
                    break;
                }
                case 3 -> {
                    String palindromas = palabrasPalindromas(parrafo);
                    System.out.println(palindromas);
                    break;
                }
                case 4 -> {
                    System.out.println("Estadistica de vocales y su porcentaje: ");
                    contadorDeVocales(parrafo);
                    break;
                }
                case 5 -> {
                    break;
                }
                case 6 -> {
                    condicion = false;
                    System.out.println("Saliendo del programa...");
                    break;
                }
                default -> System.out.println("Opción incorrecta. Intente nuevamente.");
            }
        }
    }
}

