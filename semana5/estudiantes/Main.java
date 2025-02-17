
package semana5.estudiantes;

public class Main {
    public static void main(String[] args) {
        Estudiante melisa = new Estudiante();
        melisa.nombre = "Melisa";
        melisa.apellido = "Rivas";
        melisa.edad = 19;  
        melisa.agregarMateria("Matemáticas");
        melisa.agregarMateria("Lenguaje");
        melisa.imprimirDetalles();   
    }
}
