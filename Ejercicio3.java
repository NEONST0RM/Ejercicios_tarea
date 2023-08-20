package Ejercicios_tarea;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el consumo de agua potable en litros: ");
        float agua_potable = input.nextFloat();
        float pago_total;

        if(agua_potable>50){
            if (agua_potable >=51 && agua_potable <=200){
                agua_potable -= 50;
                pago_total = (agua_potable*0.5f)+10.00f;
                System.out.println("El pago total es: "+pago_total);
            }
            else if(agua_potable>200){
                agua_potable -= 50;
                pago_total = agua_potable*1.5f+10.00f;
                System.out.println("El pago total es: "+pago_total);
            }
        }
        else {
            pago_total = 10;
            System.out.println("El pago total es: "+pago_total);
        }


    }
}
