package Ficha_9;

import javax.swing.JOptionPane;

public class ex10 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do divisor:"));
        int a = Integer.parseInt(JOptionPane.showInputDialog("Início do intervalo (a):"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Final do intervalo (b):"));

        System.out.println("Números divisíveis por " + n + " no intervalo de " + a + " a " + b + ":");
        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                System.out.print(i + " ");
            }
        }
    }
}