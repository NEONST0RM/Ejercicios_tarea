package Ejercicios_tarea.biblioteca;

public class Main {
    public static void main(String[] args) {
        Library biblioteca = new Library();

        Book libro1 = new Book("El Gran Gatsby", 1, "F. Scott Fitzgerald");
        DVD dvd1 = new DVD("Origen", 2, "Christopher Nolan", 148);
        LibraryUser usuario1 = new LibraryUser("Alice", "U001");

        biblioteca.agregarItem(libro1);
        biblioteca.agregarItem(dvd1);

        biblioteca.mostrarTodosLosItems();

        biblioteca.prestarItem(libro1);
        biblioteca.prestarItem(dvd1);

        biblioteca.devolverItem(libro1);
        biblioteca.devolverItem(dvd1);
    }
}