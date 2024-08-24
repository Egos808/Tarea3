package com.mycompany.comparaedad;
import javax.swing.JOptionPane;

public class ComparaEdad {

    public static void main(String[] args) {
        //Solicitamos la edad a la persona 1
        String inputNacimiento1 = JOptionPane.showInputDialog("Ingrese el año de nacimiento de la primera persona:");
        int nacimiento1 = Integer.parseInt(inputNacimiento1);

        //Solicitamos la edad a la persona 2
        String inputNacimiento2 = JOptionPane.showInputDialog("Ingrese el año de nacimiento de la segunda persona:");
        int nacimiento2 = Integer.parseInt(inputNacimiento2);
        
        //Calcular la diferencia de edad
        int diferenciaEdad = Math.abs(nacimiento1 - nacimiento2);
        
        // Quien ES mayor?
        String mensaje;
        if(nacimiento1 < nacimiento2){
            mensaje = "La primera persona es mayor que la segunda por "+ diferenciaEdad + " años.";
        } else if (nacimiento1 > nacimiento2){
            mensaje = "La segunda persona es mayor que la primera por " + diferenciaEdad + " años.";
        }else{
            mensaje = "Ambas pesonas tienen la misma edad.";
        }
        
        JOptionPane.showMessageDialog(null, mensaje);

    }
}
