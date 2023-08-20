package Ejercicios_tarea;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el total de horas trabajadas: ");
        short horas_trabajo = input.nextShort();

        short sueldo_Hora=40;
        int extra = horas_trabajo-40;

        if(horas_trabajo>40){
            if (extra<=8) {
                horas_trabajo = (short) ((horas_trabajo-extra) * sueldo_Hora);
                extra = extra * (sueldo_Hora*2);
                System.out.println("Tu sueldo por hora: "+horas_trabajo);
                System.out.println("Tu sueldo por horas extra: "+extra);
            }
            else{
                horas_trabajo = (short) ((horas_trabajo-extra) * sueldo_Hora);
                extra = extra * (sueldo_Hora*3);
                System.out.println("Tu sueldo por hora: "+horas_trabajo);
                System.out.println("Tu sueldo por horas extra: "+extra);
            }
        }
        else {
            System.out.println("Tu sueldo por hora es: "+horas_trabajo*sueldo_Hora);
        }
    }
}
