package com.mycompany.inventario;

// Clase abstracta Producto
public abstract class Producto {
    // Atributos
    protected String nombre;
    protected double precio;
    protected int cantidad;

    // Constructor
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Método abstracto para agregar cantidad al inventario
    public abstract void agregarCantidad(int cantidad);

    // Método abstracto para vender una cantidad del producto
    public abstract void vender(int cantidad);

    // Método concreto para consultar el inventario
    public void consultarInventario() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad disponible: " + cantidad);
    }
}
