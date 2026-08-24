package Ficha_9;

import javax.swing.JOptionPane;

public class ex5 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Introduz o valor de a:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Introduz o valor de b:"));

        System.out.println("Números primos entre " + a + " e " + b + ":");
        for (int n = a; n <= b; n++) {
            boolean primo = true;
            if (n < 2) {
                primo = false;
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        primo = false;
                        break;
                    }
                }
            }
            if (primo) {
                System.out.print(n + " ");
            }
        }
    }
}