package Prognivel2;

import javax.swing.*;

public class Ej19 {
    public static void main(String[] args) {
        String mensaje = "";
        int numero = 0;

        mensaje = "Ingrese un numero";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        if (Funciones.esPerfecto(numero))
            mensaje = "el numero " + numero + " si es perfecto ";
        else
            mensaje = "el numero " + numero + " no es perfecto ";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}