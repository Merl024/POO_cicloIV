
package semana4;

public class While {
    public static void main(String[] args) {
        int contador = 0;
        while (contador<=10){
            System.out.println(contador*contador);
            contador++;
            if (contador > 10){
                break;
            }
        }
    }
}
