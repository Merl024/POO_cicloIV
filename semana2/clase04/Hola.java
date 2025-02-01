
public class Hola {
    public static void main(String[] args) {
        System.out.println("Int = " + (2024 / 7895) + " Aunque en la division de con decimales, al estar haciendo la operacion con int, el resultado sera int");
        System.out.println("float = " + 2024f / 5324f + " Al momento de poner f al final, ya estamos especificando que es float");

        // .trim()  -- al momento de hacer comparaciones es bueno porque elimina los espacios extras que pueden haber. 
        String nombre = "Melisa";
        String nombre2 = "Melisa ";
        // System.out.println(nombre.equals(nombre2)); // false
        System.out.println(nombre.equals(nombre2.trim())); // true

        //.contains()
        String clase = "Programacion Orinetada a Objetos";
        System.out.println(clase.contains("Programacion")); // true
        System.out.println(clase.toLowerCase().contains("objetos")); //true

        /* 
        //El compareTo lo que hace es que recorre todo el string hasta encontrar una diferencia.
         La manera en que se guardan lo nombre, por ejemplo, es por medio del orden lexicografico. Tabla ASCII
        */
    }
}
