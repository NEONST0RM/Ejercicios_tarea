package Ejercicios_tarea;
import  java.util.Scanner;
import  java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int numeroAdivinar = random.nextInt(100) + 1;
        int intentos = 0;

        System.out.println("Bienvenido al juego de adivinar el número entre 1 y 100.");
        System.out.println("¡Adivina el número!");

        while (true) {
            System.out.print("Introduce tu suposición: ");
            int suposicion = input.nextInt();
            intentos++;

            if (suposicion < numeroAdivinar) {
                System.out.println("Número demasiado bajo, intenta nuevamente.");
            } else if (suposicion > numeroAdivinar) {
                System.out.println("Número demasiado alto, intenta nuevamente.");
            } else {
                System.out.println("¡Felicidades! ¡Adivinaste el número " + numeroAdivinar + " en " + intentos + " intentos.");
                break;
            }
        }

        input.close();
    }
}
