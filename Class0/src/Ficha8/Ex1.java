package Ficha8;

import javax.swing.JOptionPane;

public class Ex1 {
    public static void main(String[] args) {

        // a) números de 1 a 10
        String resA = "";
        int i = 1;
        do {
            resA += i + " ";
            i++;
        } while (i <= 10);
        JOptionPane.showMessageDialog(null, resA, "a) 1 a 10", JOptionPane.INFORMATION_MESSAGE);

        // b) números de 50 a 60
        String resB = "";
        int b = 50;
        do {
            resB += b + " ";
            b++;
        } while (b <= 60);
        JOptionPane.showMessageDialog(null, resB, "b) 50 a 60", JOptionPane.INFORMATION_MESSAGE);

        // c) números de 90 a 80 (ordem decrescente)
        String resC = "";
        int c = 90;
        do {
            resC += c + " ";
            c--;
        } while (c >= 80);
        JOptionPane.showMessageDialog(null, resC, "c) 90 a 80", JOptionPane.INFORMATION_MESSAGE);

        // d) pares de 60 a 80
        String resD = "";
        int d = 60;
        do {
            if (d % 2 == 0) {
                resD += d + " ";
            }
            d++;
        } while (d <= 80);
        JOptionPane.showMessageDialog(null, resD, "d) Pares 60 a 80", JOptionPane.INFORMATION_MESSAGE);

        // e) múltiplos de 5 entre 20 e 40
        String resE = "";
        int e = 20;
        do {
            if (e % 5 == 0) {
                resE += e + " ";
            }
            e++;
        } while (e <= 40);
        JOptionPane.showMessageDialog(null, resE, "e) Múltiplos de 5 (20-40)", JOptionPane.INFORMATION_MESSAGE);

        // f) múltiplos de 4 E 6 entre 80 e 120
        String resF = "";
        int f = 80;
        do {
            if (f % 4 == 0 && f % 6 == 0) {
                resF += f + " ";
            }
            f++;
        } while (f <= 120);
        JOptionPane.showMessageDialog(null, resF, "f) Múltiplos de 4 e 6 (80-120)", JOptionPane.INFORMATION_MESSAGE);

        // g) soma de 1 a 20
        int somaG = 0;
        int g = 1;
        do {
            somaG += g;
            g++;
        } while (g <= 20);
        JOptionPane.showMessageDialog(null, "Soma = " + somaG, "g) Soma 1 a 20", JOptionPane.INFORMATION_MESSAGE);

        // h) soma de um intervalo [a,b] pedido ao utilizador
        int inicioH = Integer.parseInt(JOptionPane.showInputDialog("h) Valor inicial do intervalo:"));
        int fimH = Integer.parseInt(JOptionPane.showInputDialog("h) Valor final do intervalo:"));
        int somaH = 0;
        int h = inicioH;
        do {
            somaH += h;
            h++;
        } while (h <= fimH);
        JOptionPane.showMessageDialog(null, "Soma = " + somaH, "h) Soma do intervalo", JOptionPane.INFORMATION_MESSAGE);

        // i) verificar se um número é primo
        int numI = Integer.parseInt(JOptionPane.showInputDialog("i) Introduz um número:"));
        boolean primo = numI > 1;
        int div = 2;
        do {
            if (numI % div == 0) {
                primo = false;
            }
            div++;
        } while (div < numI && primo);
        JOptionPane.showMessageDialog(null, numI + (primo ? " é primo" : " não é primo"), "i) Primo?", JOptionPane.INFORMATION_MESSAGE);

        // j) ler número até ser maior que zero
        int numJ;
        do {
            numJ = Integer.parseInt(JOptionPane.showInputDialog("j) Introduz um número maior que zero:"));
        } while (numJ <= 0);
        JOptionPane.showMessageDialog(null, "Número aceite: " + numJ, "j) Maior que zero", JOptionPane.INFORMATION_MESSAGE);

        // k) ler número até estar entre 15 e 20
        int numK;
        do {
            numK = Integer.parseInt(JOptionPane.showInputDialog("k) Introduz um número entre 15 e 20:"));
        } while (numK < 15 || numK > 20);
        JOptionPane.showMessageDialog(null, "Número aceite: " + numK, "k) Entre 15 e 20", JOptionPane.INFORMATION_MESSAGE);

        // l) ler e somar consecutivamente até ser zero
        int somaL = 0;
        int numL;
        do {
            numL = Integer.parseInt(JOptionPane.showInputDialog("l) Introduz um número (0 para terminar):"));
            somaL += numL;
        } while (numL != 0);
        JOptionPane.showMessageDialog(null, "Soma total = " + somaL, "l) Soma até zero", JOptionPane.INFORMATION_MESSAGE);
    }
}