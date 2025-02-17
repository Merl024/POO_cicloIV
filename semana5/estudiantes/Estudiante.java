
package semana5.estudiantes;

import java.util.ArrayList;

public class Estudiante {
    String nombre;
    String apellido;
    int edad;
    ArrayList <String> materiasInscritas = new ArrayList<>();

    public void agregarMateria( String materia ){ 
        materiasInscritas.add(materia);
    }
    public void imprimirDetalles(){
        System.out.println("El nombre y apellido del estudiante es " + nombre + " " + apellido + " de " + edad + " años, cursa las siguientes materias: " + materiasInscritas);
    }
}
