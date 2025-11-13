package model;

public class Editor extends Usuario {
    public Editor(String nombre) {
        super(nombre, "editor");
    }

    @Override
    public boolean puedeEliminar() { return false; }

    @Override
    public boolean puedePublicar() { return false; }
}