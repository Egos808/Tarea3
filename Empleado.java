package com.mycompany.rrhh;

import javax.swing.JOptionPane;

public abstract class Empleado {
    protected String nombre;
    protected String id;
    protected double salarioBase;

    public Empleado(String nombre, String id, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    // Método abstracto para calcular el salario
    public abstract double calcularSalario();

    // Método concreto para mostrar la información del empleado
    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, 
            "Nombre: " + nombre + 
            "\nID: " + id + 
            "\nSalario Base: " + salarioBase + 
            "\nSalario Calculado: " + calcularSalario()
        );
    }
}
