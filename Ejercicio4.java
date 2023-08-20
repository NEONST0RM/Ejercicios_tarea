package Ejercicios_tarea;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = input.nextInt();

        System.out.println("Números impares menores de" + n);

        for (int i = 1; i < n; i += 2) {
            System.out.println(i);
        }

        input.close();
    }
}
