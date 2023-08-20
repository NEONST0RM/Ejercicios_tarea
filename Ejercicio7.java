package Ejercicios_tarea;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un valor n: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("El valor de n debe ser no negativo.");
        } else {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(n + "! = " + factorial);
        }

        input.close();
    }
}
