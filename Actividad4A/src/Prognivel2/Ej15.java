package Prognivel2;

import javax.swing.*;

public class Ej15 {
    public static void main(String[] args) {
        String mensaje = "";
        int numero = 0;
        int sumdivisores = 0;

        mensaje = "Ingrese un numero";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        sumdivisores=Funciones.sumDivisores(numero);

        mensaje="La suma de los divisores de este numero son: "+sumdivisores;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}