package controller;

import java.util.*;
import model.*;

public class Controller {
    private final List<Contenido> contenidos = new ArrayList<>();
    private final List<Usuario> usuarios = new ArrayList<>();

    public void agregarUsuario(Usuario u) {
        if (u != null && !usuarios.contains(u)) {
            usuarios.add(u);
            System.out.println("Usuario agregado: " + u.getNombre());
        } else {
            System.out.println("Usuario inválido o ya existente.");
        }
    }

    public void crearContenido(Usuario u, String tipo, int id, String titulo, String descripcion, Categoria categoria) {
        if (u == null) {
            System.out.println("Error: usuario no válido.");
            return;
        }
        Contenido c = u.crearContenido(tipo, id, titulo, descripcion, categoria);
        if (c != null) {
            contenidos.add(c);
            System.out.println("Contenido creado: " + titulo);
        } else {
            System.out.println("Error al crear contenido.");
        }
    }

    public void eliminarContenido(int id) {
        boolean eliminado = contenidos.removeIf(c -> c.getId() == id);
        if (eliminado)
            System.out.println("Contenido con ID " + id + " eliminado.");
        else
            System.out.println("No se encontró contenido con ID " + id + ".");
    }

    public void listarContenidos() {
        System.out.println("=== LISTA DE CONTENIDOS ===");
        if (contenidos.isEmpty()) {
            System.out.println("No hay contenidos registrados.");
            return;
        }
        contenidos.forEach(c ->
            System.out.println("- " + c.getTitulo() + " (" + c.getClass().getSimpleName() + ")")
        );
    }

    public void filtrarPorCategoria(String cat) {
        System.out.println("=== 🔍 Filtrando por categoría: " + cat + " ===");
        contenidos.stream()
            .filter(c -> c.getCategoria().getNombre().equalsIgnoreCase(cat))
            .forEach(c -> System.out.println(c.getTitulo()));
    }

    public void filtrarPorTipo(String tipo) {
        System.out.println("=== 🔍 Filtrando por tipo: " + tipo + " ===");
        contenidos.stream()
            .filter(c -> c.getClass().getSimpleName().equalsIgnoreCase(tipo))
            .forEach(c -> System.out.println(c.getTitulo()));
    }

    public void publicar(Publicable c) {
        if (c != null)
            c.publicar();
    }

    public void generarReporte() {
        System.out.println("=== 📊 REPORTE GENERAL ===");
        System.out.println("Total de contenidos: " + contenidos.size());
        long publicados = contenidos.stream().filter(c -> c instanceof Publicable).count();
        System.out.println("Publicables: " + publicados);
    }
}