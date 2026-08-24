package Ficha8;

import javax.swing.JOptionPane;

public class Ex2 {
    public static void main(String[] args) {
    	int opcao;

        do {
            String menu = "1- Calcular Voltagem\n" +
                           "2- Calcular Intensidade\n" +
                           "3- Calcular Resistência\n" +
                           "0- Sair";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (opcao == 1) {
                double r = Double.parseDouble(JOptionPane.showInputDialog("Resistência (R):"));
                double i = Double.parseDouble(JOptionPane.showInputDialog("Intensidade (I):"));
                double v = r * i;
                JOptionPane.showMessageDialog(null, "Voltagem = " + v + " V");

            } else if (opcao == 2) {
                double v = Double.parseDouble(JOptionPane.showInputDialog("Voltagem (V):"));
                double r = Double.parseDouble(JOptionPane.showInputDialog("Resistência (R):"));
                double i = v / r;
                JOptionPane.showMessageDialog(null, "Intensidade = " + i + " A");

            } else if (opcao == 3) {
                double v = Double.parseDouble(JOptionPane.showInputDialog("Voltagem (V):"));
                double i = Double.parseDouble(JOptionPane.showInputDialog("Intensidade (I):"));
                double r = v / i;
                JOptionPane.showMessageDialog(null, "Resistência = " + r + " Ω");

            } else if (opcao != 0) {
                JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        } while (opcao != 0);
    }
}