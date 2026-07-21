package Ficha8;

import javax.swing.JOptionPane;

public class Ex5 {
    public static void main(String[] args) {
    	int opcao;

        do {
            String menu = "1- Área retângulo\n2- Área triângulo\n3- Área circunferência\n0-Sair";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (opcao == 1) {
                double base = Double.parseDouble(JOptionPane.showInputDialog("Base:"));
                double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));
                double area = base * altura;
                JOptionPane.showMessageDialog(null, "Área do retângulo = " + area);

            } else if (opcao == 2) {
                double base = Double.parseDouble(JOptionPane.showInputDialog("Base:"));
                double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));
                double area = (base * altura) / 2;
                JOptionPane.showMessageDialog(null, "Área do triângulo = " + area);

            } else if (opcao == 3) {
                double raio = Double.parseDouble(JOptionPane.showInputDialog("Raio:"));
                double area = Math.PI * raio * raio;
                JOptionPane.showMessageDialog(null, "Área da circunferência = " + area);

            } else if (opcao != 0) {
                JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        } while (opcao != 0);
    }
}