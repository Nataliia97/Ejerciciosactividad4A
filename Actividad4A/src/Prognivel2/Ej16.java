package Prognivel2;

import javax.swing.*;

public class Ej16 {
    public static void main(String[] args) {
        String mensaje = "";
        int numero = 0;

        mensaje = "Ingrese un numero";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        if (Funciones.esCompuesto(numero))
            mensaje = "el numero " + numero + " si es compuesto ";
        else
            mensaje = "el numero " + numero + " no es compuesto ";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}