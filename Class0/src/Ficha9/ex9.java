package Ficha_9;

import javax.swing.JOptionPane;

public class ex9 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduz o número da tabuada:"));

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
    }
}