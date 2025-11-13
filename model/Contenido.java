package model;

import java.util.List;

public abstract class Contenido {
    protected String titulo;
    protected String autor;
    protected Categoria categoria;
    protected List<Etiqueta> etiquetas;

    // 🔹 Constructor completo
    public Contenido(String titulo, String autor, Categoria categoria, List<Etiqueta> etiquetas) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.etiquetas = etiquetas;
    }

    // Métodos abstractos que las subclases deben implementar
    public abstract void publicar();
    public abstract void mostrar();

    // 🔸 Getters y setters opcionales
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public Categoria getCategoria() { return categoria; }
    public List<Etiqueta> getEtiquetas() { return etiquetas; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
    public void setEtiquetas(List<Etiqueta> etiquetas) { this.etiquetas = etiquetas; }
}