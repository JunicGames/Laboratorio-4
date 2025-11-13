// Universidad del Valle de Guatemala
// Facultad de Ingeniería
// Programación Orientada a Objetos
// Segundo Ciclo, 2025
// Instructor: Ing. Erick Francisco Marroquín Rodríguez
// Laboratorio 4: Polimorfismo
// Julio Fernando Ortiz Alvarado – 251190
// Naomi Saraí Marroquín López - 25226
// Clase: Imagen
// Descripción: Subclase de Contenido que representa las imágenes, con fuente o URL y su visualización en el CMS.
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