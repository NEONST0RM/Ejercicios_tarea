package Ejercicios_tarea.figurasGeometricas;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Rojo", true, 5.0);
        Rectangulo rectangulo = new Rectangulo("Azul", false, 4.0, 6.0);
        Triangulo triangulo = new Triangulo("Verde", true, 3.0, 4.0, 5.0);

        Figura[] figuras = { circulo, rectangulo, triangulo };

        for (Figura figura : figuras) {
            System.out.println("Figura: " + figura.getClass().getSimpleName());
            System.out.println("Color: " + figura.getColor());
            System.out.println("Llena: " + figura.isEstaLlena());
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            System.out.println();
        }
    }
}
