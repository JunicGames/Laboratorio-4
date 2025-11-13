package model;

import java.util.List;

public class Admin extends Usuario {
    public Admin(int id, String nombre, String email) {
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

    public void eliminarContenido(List<Contenido> lista, int id) {
        lista.removeIf(c -> c.id == id);
        System.out.println("Contenido con id " + id + " eliminado.");
    }

    public void publicarContenido(Publicable p) {
        p.publicar();
    }
}