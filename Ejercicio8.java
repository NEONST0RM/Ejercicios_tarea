package Ejercicios_tarea;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del array (n): ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("El tamaño del array debe ser mayor que 0.");
        } else {
            int[] array = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Ingrese el valor para el índice " + i + ": ");
                array[i] = input.nextInt();
            }

            int valorMasGrande = array[0];

            for (int i = 1; i < n; i++) {
                if (array[i] > valorMasGrande) {
                    valorMasGrande = array[i];
                }
            }

            System.out.println("El valor más grande en el array es: " + valorMasGrande);
        }

        input.close();
    }
}
