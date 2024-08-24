package com.mycompany.libreria;

import javax.swing.JOptionPane;

public class Libreria {
    public static void main(String[] args) {
        // Crear instancias de Libro
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes");
        Libro libro2 = new Libro("1984", "George Orwell");

        int opcion; // Variable para almacenar la opción seleccionada por el usuario
        do {
            // Menú de opciones
            String menu = "1. Prestar libro\n" +
                          "2. Devolver libro\n" +
                          "3. Consultar disponibilidad del libro\n" +
                          "4. Salir\n" +
                          "Seleccione una opción:";
            String input = JOptionPane.showInputDialog(menu);
            opcion = Integer.parseInt(input);

            switch (opcion) {
                case 1: // Prestar libro
                    // Mostrar un cuadro de diálogo para seleccionar el libro a prestar
                    String[] opcionesLibros = {libro1.getTitulo(), libro2.getTitulo()};
                    String tituloPrestar = (String) JOptionPane.showInputDialog(
                        null,
                        "Seleccione el libro que desea prestar:",
                        "Prestar libro",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opcionesLibros,
                        opcionesLibros[0]
                    );
                    // Verificar qué libro ha sido seleccionado y realizar la acción correspondiente
                    if (tituloPrestar != null) {
                        if (tituloPrestar.equals(libro1.getTitulo())) {
                            libro1.prestar();
                        } else if (tituloPrestar.equals(libro2.getTitulo())) {
                            libro2.prestar();
                        }
                    }
                    break;

                case 2: // Devolver libro
                    // Mostrar un cuadro de diálogo para seleccionar el libro a devolver
                    String[] opcionesLibrosDevolver = {libro1.getTitulo(), libro2.getTitulo()};
                    String tituloDevolver = (String) JOptionPane.showInputDialog(
                        null,
                        "Seleccione el libro que desea devolver:",
                        "Devolver libro",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opcionesLibrosDevolver,
                        opcionesLibrosDevolver[0]
                    );
                    // Verificar qué libro ha sido seleccionado y realizar la acción correspondiente
                    if (tituloDevolver != null) {
                        if (tituloDevolver.equals(libro1.getTitulo())) {
                            libro1.devolver();
                        } else if (tituloDevolver.equals(libro2.getTitulo())) {
                            libro2.devolver();
                        }
                    }
                    break;

                case 3: // Consultar disponibilidad
                    // Mostrar un cuadro de diálogo para seleccionar el libro para consultar disponibilidad
                    String[] opcionesLibrosConsultar = {libro1.getTitulo(), libro2.getTitulo()};
                    String tituloConsultar = (String) JOptionPane.showInputDialog(
                        null,
                        "Seleccione el libro para consultar disponibilidad:",
                        "Consultar disponibilidad",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opcionesLibrosConsultar,
                        opcionesLibrosConsultar[0]
                    );
                    // Verificar qué libro ha sido seleccionado y consultar su disponibilidad
                    if (tituloConsultar != null) {
                        if (tituloConsultar.equals(libro1.getTitulo())) {
                            libro1.consultarDisponibilidad();
                        } else if (tituloConsultar.equals(libro2.getTitulo())) {
                            libro2.consultarDisponibilidad();
                        }
                    }
                    break;

                case 4:
                    // Mensaje de salida
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;

                default:
                    // Mensaje para opción no válida
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        } while (opcion != 4);
    }
}


