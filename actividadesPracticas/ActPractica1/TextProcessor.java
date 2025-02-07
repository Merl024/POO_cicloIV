package ActPractica1;
import java.util.Scanner;

/* Hecho por Alisson Quijano (20245233) y Melisa Rivas (20245324) */

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
        
        // Identificamos las palabras por medio de los espacios. 
        String[] palabras = texto.trim().split("\\s+");

        // Enlistamos las palabras con su conteo para comprobar que se cuentan correctamente sin incluir signos ni numeros
        System.out.println("Palabras detectadas:");
        int contador = 0;

        // Por cada palabra en el arreglo de palabras, el contador se actualizara.
        for (String palabra : palabras) {
            contador+=1;
            System.out.println(contador + ". " + palabra);
        }

        // Retornamos el contador para imprimirlo en consola
        return contador;
    }

    /* OPERACION 2 */
    /*  Palabra mas frecuente y cuantas veces se repite.
        No tome en cuenta si está en mayúscula o minúscula. Tampoco cuente los signos de puntación. */
    public static String palabraFrecuente(String texto){
        
        // Convertimos el párrafo a minúsculas y eliminamos signos
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
            if (contadas[i]){
                continue; // si ya esta contada, la salta
            } 

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
        return "La palabra mas frecuente es '" + palabraMasRepetida + "' apareciendo " + maxRpeticiones + " veces.";
    }
    
    /* OPERACION 3 */
    /* Encontrar todas las palabras palíndromas en el texto.
        - Listar las PALABRAS palíndromas encontradas y su posición en el texto. 
        Este constara de dos funciones, uno booleano y otro string
        */

    // Funcion para ENLISTAR las palabras palindromas en el texto con su posicion
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

        // Verificamos cada palabra, para confirmar si es palindroma
        for (int i = 0; i < palabras.length; i++) {
            if (esPalindromo(palabras[i])) {
                resultado += "Posición " + (i + 1) + ": " + palabras[i] + "\n";
                hayPalindromos = true;
            }
        }

        //Dependiendo de si hay palindroma o no retornara diferentes mensajes. 
        if (!hayPalindromos) {
            return "No hay palabras palíndromas en el texto.";
        }

        return "Palabras palíndromas encontradas:\n" + resultado;
    }

    // Funcion especificamente para comprobar si es palindroma o no
    public static boolean esPalindromo(String texto) {
        // Nos aseguramos que estamos buscando una palabra palindroma de MAS DE UN caracter
        if (texto.length() > 1){
            int izquierda = 0;
            int derecha = texto.length() - 1;
    
            while (izquierda < derecha) {
                if (texto.charAt(izquierda) != texto.charAt(derecha)) {
                    return false;
                }
                izquierda++;
                derecha--;
            }
        } else{
            return false; // si es solo una letra no es palindromo.
        }
        return true;
    }

    /* OPERACION 4 */
    /* Generar estadísticas de vocales y consonantes.
        - Para un texto dado, contabilizar cuántas veces aparece cada una de las vocales y qué porcentaje corresponde a cada vocal 
        (sobre el total de vocales en el texto). Luego, señalar el ratio de vocales a consonantes. 
        Ignore las mayúsculas y los signos de puntuación. */
    public static String contadorDeVocales(String texto) {
        // Ponemos el texto como un arreglo de letras
        texto = texto.toLowerCase();
        texto = texto.replaceAll("[.,;:!?¿¡\"'()\\[\\]{}0-9]", "");
        texto = texto.replaceAll("[áéíóú]", "aeiou");
        texto = texto.replace(" ", "");

        int contadorVocales = 0;
        int contadorConsonantes = 0;
        int[] vocales = new int[5]; // [a, e, i, o, u] en ese orden se guardara las veces que se sume en el switch. Ej: [3, 5, 0, 0, 1]
        // El output seria 3 -> a, 5 -> e y asi respectivamente.
        

        /* Por medio del iterados, vamos a ir sumando una cantidad cada que reconozca los diferentes casos
         * de vocales. Para manejar eso, ocupamos un switch, si reconoce una vocal la suma al contadorVocales. 
         * Y sino, lo suma a las consonantes
         */
        for (char letra : texto.toCharArray()) {
            switch (letra) {
                case 'a' -> {
                    vocales[0]++; 
                    contadorVocales++;
                }
                case 'e' -> {
                    vocales[1]++; 
                    contadorVocales++;
                }
                case 'i' -> {
                    vocales[2]++; 
                    contadorVocales++;
                }
                case 'o' -> {
                    vocales[3]++; 
                    contadorVocales++;
                }
                case 'u' -> {
                    vocales[4]++; 
                    contadorVocales++;
                }
                default -> contadorConsonantes++;
            }
        }

        // Calculamos el total de vocales y consonantes para calcular el ratio de vocales a consonantes.
        double totalVocales = (double) contadorVocales;
        String resultado = "La cantidad de vocales es " + contadorVocales +
                            "\nLa cantidad de consonantes es " + contadorConsonantes +
                            "\nRatio vocales/consonantes: " + (contadorVocales / (double) contadorConsonantes);

        resultado += "\nDistribución de vocales:";
        String[] letras = {"a", "e", "i", "o", "u"};
        // Iteramos para mostrar la distribución de vocales y su porcentaje respectivo.
        for (int i = 0; i < vocales.length; i++) {
            double porcentaje = 0;
            if (totalVocales > 0) {
                porcentaje = (vocales[i] / totalVocales) * 100;
            }
            resultado += String.format("\n  %s: %d con un porcentaje de %.2f%%", letras[i], vocales[i], porcentaje); 
            // Ocupamos String.format para controlar cuantos decimales se muestran y estar concatenando varias veces. 
            // s pala las letras, d para el numero y .2f para el porcentaje y cuantos decimales se quieren mostrar.
        }
        return resultado;
    }

    /* OPERACION 5 */ 
    /* Invertir cada palabra de 4 letras o más que aparece en el texto. 
    Imprimir en consola el texto con las palabras invertidas.  */
    public static String invertirPalabras(String texto) {
        String[] palabras = texto.split(" ");
        // Creamos un StringBuilder para construir el nuevo texto con las palabras totalmente invertidas
        StringBuilder inverted = new StringBuilder();

        for (String palabra : palabras) {
            // solo si es mayor o igual a 4 caracteres le damos vuelta
            if (palabra.length() >=4) {
                palabra = new StringBuilder(palabra).reverse().toString();
            }
            // agregamos la palabra invertida con un espacio para que se vea ordenado
            inverted.append(palabra).append(" ");
        }

        System.out.println("Texto con palabras invertidas:");
        // Y acá solo eliminamos el espacio final
        return inverted.toString().trim();
    }

    /* FUNCION MAIN */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t¡Bienvenido al programa de procesador de texto!\n");
        System.out.println("Texto a revisar: ");
        String parrafo = """
                Luz azul ilumina la sala. Ana y sus amigos miran ese radar que refleja cada eco. 
                Ojo con la señal, dice la mamá. Nadie sabe si al final somos lo que somos.
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
            String opcion = scanner.nextLine();
            switch (opcion){
                case "1" -> {
                    // Directamente imprimimos el resultado del conteoPalabras y como argumento le pasamos el parrafo
                    System.out.println("La cadena tiene " + conteoPalabras(parrafo) + " palabras\n");
                    System.out.println("");

                    break;
                }
                case "2" -> {
                    // Directamente imprimimos el resultado del palabraFrecuente y como argumento le pasamos el parrafo
                    System.out.println(palabraFrecuente(parrafo));
                    System.out.println("");
                    break;
                }
                case "3" -> {
                    System.out.println(palabrasPalindromas(parrafo));
                    System.out.println("");

                    break;
                }
                case "4" -> {
                    System.out.println("\nEstadistica de vocales y su porcentaje: ");
                    System.out.println(contadorDeVocales(parrafo));
                    System.out.println("");
                    break;
                }
                case "5" -> {
                    // String textoInvertido = invertirPalabras(parrafo);
                    // imprimir el texto invertido en base al párrafo que hay acá arriba
                    System.out.println(invertirPalabras(parrafo));
                    System.out.println("");
                    break;
                }
                case "6" -> {
                    condicion = false;
                    System.out.println("Saliendo del programa...");
                    break;
                }
                default -> System.out.println("Opción incorrecta. Intente nuevamente.");
                // esto se encarga de los espacios en blanco, es decir, que el programa si sepa que hacer con ellos
            }
        }
    }
}

/* --------------------------------------------------------------------------
● PRIMER CASO
Texto a revisar: 
Anita lava la tina. Esa mamá ama pasear, pero a veces revivir momentos no es tan fácil.
Somos lo que somos, y cada radar nos guía. Ojo, al mal radar nadie detiene.

    Escoja una de las siguientes opciones: 
 1. Contar las palabras en el texto.
 2. Encontrar la palabra mas frecuente y cuántas veces aparece.
 3. Encontrar todas las palabras palíndromas en el texto.
 4. Generar estadísticas de vocales y consonantes.
 5. Invertir cada palabra de 4 letras o más que aparece en el texto
 6. Salir.

// OPTION 1 - cantidad de palabras
Palabras detectadas:
1. anita
2. lava
3. la
4. tina
5. esa
6. mamá
7. ama
8. pasear
9. pero
10. a
11. veces
12. revivir
13. momentos
14. no
15. es
16. tan
17. fácil
18. somos
19. lo
20. que
21. somos
22. y
23. cada
24. radar
25. nos
26. guía
27. ojo
28. al
29. mal
30. radar
31. nadie
32. detiene
La cadena tiene 32 palabras

// OPTION 2
Palabras repetidas en el párrafo:
La palabra mas frecuente es 'radar' apareciendo 2 veces. 

// OPTION 3
/* Palabras palíndromas encontradas:
Posición 7: ama
Posición 18: somos
Posición 21: somos
Posición 24: radar
Posición 27: ojo
Posición 30: radar 

// OPTION 4
Estadistica de vocales y su porcentaje: 
La cantidad de vocales es 73
La cantidad de consonantes es 66
Ratio vocales/consonantes: 1.106060606060606
Distribución de vocales:
  a: 27 con un porcentaje de 36.99%
  e: 16 con un porcentaje de 21.92%
  i: 10 con un porcentaje de 13.70%
  o: 15 con un porcentaje de 20.55%
  u: 5 con un porcentaje de 6.85%

// OPTION 5
Texto con palabras invertidas:
atinA aval la .anit Esa ámam ama ,raesap orep a secev riviver sotnemom no es tan somoS
.licáf lo que ,somos y adac radar nos .aíug ,ojO al mal radar eidan 
.eneited

// OPTION 6
Saliendo del programa...
--------------------------------------------------------------------------
● SEGUNDO CASO
Texto a revisar: 
Luz azul ilumina la sala. 
Ana y sus amigos miran ese radar que refleja cada eco. Ojo con la señal, dice la mamá. 
Nadie sabe si al final somos lo que somos.

Escoja una de las siguientes opciones: 
 1. Contar las palabras en el texto.
 2. Encontrar la palabra mas frecuente y cuántas veces aparece.
 3. Encontrar todas las palabras palíndromas en el texto.
 4. Generar estadísticas de vocales y consonantes.
 5. Invertir cada palabra de 4 letras o más que aparece en el texto
 6. Salir.
 
// OPTION 1
Palabras detectadas:
1. luz
2. azul
3. ilumina
4. la
5. sala
6. ana
7. y
8. sus
9. amigos
10. miran
11. ese
12. radar
13. que
14. refleja
15. cada
16. eco
17. ojo
18. con
19. la
20. señal
21. dice
22. la
23. mamá
24. nadie
25. sabe
26. si
27. al
28. final
29. somos
30. lo
31. que
32. somos
La cadena tiene 32 palabras

// OPTION 2
Palabras repetidas en el párrafo:
La palabra mas frecuente es 'la' apareciendo 3 veces.

// OPTION 3
Palabras palíndromas encontradas:
Posición 6: ana
Posición 8: sus
Posición 11: ese
Posición 12: radar
Posición 17: ojo
Posición 29: somos
Posición 32: somos

// OPTION 4
Estadistica de vocales y su porcentaje: 
La cantidad de vocales es 62
La cantidad de consonantes es 63
Ratio vocales/consonantes: 0.9841269841269841
Distribución de vocales:
  a: 23 con un porcentaje de 37.10%
  e: 12 con un porcentaje de 19.35%
  i: 9 con un porcentaje de 14.52%
  o: 11 con un porcentaje de 17.74%
  u: 7 con un porcentaje de 11.29%

// OPTION 5
Texto con palabras invertidas:
Luz luza animuli la .alas Ana y sus sogima narim ese radar que ajelfer adac ojO
.oce con la ,lañes ecid la .ámam eidaN ebas si al lanif somos lo que 
.somos

// OPTION 6
Saliendo del programa...

*/