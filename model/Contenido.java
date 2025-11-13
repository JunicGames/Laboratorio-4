package model;

import java.util.*;

public abstract class Contenido implements Publicable {
    private int id;
    private String titulo;
    private String descripcion;
    private Date fechaPublicacion;
    private Categoria categoria;
    private final List<Etiqueta> etiquetas = new ArrayList<>();

    public Contenido(int id, String titulo, String descripcion, Categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.fechaPublicacion = new Date();
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getDescripcion() { return descripcion; }
    public Categoria getCategoria() { return categoria; }
    public Date getFechaPublicacion() { return fechaPublicacion; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    public void agregarEtiqueta(Etiqueta e) {
        if (e != null && !etiquetas.contains(e))
            etiquetas.add(e);
    }

    public void visualizar() {
        System.out.println("Título: " + titulo);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Categoría: " + categoria.getNombre());
        System.out.println("Etiquetas:");
        etiquetas.forEach(et -> System.out.println(" - " + et.getNombre()));
        System.out.println("Fecha de publicación: " + fechaPublicacion);
    }
}