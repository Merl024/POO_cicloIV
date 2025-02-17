package udemy.buenasPracticas;

public class DetalleProducto {
    public static void main(String[] args) {
        // Declarando variables
        String productName = "Audifonos Sony";
        double price = 78.99;
        int stock = 100;
        boolean isAvailable = true;

        System.out.println("Producto: " + productName);
        System.out.println("Precio: " + price);
        System.out.println("Inventario: " + stock);
        System.out.println("Disponible: " + isAvailable);

        // Modificando variables
        productName = "Laptop HP";
        price = 1299.99;
        stock = 0;
        isAvailable = false;

        System.out.println("\nProducto: " + productName);
        System.out.println("Precio: " + price);
        System.out.println("Inventario: " + stock);
        System.out.println("Disponible: " + isAvailable);
    }
}
