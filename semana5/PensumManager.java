package semana5;

import java.util.ArrayList;

// Static no hay que crear una instancia de clase para poder invocarlo

//Cuando no quiero un return, puedo simplementer declarar el metodo como void

public class PensumManager{

    ArrayList<String> registroCursos = new ArrayList<>();

    // Si no se le especifica, por defecto va publica.
    public void agregarMateria(String materia){
        registroCursos.add(materia);
    }

    public void eliminarMateria(String materia){
        registroCursos.remove(materia);
    }

    public void posicionMateria(String materia){
        int posicion = registroCursos.indexOf(materia) + 1;
        System.out.println("La posicion de la materia " + materia + " es " + posicion);
    }
    public static void main(String[] args) {
        PensumManager claseMelisa = new PensumManager();       
        // PensumManager clases20242024 = new PensumManager(); 

        claseMelisa.agregarMateria("Base de datos I");
        claseMelisa.agregarMateria("Programacion Orientada a objetos");
        claseMelisa.agregarMateria("Estadistica aplicada");
        claseMelisa.agregarMateria("Ingles");
        System.out.println(claseMelisa.registroCursos);

        claseMelisa.eliminarMateria("Ingles");
        System.out.println(claseMelisa.registroCursos);
        
        claseMelisa.posicionMateria("Programacion Orientada a objetos");
    }
}