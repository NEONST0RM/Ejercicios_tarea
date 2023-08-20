package Ejercicios_tarea.biblioteca;

class Book extends LibraryItem {
    private String autor;

    public Book(String titulo, int itemId, String autor) {
        super(titulo, itemId);
        this.autor = autor;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Autor: " + autor);
    }
}