package com.mycompany.libreria;

import javax.swing.JOptionPane;

public class Libro {
    private String titulo;          // Título del libro
    private String autor;           // Autor del libro
    private int stock;              // Cantidad en stock

    // Constructor de la clase Libro
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.stock = 1; // Inicialmente, hay 1 libro en stock
    }

    // Método para prestar el libro
    public void prestar() {
        if (stock > 0) {
            stock--;  // Disminuye el stock en 1
            JOptionPane.showMessageDialog(null, "El libro '" + titulo + "' ha sido prestado.");
        } else {
            JOptionPane.showMessageDialog(null, "El libro '" + titulo + "' no está disponible para préstamo.");
        }
    }

    // Método para devolver el libro
    public void devolver() {
        stock++;  // Aumenta el stock en 1
        JOptionPane.showMessageDialog(null, "El libro '" + titulo + "' ha sido devuelto y está disponible nuevamente.");
    }

    // Método para consultar la disponibilidad y stock del libro
    public void consultarDisponibilidad() {
        if (stock > 0) {
            JOptionPane.showMessageDialog(null, "El libro '" + titulo + "' está disponible para préstamo. Stock: " + stock);
        } else {
            JOptionPane.showMessageDialog(null, "El libro '" + titulo + "' no está disponible para préstamo. Stock: " + stock);
        }
    }

    // Método para obtener el título del libro
    public String getTitulo() {
        return titulo;
    }

    // Método para verificar la cantidad en stock
    public int getStock() {
        return stock;
    }
}


