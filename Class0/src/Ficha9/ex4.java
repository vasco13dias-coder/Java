package Ficha_9;

import javax.swing.JOptionPane;

public class ex4 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduz um número entre 1 e 20:"));

        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println(n + "! = " + fatorial);
    }
}