
package ejercicios;
public class CorreccionNombres {

    public static void main(String[] args) {
        String[] nombres = {"Juan", "carlos", "roXAna", " eVA", "ARTURO ", "LuCy", "Jean-ClAuDe", "AnNe-MARIE"};

        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = formatearNombre(nombres[i]);
        }

        // Mostrar los nombres corregidos
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }

    public static String formatearNombre(String nombre) {
        // Eliminar espacios iniciales y finales
        nombre = nombre.trim();

        // Dividir el nombre en partes si contiene un guión
        String[] partes = nombre.split("-");
        String nombreFormateado = "";

        for (int i = 0; i < partes.length; i++) {
            if (partes[i].length() > 0) {
                // Capitalizar la primera letra y el resto en minúsculas
                partes[i] = partes[i].substring(0, 1).toUpperCase() + partes[i].substring(1).toLowerCase();
            }
            nombreFormateado += partes[i]; // Concatenar la parte formateada
            if (i < partes.length - 1) {
                nombreFormateado += "-"; // Agregar el guión si no es la última parte
            }
        }

        return nombreFormateado;
    }
}
