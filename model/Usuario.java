package model;

public abstract class Usuario {
    protected int id;
    protected String nombre;
    protected String email;

    public Usuario(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public abstract Contenido crearContenido(String tipo, int id, String titulo, String descripcion, Categoria categoria);

    public void editarContenido(Contenido c, String nuevoTitulo, String nuevaDescripcion) {
        c.titulo = nuevoTitulo;
        c.descripcion = nuevaDescripcion;
        System.out.println(nombre + " editó el contenido " + nuevoTitulo);
    }
}