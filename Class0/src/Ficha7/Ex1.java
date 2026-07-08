package Ficha7;
import javax.swing.JOptionPane;
public class Ex1 {
	 public static void main(String[] args) {
	        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduza o 1º número inteiro:"));
	        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduza o 2º número inteiro:"));

	        String menu = "Escolha a operação:\n" +
	                      "1 - Somar\n" +
	                      "2 - Diminuir\n" +
	                      "3 - Multiplicar\n" +
	                      "4 - Dividir\n" +
	                      "5 - Resto da divisão inteira";

	        int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

	        String resultado;

	        switch (opcao) {
	            case 1:
	                resultado = "Soma = " + (n1 + n2);
	                break;
	            case 2:
	                resultado = "Diferença = " + (n1 - n2);
	                break;
	            case 3:
	                resultado = "Produto = " + (n1 * n2);
	                break;
	            case 4:
	                if (n2 == 0) {
	                    resultado = "Erro: divisão por zero!";
	                } else {
	                    resultado = "Divisão = " + ((double) n1 / n2);
	                }
	                break;
	            case 5:
	                if (n2 == 0) {
	                    resultado = "Erro: divisão por zero!";
	                } else {
	                    resultado = "Resto = " + (n1 % n2);
	                }
	                break;
	            default:
	                resultado = "Opção inválida!";
	        }

	        JOptionPane.showMessageDialog(null, resultado);
	 }
}
