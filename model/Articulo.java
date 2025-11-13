// Universidad del Valle de Guatemala
// Facultad de Ingeniería
// Programación Orientada a Objetos
// Segundo Ciclo, 2025
// Instructor: Ing. Erick Francisco Marroquín Rodríguez
// Laboratorio 4: Polimorfismo
// Julio Fernando Ortiz Alvarado – 251190
// Naomi Saraí Marroquín López - 25226
// Clase: Articulo
// Descripción: Subclase de Contenido, representa los artículos del sistema.
package model;

import java.util.List;

public class Articulo extends Contenido {
    private String texto;

    public Articulo(String titulo, String autor, Categoria categoria, List<Etiqueta> etiquetas, String texto) {
        super(titulo, autor, categoria, etiquetas);
        this.texto = texto;
    }

    @Override
    public void publicar() {
        System.out.println("Artículo publicado: " + titulo + " (" + categoria + ")");
    }

    @Override
    public void mostrar() {
        System.out.println("[ARTÍCULO] " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Categoría: " + categoria);
        System.out.println("Etiquetas: " + etiquetas);
        System.out.println("Texto: " + texto);
    }

}
