// Universidad del Valle de Guatemala
// Facultad de Ingeniería
// Programación Orientada a Objetos
// Segundo Ciclo, 2025
// Instructor: Ing. Erick Francisco Marroquín Rodríguez
// Laboratorio 4: Polimorfismo
// Julio Fernando Ortiz Alvarado – 251190
// Naomi Saraí Marroquín López - 25226
// Clase: Contenido
// Descripción: Abstracta, es la estructura genérica del CMS. base para los artículos, videos e imágenes.
package model;

import java.util.List;

public abstract class Contenido {
    protected String titulo;
    protected String autor;
    protected Categoria categoria;
    protected List<Etiqueta> etiquetas;

    public Contenido(String titulo, String autor, Categoria categoria, List<Etiqueta> etiquetas) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.etiquetas = etiquetas;
    }

    public abstract void publicar();
    public abstract void mostrar();

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public Categoria getCategoria() { return categoria; }
    public List<Etiqueta> getEtiquetas() { return etiquetas; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
    public void setEtiquetas(List<Etiqueta> etiquetas) { this.etiquetas = etiquetas; }
}