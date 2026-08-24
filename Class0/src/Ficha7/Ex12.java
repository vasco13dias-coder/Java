package Ficha7;
import javax.swing.JOptionPane;
public class Ex12 {
	 public static void main(String[] args) {
	        double preco = Double.parseDouble(JOptionPane.showInputDialog("Introduza o preço do produto:"));

	        String menu = "Forma de pagamento:\n" +
	                      "1 - 1 vez\n" +
	                      "2 - Em 2 vezes\n" +
	                      "3 - Em 3 vezes\n" +
	                      "4 - De 4 a 6 vezes";

	        int codigo = Integer.parseInt(JOptionPane.showInputDialog(menu));

	        double desconto;
	        int prestacoes;

	        switch (codigo) {
	            case 1:
	                desconto = 0.30;
	                prestacoes = 1;
	                break;
	            case 2:
	                desconto = 0.20;
	                prestacoes = 2;
	                break;
	            case 3:
	                desconto = 0.10;
	                prestacoes = 3;
	                break;
	            case 4:
	                desconto = 0.0;
	                prestacoes = Integer.parseInt(JOptionPane.showInputDialog("Quantas vezes (4 a 6)?"));
	                break;
	            default:
	                JOptionPane.showMessageDialog(null, "Código inválido!");
	                return;
	        }

	        double precoComDesconto = preco * (1 - desconto);
	        double valorPrestacao = precoComDesconto / prestacoes;

	        JOptionPane.showMessageDialog(null,
	                "Nº de prestações: " + prestacoes +
	                "\nValor de cada prestação: " + valorPrestacao + " €");
	    }
}
