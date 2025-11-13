// Universidad del Valle de Guatemala
// Facultad de Ingeniería
// Programación Orientada a Objetos
// Segundo Ciclo, 2025
// Instructor: Ing. Erick Francisco Marroquín Rodríguez
// Laboratorio 4: Polimorfismo
// Julio Fernando Ortiz Alvarado – 251190
// Naomi Saraí Marroquín López - 25226
// Clase: Etiqueta
// Descripción: Son etiquetas o palabras clave que clasifican y agrupan el contenido relacionado dentro del sistema.
package model;

public class Etiqueta {
    private String nombre;

    public Etiqueta(String nombre) { this.nombre = nombre; }

    public String getNombre() { return nombre; }

    @Override
    public String toString() { return nombre; }
}