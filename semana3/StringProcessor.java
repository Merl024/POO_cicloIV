
public class StringProcessor {
    public static void main(String[] args) {
        String texto= "Varios países de Centroamérica se encuentran " +
                "en la franja de “Alta Restricción” y “Sin Libertad de " +
                "Expresión”, según el Índice Chapultepec publicado el año " +
                "pasado";
        // Analizar cuantas letras son mayusculas en la frase "curso"
        int conteoMayusculas = 0;
        for (int i=0; i<texto.length(); i++){
            boolean isUpperCase = Character.isUpperCase(texto.charAt(i));
            if (isUpperCase) {
                conteoMayusculas++;
            }
        }
        System.out.println("La frase tiene "+conteoMayusculas+ " mayúsculas.");

        // cuenten los espacios en blanco en el texto
        int conteoEspacios = 0;
        for (int i=0; i<texto.length(); i++) {
            if (Character.isWhitespace(texto.charAt(i))){
                conteoEspacios++;
            }
        }
        System.out.println("La frase tiene "+conteoEspacios+ " espacios en blanco.");

        String frase = "programar es muy entretenido";
        // corregir la frase para que comience con mayúscula y termine
        // con punto (.)
        String fraseCorregida = "";
        // if (!Character.isUpperCase(frase.charAt(0))){ //Aqui esta verificando que si el caracter en la posicion 0 NO es Uppercase
        //     fraseCorregida += Character.toUpperCase(frase.charAt(0)); // Que la convierta en uppercase
        //     fraseCorregida += frase.substring(1); //guardamos 
        //     System.out.println(fraseCorregida + " Convirtiendola en mayuscula");
        // } else {
        //     fraseCorregida = frase;
        //     System.out.println(fraseCorregida);
        // }
        // if ((frase.charAt(frase.length()-1))!='.'){
        //     fraseCorregida+= '.';
        //     System.out.println(fraseCorregida + " Agregando punto");
        // }

        /* MISMA FUNCION, MAS SINTETIZADO */
        if (!Character.isUpperCase(frase.charAt(0)) || frase.charAt(frase.length()-1) != '.') {
            fraseCorregida += Character.toUpperCase(frase.charAt(0)); 
            fraseCorregida += frase.substring(1); 
            fraseCorregida+= '.';
            System.out.println(fraseCorregida);
        } else {
            System.out.println(frase);
        }
        System.out.println("\nDiferentes maneras de concatenar numeros");
        System.out.println("Su carnet es: " + 2023 + 9999); // Los imprime sin operarlos
        System.out.println("Su carnet es: " + (2023 + 9999)); //Los suma
    }
}
