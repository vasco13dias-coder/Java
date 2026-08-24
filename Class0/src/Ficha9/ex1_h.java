package Ficha_9;

import javax.swing.JOptionPane;

public class ex1_h {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Introduz o valor de a:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Introduz o valor de b:"));

        int soma = 0;
        for (int i = a; i <= b; i++) {
            soma += i;
        }
        System.out.println("Soma entre " + a + " e " + b + " = " + soma);
    }
}