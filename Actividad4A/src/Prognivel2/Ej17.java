package Prognivel2;

import javax.swing.*;

public class Ej17 {
    public static void main(String[] args) {
        String mensaje = "";
        int numero = 0;

        mensaje = "Ingrese un numero";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        if (Funciones.esPrimo(numero))
            mensaje = "el numero " + numero + " si es primo ";
        else
            mensaje = "el numero " + numero + " no es primo ";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}