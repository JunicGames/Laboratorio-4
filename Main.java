// Universidad del Valle de Guatemala
// Facultad de Ingeniería
// Programación Orientada a Objetos
// Segundo Ciclo, 2025
// Instructor: Ing. Erick Francisco Marroquín Rodríguez
// Laboratorio 4: Polimorfismo
// Julio Fernando Ortiz Alvarado – 251190
// Naomi Saraí Marroquín López - 25226
// Clase: Main
// Descripción: clase principal que inicia el programa

import controller.Controller;
import view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        ConsoleView view = new ConsoleView(controller);
        view.mostrarMenu();
    }
}
