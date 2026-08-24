package Ficha8;

import javax.swing.JOptionPane;

public class Ex3 {
    public static void main(String[] args) {
    	int opcao;

        do {
            String menu = "1-Somar\n2-Diminuir\n3-Multiplicar\n4-Dividir\n5-Resto da Divisão\n0-Sair";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (opcao >= 1 && opcao <= 5) {
                double n1 = Double.parseDouble(JOptionPane.showInputDialog("Primeiro número (positivo):"));
                double n2 = Double.parseDouble(JOptionPane.showInputDialog("Segundo número (positivo):"));
                double resultado = 0;

                switch (opcao) {
                    case 1: resultado = n1 + n2; break;
                    case 2: resultado = n1 - n2; break;
                    case 3: resultado = n1 * n2; break;
                    case 4: resultado = n1 / n2; break;
                    case 5: resultado = n1 % n2; break;
                }

                JOptionPane.showMessageDialog(null, "Resultado = " + resultado);

            } else if (opcao != 0) {
                JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        } while (opcao != 0);
    }
}