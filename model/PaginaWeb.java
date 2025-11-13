// Universidad del Valle de Guatemala
// Facultad de Ingeniería
// Programación Orientada a Objetos
// Segundo Ciclo, 2025
// Instructor: Ing. Erick Francisco Marroquín Rodríguez
// Laboratorio 4: Polimorfismo
// Julio Fernando Ortiz Alvarado – 251190
// Naomi Saraí Marroquín López - 25226
// Clase: PaginaWeb
// Descripción: Es una página web dentro del CMS. administra, organiza y visualiza los contenidos de artículos, videos e imágenes. Ademas puede agregar, editar, eliminar, filtrar y generar reportes de contenidos.

package model;

import java.util.*;

public class PaginaWeb {
    private String nombre;
    private List<Contenido> contenidos = new ArrayList<>();

    public PaginaWeb(String nombre) {
        this.nombre = nombre;
    }

    public void agregarContenido(Contenido c) {
        contenidos.add(c);
    }

    public void eliminarContenido(String titulo) {
        contenidos.removeIf(c -> c.getTitulo().equalsIgnoreCase(titulo));
    }

    public void editarContenido(String titulo, String nuevoTitulo) {
        for (Contenido c : contenidos) {
            if (c.getTitulo().equalsIgnoreCase(titulo)) {
                c.setTitulo(nuevoTitulo);
                System.out.println("Contenido actualizado.");
                return;
            }
        }
        System.out.println("Contenido no encontrado.");
    }

    public void mostrarPagina() {
        System.out.println("Página: " + nombre);
        for (Contenido c : contenidos) {
            c.mostrar();
        }
    }

    public void filtrarPorCategoria(String nombreCategoria) {
        System.out.println("Contenidos en categoría: " + nombreCategoria);
        for (Contenido c : contenidos) {
            if (c.getCategoria().getNombre().equalsIgnoreCase(nombreCategoria)) {
                c.mostrar();
            }
        }
    }

    public void generarReporte() {
        System.out.println("Reporte de contenidos en " + nombre);
        System.out.println("Total contenidos: " + contenidos.size());
        Map<String, Long> conteo = new HashMap<>();
        for (Contenido c : contenidos) {
            conteo.put(c.getCategoria().getNombre(),
                conteo.getOrDefault(c.getCategoria().getNombre(), 0L) + 1);
        }
        conteo.forEach((cat, count) -> System.out.println(cat + ": " + count));
    }

    public String getNombre() { return nombre; }
}