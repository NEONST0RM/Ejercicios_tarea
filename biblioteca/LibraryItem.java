package Ejercicios_tarea.biblioteca;

public class LibraryItem {
    private String titulo;
    private int itemId;
    private boolean estaPrestado;

    public LibraryItem(String titulo, int itemId) {
        this.titulo = titulo;
        this.itemId = itemId;
        this.estaPrestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getItemId() {
        return itemId;
    }

    public boolean estaPrestado() {
        return estaPrestado;
    }

    public void setPrestado(boolean prestado) {
        estaPrestado = prestado;
    }

    public void mostrarDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("ID del ítem: " + itemId);
        System.out.println("¿Está prestado?: " + estaPrestado);
    }
}