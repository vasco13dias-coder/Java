package Ficha8;

import javax.swing.JOptionPane;

public class Ex13 {
    public static void main(String[] args) {
    	int n = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do divisor:"));
        int a = Integer.parseInt(JOptionPane.showInputDialog("Início do intervalo (a):"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Final do intervalo (b):"));

        String resultado = "";
        int i = a;

        do {
            if (i % n == 0) {
                resultado += i + " ";
            }
            i++;
        } while (i <= b);

        JOptionPane.showMessageDialog(null, "Números divisíveis por " + n + " no intervalo de " + a + " a " + b + ":\n" + resultado);
    }
}