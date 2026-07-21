package Ficha8;

import javax.swing.JOptionPane;

public class Ex10 {
    public static void main(String[] args) {
    	double soma = 0;
        int contador = 1;

        do {
            double num = Double.parseDouble(JOptionPane.showInputDialog("Número " + contador + ":"));
            soma += num;
            contador++;
        } while (contador <= 3);

        double media = soma / 3;
        JOptionPane.showMessageDialog(null, "Média = " + media);
    }
}