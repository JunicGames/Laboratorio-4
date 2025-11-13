package model;

public class Admin extends Usuario {
    public Admin(String nombre) {
        super(nombre, "admin");
    }

    @Override
    public boolean puedeEliminar() { return true; }

    @Override
    public boolean puedePublicar() { return true; }
}