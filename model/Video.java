package model;

public class Video extends Contenido {
    public Video(int id, String titulo, String descripcion, Categoria categoria) {
        super(id, titulo, descripcion, categoria);
    }

    @Override
    public void publicar() {
        System.out.println("Publicando video: " + titulo);
    }
}