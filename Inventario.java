package com.mycompany.inventario;

import javax.swing.JOptionPane;

public class Inventario {
    public static void main(String[] args) {
        // Crear instancias de Electronico
        Electronico laptop = new Electronico("Laptop", 1200.00, 10);
        Electronico Celular = new Electronico("Celular", 600.00, 5);

        while (true) {
            // Mostrar opciones al usuario
            String[] opciones = { "Consultar Inventario", "Vender Producto", "Agregar Producto", "Salir" };
            int eleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Inventario",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            if (eleccion == 0) {
                // Consultar Inventario
                String inventario = "Inventario:\n\n";
                inventario += getProductoInfo(laptop);
                inventario += getProductoInfo(Celular);
                JOptionPane.showMessageDialog(null, inventario);
            } else if (eleccion == 1) {
                // Vender Producto
                String producto = JOptionPane.showInputDialog("Ingrese el nombre del producto a vender (Laptop/Celular):");
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a vender:"));

                if (producto.equalsIgnoreCase("Laptop")) {
                    laptop.vender(cantidad);
                } else if (producto.equalsIgnoreCase("Celular")) {
                    Celular.vender(cantidad);
                } else {
                    JOptionPane.showMessageDialog(null, "Producto no encontrado.");
                }
            } else if (eleccion == 2) {
                // Agregar Producto
                String producto = JOptionPane.showInputDialog("Ingrese el nombre del producto a agregar (Laptop/Teléfono):");
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a agregar:"));

                if (producto.equalsIgnoreCase("Laptop")) {
                    laptop.agregarCantidad(cantidad);
                } else if (producto.equalsIgnoreCase("Celular")) {
                    Celular.agregarCantidad(cantidad);
                } else {
                    JOptionPane.showMessageDialog(null, "Producto no encontrado.");
                }
            } else if (eleccion == 3) {
                // Salir
                break;
            }
        }
    }

    private static String getProductoInfo(Producto producto) {
        return "Producto: " + producto.nombre + "\n" +
               "Precio: $" + producto.precio + "\n" +
               "Cantidad disponible: " + producto.cantidad + "\n\n";
    }
}


