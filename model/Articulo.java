package model;

public class Articulo extends Contenido {
    public Articulo(int id, String titulo, String descripcion, Categoria categoria) {
        super(id, titulo, descripcion, categoria);
    }

    @Override
    public void publicar() {
        System.out.println("Publicando artículo: " + titulo);
    }
}