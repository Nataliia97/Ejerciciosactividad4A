package Prognivel2;

import javax.swing.*;

public class Ej2 {
    public static void main(String[] args) {
        String mensaje = "";
        int numero = 0;

        mensaje = "Ingrese un numero";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        if (Funciones.esPar(numero))
            mensaje = "el numero " + numero + " es par ";
        else
            mensaje = "el numero " + numero + " no es par ";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
