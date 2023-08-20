package Ejercicios_tarea.figurasGeometricas;

public class Figura {
    private String color;
    private boolean estaLlena;

    public Figura(String color, boolean estaLlena) {
        this.color = color;
        this.estaLlena = estaLlena;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEstaLlena() {
        return estaLlena;
    }

    public void setEstaLlena(boolean estaLlena) {
        this.estaLlena = estaLlena;
    }

    public double calcularArea() {
        return 0.0;
    }

    public double calcularPerimetro() {
        return 0.0;
    }
}
