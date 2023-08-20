package Ejercicios_tarea.biblioteca;

class Library {
    private LibraryItem[] items;
    private int cantidadItems;

    public Library() {
        items = new LibraryItem[100];
        cantidadItems = 0;
    }

    public void agregarItem(LibraryItem item) {
        if (cantidadItems < items.length) {
            items[cantidadItems] = item;
            cantidadItems++;
            System.out.println("Agregado: '" + item.getTitulo() + "' a la biblioteca.");
        } else {
            System.out.println("La biblioteca está llena. No se pueden agregar más elementos.");
        }
    }

    public void mostrarTodosLosItems() {
        for (int i = 0; i < cantidadItems; i++) {
            items[i].mostrarDetalles();
            System.out.println();
        }
    }

    public void prestarItem(LibraryItem item) {
        if (!item.estaPrestado() && cantidadItems > 0) {
            item.setPrestado(true);
            System.out.println("Item prestado: '" + item.getTitulo() + "'.");
        } else {
            System.out.println("No se puede prestar el ítem.");
        }
    }

    public void devolverItem(LibraryItem item) {
        if (item.estaPrestado()) {
            item.setPrestado(false);
            System.out.println("Item devuelto: '" + item.getTitulo() + "'.");
        } else {
            System.out.println("El ítem no está prestado.");
        }
    }
}