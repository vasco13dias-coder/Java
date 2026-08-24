package Ficha_9;

import javax.swing.JOptionPane;

public class ex2 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Introduz um nome:");
        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduz um número entre 1 e 20:"));

        for (int i = 1; i <= n; i++) {
            System.out.println(nome);
        }
    }
}