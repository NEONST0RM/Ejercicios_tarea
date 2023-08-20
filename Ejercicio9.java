package Ejercicios_tarea;
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del array (n): ");
        int n = input.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor para el índice " + i + ": ");
            array[i] = input.nextInt();
        }

        // Invertir el array
        int inicio = 0;
        int fin = n - 1;

        while (inicio < fin) {
            int temp = array[inicio];
            array[inicio] = array[fin];
            array[fin] = temp;

            inicio++;
            fin--;
        }

        System.out.println("Array invertido:");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

        input.close();
    }
}
