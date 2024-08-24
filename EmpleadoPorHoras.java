package com.mycompany.rrhh;

public class EmpleadoPorHoras extends Empleado {
    private double horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, String id, double salarioBase, double horasTrabajadas, double tarifaPorHora) {
        super(nombre, id, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora; // Salario basado en horas trabajadas
    }
}

