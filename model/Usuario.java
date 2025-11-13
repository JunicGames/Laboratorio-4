// Universidad del Valle de Guatemala
// Facultad de Ingeniería
// Programación Orientada a Objetos
// Segundo Ciclo, 2025
// Instructor: Ing. Erick Francisco Marroquín Rodríguez
// Laboratorio 4: Polimorfismo
// Julio Fernando Ortiz Alvarado – 251190
// Naomi Saraí Marroquín López - 25226
// Clase: Usuario
// Descripción: Es abstracta y define los atributos y comportamientos comunes de todos los usuarios del sistema.
package model;

public abstract class Usuario {
    protected String nombre;
    protected String tipo;

    public Usuario(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }

    public abstract boolean puedeEliminar();
    public abstract boolean puedePublicar();
}