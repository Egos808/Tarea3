package com.mycompany.inventario;
import javax.swing.JOptionPane;

// Clase concreta Electronico que extiende Producto
public class Electronico extends Producto {
    // Constructor
    public Electronico(String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
    }

    // Implementación del método abstracto agregarCantidad
    @Override
    public void agregarCantidad(int cantidad) {
        this.cantidad += cantidad;
        JOptionPane.showMessageDialog(null, "Se han agregado " + cantidad + " unidades del producto '" + nombre + "'.");
    }

    // Implementación del método abstracto vender
    @Override
    public void vender(int cantidad) {
        if (this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
            JOptionPane.showMessageDialog(null, "Se han vendido " + cantidad + " unidades del producto '" + nombre + "'.");
        } else {
            JOptionPane.showMessageDialog(null, "No hay suficiente cantidad para vender. Cantidad disponible: " + this.cantidad);
        }
    }
}



