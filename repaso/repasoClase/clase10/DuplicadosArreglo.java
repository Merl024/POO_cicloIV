
package repasoClase.clase10;

public class DuplicadosArreglo {
    public static void main(String[] args) {
        int[] arreglo = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 1, 1 };
        
        boolean duplicados = false;
        for (int i = 0; i < arreglo.length; i++){
            for (int j = 0; j < arreglo.length; j++){
                if (arreglo[i] == arreglo[j] && i != j){
                    duplicados = true;
                    
                }
            }
        }

        if (duplicados){
            System.out.println("Hay elementos duplicados en el arreglo");
        } else{
            System.out.println("No hay elementos duplicados en el arreglo");
        }
    }

}
