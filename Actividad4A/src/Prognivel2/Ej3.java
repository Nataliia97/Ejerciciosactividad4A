package Prognivel2;

import javax.swing.*;

public class Ej3 {
    public static void main(String[] args) {
        String mensaje = "";
        int numero = 0;

        mensaje = "Ingrese un numero";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        if (Funciones.esImpar(numero))
            mensaje = "el numero " + numero + " si es impar ";
        else
            mensaje = "el numero " + numero + " no es impar ";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}