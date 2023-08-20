package Ejercicios_tarea.biblioteca;

class LibraryUser {
    private String nombre;
    private String idUsuario;

    public LibraryUser(String nombre, String idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdUsuario() {
        return idUsuario;
    }
}