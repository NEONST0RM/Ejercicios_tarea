package Ejercicios_tarea;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del array (n): ");
        int n = input.nextInt();

        int[] numerosAleatorios = new int[n];

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            numerosAleatorios[i] = random.nextInt(100);
        }

        System.out.println("Elementos del array:");

        for (int j = 0; j<n; j++) {
            System.out.println("El elemento "+j+": "+numerosAleatorios[j]);
        }

        input.close();
    }
}
