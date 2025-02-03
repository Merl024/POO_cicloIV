
public class SerieFibonacci {
    public static void main(String[] args) {
        // Escriba un programa que imprima en pantalla los primeros
        // n numeros de la serie de Fibonacci
        // Ejemplo: imprimir los primeros 7 numeros 0, 1, 1, 2, 3, 5, 8

        // cada numero = ultimo + penultimo

        int n = 70; // cuantos numeros de la serie queremos imprimir
        System.out.print(0 + ", ");
        if (n > 1) {
            System.out.print(1);
        }
        long penultimo = 0;
        long ultimo = 1;
        for (int i =3; i <= n; i++) {
            long valor = ultimo + penultimo;
            System.out.print(", " + valor);
            penultimo = ultimo;
            ultimo = valor;
        }
    }
}
