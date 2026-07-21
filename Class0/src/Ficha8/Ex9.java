package Ficha8;

import javax.swing.JOptionPane;

public class Ex9 {
    public static void main(String[] args) {
    	int dentro = 0;
        int fora = 0;
        int contador = 1;

        do {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Número " + contador + ":"));

            if (num >= 10 && num <= 20) {
                dentro++;
            } else {
                fora++;
            }

            contador++;
        } while (contador <= 10);

        JOptionPane.showMessageDialog(null, "Dentro do intervalo: " + dentro + "\nFora do intervalo: " + fora);
    }
}