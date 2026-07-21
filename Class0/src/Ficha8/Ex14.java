package Ficha8;

import javax.swing.JOptionPane;

public class Ex14 {
    public static void main(String[] args) {
    	String resultado = "";
        int i = 1;

        do {
            resultado += i + "\t";

            if (i % 10 == 0) {
                resultado += "\n";
            }

            i++;
        } while (i <= 50);

        JOptionPane.showMessageDialog(null, resultado);
    }
}