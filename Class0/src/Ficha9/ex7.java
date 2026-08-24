package Ficha_9;

import javax.swing.JOptionPane;

public class ex7 {
    public static void main(String[] args) {
        int dentro = 0;
        int fora = 0;

        for (int i = 1; i <= 10; i++) {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Introduz o número " + i + ":"));
            if (n >= 10 && n <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }

        System.out.println("Dentro do intervalo [10,20]: " + dentro);
        System.out.println("Fora do intervalo: " + fora);
    }
}