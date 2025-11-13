// Universidad del Valle de Guatemala
// Facultad de Ingeniería
// Programación Orientada a Objetos
// Segundo Ciclo, 2025
// Instructor: Ing. Erick Francisco Marroquín Rodríguez
// Laboratorio 4: Polimorfismo
// Julio Fernando Ortiz Alvarado – 251190
// Naomi Saraí Marroquín López - 25226
// Clase: Administrador
// Descripción: Subclase de Usuario con permisos para crear, editar, publicar y eliminar contenidos en el sistema.
package model;

public class Admin extends Usuario {
    public Admin(String nombre) {
        super(nombre, "admin");
    }

    @Override
    public boolean puedeEliminar() { return true; }

    @Override
    public boolean puedePublicar() { return true; }
}