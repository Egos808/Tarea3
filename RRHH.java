package com.mycompany.rrhh;

import javax.swing.JOptionPane;

public class RRHH {

    public static void main(String[] args) {
        // Ingreso de datos para el empleado asalariado
        String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre del empleado asalariado:");
        String id1 = JOptionPane.showInputDialog("Ingrese el ID del empleado asalariado:");
        double salarioBase1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario base del empleado asalariado:"));
        
        Empleado empleadoAsalariado = new EmpleadoAsalariado(nombre1, id1, salarioBase1);
        empleadoAsalariado.mostrarInformacion();

        // Ingreso de datos para el empleado por horas
        String nombre2 = JOptionPane.showInputDialog("Ingrese el nombre del empleado por horas:");
        String id2 = JOptionPane.showInputDialog("Ingrese el ID del empleado por horas:");
        double salarioBase2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario base del empleado por horas (no usado):"));
        double horasTrabajadas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas trabajadas por el empleado por horas:"));
        double tarifaPorHora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tarifa por hora del empleado por horas:"));
        
        Empleado empleadoPorHoras = new EmpleadoPorHoras(nombre2, id2, salarioBase2, horasTrabajadas, tarifaPorHora);
        empleadoPorHoras.mostrarInformacion();
    }
}

