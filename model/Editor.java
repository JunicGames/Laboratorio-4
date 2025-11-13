// Universidad del Valle de Guatemala
// Facultad de Ingeniería
// Programación Orientada a Objetos
// Segundo Ciclo, 2025
// Instructor: Ing. Erick Francisco Marroquín Rodríguez
// Laboratorio 4: Polimorfismo
// Julio Fernando Ortiz Alvarado – 251190
// Naomi Saraí Marroquín López - 25226
// Clase: Editor
// Descripción: Subclase de Usuario con permisos para crear y editar contenidos, pero sin autorización para eliminar o publicar.
package model;

public class Editor extends Usuario {
    public Editor(String nombre) {
        super(nombre, "editor");
    }

    @Override
    public boolean puedeEliminar() { return false; }

    @Override
    public boolean puedePublicar() { return false; }
}