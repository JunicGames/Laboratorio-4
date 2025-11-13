import controller.Controller;
import model.*;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        Categoria educacion = new Categoria(1, "Educación");
        Etiqueta tag1 = new Etiqueta(1, "Tutorial");

        Admin admin = new Admin(1, "Carlos", "carlos@ega.edu");
        controller.agregarUsuario(admin);

        controller.crearContenido(admin, "articulo", 1, "Introducción a Java", "Conceptos básicos de programación.", educacion);
        controller.crearContenido(admin, "video", 2, "Polimorfismo en OOP", "Explicación audiovisual.", educacion);

        controller.listarContenidos();
        controller.filtrarPorTipo("video");

        admin.publicarContenido(new Articulo(3, "Tendencias en IA", "Explorando el futuro de la inteligencia artificial.", educacion));

        controller.generarReporte();
    }
}