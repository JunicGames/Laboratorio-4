package model;

public class Editor extends Usuario {
    public Editor(int id, String nombre, String email) {
        super(id, nombre, email);
    }

    @Override
    public Contenido crearContenido(String tipo, int id, String titulo, String descripcion, Categoria categoria) {
        return switch (tipo.toLowerCase()) {
            case "articulo" -> new Articulo(id, titulo, descripcion, categoria);
            case "video" -> new Video(id, titulo, descripcion, categoria);
            case "imagen" -> new Imagen(id, titulo, descripcion, categoria);
            default -> null;
        };
    }
}