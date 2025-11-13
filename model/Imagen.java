package model;

import java.util.List;

public class Imagen extends Contenido {
    private String url;

    // 🔹 Constructor completo con los 5 parámetros
    public Imagen(String titulo, String autor, Categoria categoria, List<Etiqueta> etiquetas, String url) {
        super(titulo, autor, categoria, etiquetas);
        this.url = url;
    }

    @Override
    public void publicar() {
        System.out.println("🖼️ Publicando imagen: " + titulo + " (" + url + ")");
    }

    @Override
    public void mostrar() {
        System.out.println("Imagen: " + titulo + " - URL: " + url);
    }

    // 🔸 Getters y setters
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}