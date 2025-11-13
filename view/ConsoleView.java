package view;

import controller.Controller;
import model.*;

import java.util.*;

public class ConsoleView {
    private Controller controller;
    private Scanner scanner = new Scanner(System.in);

    public ConsoleView(Controller controller) {
        this.controller = controller;
    }

    public void iniciarSesion() {
        System.out.print("Nombre de usuario: ");
        String nombre = scanner.nextLine();
        System.out.print("Tipo de usuario (admin/editor): ");
        String tipo = scanner.nextLine();
        controller.login(nombre, tipo);
    }

    public void mostrarMenu() {
        iniciarSesion();
        int opcion;
        do {
            System.out.println("\n=== MENÚ CMS ===");
            System.out.println("1. Crear nueva página");
            System.out.println("2. Agregar contenido");
            System.out.println("3. Editar contenido");
            System.out.println("4. Eliminar contenido");
            System.out.println("5. Ver páginas");
            System.out.println("6. Filtrar por categoría");
            System.out.println("7. Generar reporte");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt(); scanner.nextLine();

            switch (opcion) {
                case 1 -> crearPagina();
                case 2 -> agregarContenido();
                case 3 -> editarContenido();
                case 4 -> eliminarContenido();
                case 5 -> controller.mostrarPaginas();
                case 6 -> filtrarPorCategoria();
                case 7 -> generarReporte();
                case 0 -> System.out.println("Saliendo del CMS...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    private void crearPagina() {
        System.out.print("Nombre de la página: ");
        String nombre = scanner.nextLine();
        controller.crearPagina(nombre);
    }

    private void agregarContenido() {
        System.out.print("Nombre de la página: ");
        String nombre = scanner.nextLine();
        PaginaWeb pagina = controller.buscarPagina(nombre);
        if (pagina == null) {
            System.out.println("Página no encontrada.");
            return;
        }

        System.out.print("Tipo de contenido (1: Artículo, 2: Imagen, 3: Video): ");
        int tipo = scanner.nextInt(); scanner.nextLine();
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Categoría: ");
        Categoria categoria = new Categoria(scanner.nextLine());
        System.out.print("Etiquetas (separadas por comas): ");
        String[] etiq = scanner.nextLine().split(",");
        List<Etiqueta> etiquetas = new ArrayList<>();
        for (String e : etiq) etiquetas.add(new Etiqueta(e.trim()));

        switch (tipo) {
            case 1 -> {
                System.out.print("Texto del artículo: ");
                String texto = scanner.nextLine();
                pagina.agregarContenido(new Articulo(titulo, autor, categoria, etiquetas, texto));
            }
            case 2 -> {
                System.out.print("URL de la imagen: ");
                String url = scanner.nextLine();
                pagina.agregarContenido(new Imagen(titulo, autor, categoria, etiquetas, url));
            }
            case 3 -> {
                System.out.print("Link del video: ");
                String enlace = scanner.nextLine();
                pagina.agregarContenido(new Video(titulo, autor, categoria, etiquetas, enlace));
            }
            default -> System.out.println("Tipo inválido.");
        }
    }

    private void editarContenido() {
        System.out.print("Página: ");
        String pagina = scanner.nextLine();
        PaginaWeb p = controller.buscarPagina(pagina);
        if (p == null) return;
        System.out.print("Título del contenido a editar: ");
        String t = scanner.nextLine();
        System.out.print("Nuevo título: ");
        String nuevo = scanner.nextLine();
        p.editarContenido(t, nuevo);
    }

    private void eliminarContenido() {
        if (!controller.getUsuarioActual().puedeEliminar()) {
            System.out.println("No tienes permiso para eliminar contenido.");
            return;
        }
        System.out.print("Página: ");
        String pagina = scanner.nextLine();
        PaginaWeb p = controller.buscarPagina(pagina);
        if (p == null) return;
        System.out.print("Título del contenido a eliminar: ");
        String titulo = scanner.nextLine();
        p.eliminarContenido(titulo);
    }

    private void filtrarPorCategoria() {
        System.out.print("Página: ");
        String nombre = scanner.nextLine();
        PaginaWeb p = controller.buscarPagina(nombre);
        if (p == null) return;
        System.out.print("Categoría: ");
        String cat = scanner.nextLine();
        p.filtrarPorCategoria(cat);
    }

    private void generarReporte() {
        System.out.print("Página: ");
        String nombre = scanner.nextLine();
        PaginaWeb p = controller.buscarPagina(nombre);
        if (p == null) return;
        p.generarReporte();
    }
}
