// Universidad del Valle de Guatemala
// Facultad de Ingeniería
// Programación Orientada a Objetos
// Segundo Ciclo, 2025
// Instructor: Ing. Erick Francisco Marroquín Rodríguez
// Laboratorio 4: Polimorfismo
// Julio Fernando Ortiz Alvarado – 251190
// Naomi Saraí Marroquín López - 25226
// Clase: controller
// Descripción: hace el control de usurario y el administrador
package controller;

import model.*;
import java.util.*;

public class Controller {
    private List<PaginaWeb> paginas = new ArrayList<>();
    private Usuario usuarioActual;

    public boolean login(String nombre, String tipo) {
        if (tipo.equalsIgnoreCase("admin")) {
            usuarioActual = new Admin(nombre);
        } else {
            usuarioActual = new Editor(nombre);
        }
        System.out.println("Sesión iniciada como " + usuarioActual.getTipo() + ": " + usuarioActual.getNombre());
        return true;
    }

    public Usuario getUsuarioActual() { return usuarioActual; }

    public void crearPagina(String nombre) {
        paginas.add(new PaginaWeb(nombre));
        System.out.println("Página creada: " + nombre);
    }

    public PaginaWeb buscarPagina(String nombre) {
        for (PaginaWeb p : paginas) {
            if (p.getNombre().equalsIgnoreCase(nombre)) return p;
        }
        return null;
    }

    public void mostrarPaginas() {
        for (PaginaWeb p : paginas) {
            p.mostrarPagina();
        }
    }

    public List<PaginaWeb> getPaginas() { return paginas; }
}
