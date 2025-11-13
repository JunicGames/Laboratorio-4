package model;

public abstract class Usuario {
    protected String nombre;
    protected String tipo; // "admin" o "editor"

    public Usuario(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }

    public abstract boolean puedeEliminar();
    public abstract boolean puedePublicar();
}