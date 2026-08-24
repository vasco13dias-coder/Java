package Ficha_9;

import javax.swing.JOptionPane;

public class ex6 {
    public static void main(String[] args) {
        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= 10; i++) {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Introduz o número " + i + ":"));
            if (n % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Pares:" + pares);
        System.out.println("Ípares: " + impares);   
    }
    
}