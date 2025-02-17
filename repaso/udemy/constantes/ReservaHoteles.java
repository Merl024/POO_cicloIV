
package udemy.constantes;

public class ReservaHoteles {
    public static void main(String[] args) {
        final String mensaje = "\nDetalle de reserva: ";
        System.out.println(mensaje);

        var nombreCliente = "Melisa Rivas";
        var diasEstancia = 3;
        var tarifaDiaria = 45.89;
        var hasVistaMar = true;

        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Dias de estancia: " + diasEstancia);   
        System.out.println("Tarifa diaria: $" + tarifaDiaria);
        System.out.println("Tiene vista a la mar: " + hasVistaMar);

        nombreCliente = "Alisson Quijano";
        diasEstancia = 7;
        tarifaDiaria = 12.90;
        hasVistaMar = false;

        System.out.println("\nActualizado");
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Dias de estancia: " + diasEstancia);   
        System.out.println("Tarifa diaria: $" + tarifaDiaria);
        System.out.println("Tiene vista a la mar: " + hasVistaMar);

    }
}
