package Ficha8;

import javax.swing.JOptionPane;

public class Ex15 {
    public static void main(String[] args) {
    	double valorEuros = 0;
        int opcao;

        final double TAXA_DOLAR = 1.08;
        final double TAXA_LIBRA = 0.84;
        final double TAXA_FRANCO = 0.95;
        final double TAXA_YUAN = 7.75;

        do {
            String menu = "1 - Ler valor em Euros\n" +
                           "2 - Converter para Dólares\n" +
                           "3 - Converter para Libras\n" +
                           "4 - Converter para Francos Suíços\n" +
                           "5 - Converter para Yuan\n" +
                           "0 - Sair";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (opcao == 1) {
                valorEuros = Double.parseDouble(JOptionPane.showInputDialog("Valor em Euros:"));

            } else if (opcao == 2) {
                JOptionPane.showMessageDialog(null, "Valor em Dólares: " + (valorEuros * TAXA_DOLAR));

            } else if (opcao == 3) {
                JOptionPane.showMessageDialog(null, "Valor em Libras: " + (valorEuros * TAXA_LIBRA));

            } else if (opcao == 4) {
                JOptionPane.showMessageDialog(null, "Valor em Francos Suíços: " + (valorEuros * TAXA_FRANCO));

            } else if (opcao == 5) {
                JOptionPane.showMessageDialog(null, "Valor em Yuan: " + (valorEuros * TAXA_YUAN));

            } else if (opcao != 0) {
                JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        } while (opcao != 0);
    }
}