package Ficha8;

import javax.swing.JOptionPane;

public class Ex11 {
    public static void main(String[] args) {
    	int n = Integer.parseInt(JOptionPane.showInputDialog("Número (N):"));

        String resultado = "";
        int i = 1;

        do {
            resultado += n + " X " + i + " = " + (n * i) + "\n";
            i++;
        } while (i <= 10);

        JOptionPane.showMessageDialog(null, resultado);
    }
}