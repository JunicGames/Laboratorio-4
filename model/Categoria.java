package model;

public class Categoria {
    private String nombre;

    public Categoria(String nombre) { this.nombre = nombre; }

    public String getNombre() { return nombre; }

    @Override
    public String toString() { return nombre; }
}