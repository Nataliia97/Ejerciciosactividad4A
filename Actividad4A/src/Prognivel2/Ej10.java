package Prognivel2;

import javax.swing.*;

public class Ej10 {
    public static void main(String[] args) {
        String mensaje = "";
        int numero = 0;
        int cantdivisorespos = 0;

        mensaje = "Ingrese un numero";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        cantdivisorespos=Funciones.cantDivisoresPos(numero);

        mensaje="La cantidad de divisores positivos de este numero son: "+cantdivisorespos;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}