package Ejercicios_tarea;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        byte edad = input.nextByte();
        int regalo;

        if(edad>=15){
            System.out.println("Escriba 1 si trae regalo, caso contrario 0 false: ");
                regalo = input.nextInt();
            if (regalo == 1){
                System.out.println("Puede ingresar a la fiesta");
            }
            else {
                System.out.println("No puede ingresar a la fiesta");
            }

        }
        else {
            System.out.println("Puede ingresar a la fiesta");
        }

    }
}
