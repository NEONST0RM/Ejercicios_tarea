package Ejercicios_tarea.biblioteca;

class DVD extends LibraryItem {
    private String director;
    private int duracion;

    public DVD(String titulo, int itemId, String director, int duracion) {
        super(titulo, itemId);
        this.director = director;
        this.duracion = duracion;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Director: " + director);
        System.out.println("Duración: " + duracion + " minutos");
    }
}