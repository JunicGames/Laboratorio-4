// Universidad del Valle de Guatemala
// Facultad de Ingeniería
// Programación Orientada a Objetos
// Segundo Ciclo, 2025
// Instructor: Ing. Erick Francisco Marroquín Rodríguez
// Laboratorio 4: Polimorfismo
// Julio Fernando Ortiz Alvarado – 251190
// Naomi Saraí Marroquín López - 25226
// Clase: Categoria
// Descripción: Representa las categorías que agrupan el contenido.
package model;

public class Categoria {
    private String nombre;

    public Categoria(String nombre) { this.nombre = nombre; }

    public String getNombre() { return nombre; }

    @Override
    public String toString() { return nombre; }
}