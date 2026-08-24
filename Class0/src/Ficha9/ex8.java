package Ficha_9;

import javax.swing.JOptionPane;

public class ex8 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos termos da série de Fibonacci?"));

        long anterior = 0;
        long atual = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(atual + " ");
            long proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
    }
}