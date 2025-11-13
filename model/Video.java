package model;

import java.util.List;

public class Video extends Contenido {
    private String url;

    // 🔹 Constructor completo con todos los parámetros
    public Video(String titulo, String autor, Categoria categoria, List<Etiqueta> etiquetas, String url) {
        super(titulo, autor, categoria, etiquetas);
        this.url = url;
    }

    @Override
    public void publicar() {
        System.out.println("🎬 Publicando video: " + titulo + " (" + url + ")");
    }

    @Override
    public void mostrar() {
        System.out.println("Video: " + titulo + " - URL: " + url);
    }

    // 🔸 Getters y setters
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}