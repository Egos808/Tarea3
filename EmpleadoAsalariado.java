package com.mycompany.rrhh;

public class EmpleadoAsalariado extends Empleado {

    public EmpleadoAsalariado(String nombre, String id, double salarioBase) {
        super(nombre, id, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase; // Salario mensual fijo
    }
}


