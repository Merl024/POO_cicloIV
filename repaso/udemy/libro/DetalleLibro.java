package udemy.libro;

public class DetalleLibro {
    public static void main(String[] args){
        // Detalle de un libro
        String libro = "El señor de los anillos";
        int fechaPublicacion = 1954;
        boolean disponible = true;
        double precio = 500.50;
        System.out.println("El libro " + libro + " fue publicado en el  " + fechaPublicacion + " y tiene un precio de " + precio + " Esta disponible? " + disponible ) ; 

        // MOdificar el titulo de libro
        libro = "El Señor de los Anillos";
        System.out.println("El nuevo título del libro es: " + libro);
    }
}
