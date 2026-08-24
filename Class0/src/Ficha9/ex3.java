package Ficha_9;

import javax.swing.JOptionPane;

public class ex3 {
    public static void main(String[] args) {
        int base = Integer.parseInt(JOptionPane.showInputDialog("Introduz a base:"));
        int expoente = Integer.parseInt(JOptionPane.showInputDialog("Introduz o expoente:"));

        long resultado = 1;
        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }

        System.out.println(base + "^" + expoente + " = " + resultado);
    }
}