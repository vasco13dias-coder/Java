package Ficha8;

import javax.swing.JOptionPane;

public class Ex8 {
    public static void main(String[] args) {
    	int pares = 0;
        int impares = 0;
        int contador = 1;

        do {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Número " + contador + ":"));

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            contador++;
        } while (contador <= 10);

        JOptionPane.showMessageDialog(null, "Pares: " + pares + "\nÍmpares: " + impares);
    }
}