package udemy.buenasPracticas;

public class ReglasVariables {
    public static void main(String[] args) {
        // Reglas de nombres de variables
        String nombreCompleto = "Juan Carlos"; // Correcto y descriptivo
        System.out.println(nombreCompleto);

        String NombreCompleto = "Juan Carlos"; // es descriptivvo pero no sigue las buenas practicas, porque camelCase dice que la primera letra es minuscula
        System.out.println(NombreCompleto);

        //String nombre-Compreto = "Juan Carlos"; // Ni siquiera reconoce el signo = mala pracitca

        // String nombre_cliente = 'J' -- mala practica, pero en java no se ocupa el _ cuando hay mas de dos palabras 

        String _apellido = "Rivas"; //Buena practica
        String $apellid = "Quijano"; // Buena practica

        int totPzs = 10; // no es un nombre descriptivo ni claro, por lo que no sigue las buenas practicas

        boolean isCasado =  true; // Esta es una buena practica porque parece que esta haciendo una pregunta, por lo que se entiende que el valor es boolean
        // Dependiendo el proyecto hay que mantener las variables completamente en español o completamente en ingles, si se permite, se puede combinar
    }
}
