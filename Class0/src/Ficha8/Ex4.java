package Ficha8;

import javax.swing.JOptionPane;

public class Ex4 {
    public static void main(String[] args) {
    	int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;
        int contador = 0;
        int opcao;

        do {
            String menu = "1- Introduzir número\n" +
                          "2- Mostrar Maior\n" +
                          "3- Mostrar Menor\n" +
                          "4- Mostrar Soma\n" +
                          "5- Mostrar Média\n" +
                          "0- Sair";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (opcao == 1) {
                int num = Integer.parseInt(JOptionPane.showInputDialog("Introduz um número:"));

                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }

                soma += num;
                contador++;

            } else if (opcao == 2) {
                if (contador == 0) {
                    JOptionPane.showMessageDialog(null, "Ainda não introduziste nenhum número!");
                } else {
                    JOptionPane.showMessageDialog(null, "Maior número: " + maior);
                }

            } else if (opcao == 3) {
                if (contador == 0) {
                    JOptionPane.showMessageDialog(null, "Ainda não introduziste nenhum número!");
                } else {
                    JOptionPane.showMessageDialog(null, "Menor número: " + menor);
                }

            } else if (opcao == 4) {
                JOptionPane.showMessageDialog(null, "Soma: " + soma);

            } else if (opcao == 5) {
                if (contador == 0) {
                    JOptionPane.showMessageDialog(null, "Ainda não introduziste nenhum número!");
                } else {
                    double media = (double) soma / contador;
                    JOptionPane.showMessageDialog(null, "Média: " + media);
                }

            } else if (opcao != 0) {
                JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        } while (opcao != 0);
    }
}