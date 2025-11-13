package model;

public class Imagen extends Contenido {
    public Imagen(int id, String titulo, String descripcion, Categoria categoria) {
        super(id, titulo, descripcion, categoria);
    }

    @Override
    public void publicar() {
        System.out.println("Publicando imagen: " + titulo);
    }
}