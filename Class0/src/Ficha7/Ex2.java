package Ficha7;
import javax.swing.JOptionPane;
public class Ex2 {
	 public static void main(String[] args) {
	        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Introduza o 1º número:"));
	        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Introduza o 2º número:"));
	        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Introduza o 3º número:"));

	        String menu = "Escolha:\n" +
	                      "1 - Maior\n" +
	                      "2 - Menor\n" +
	                      "3 - Média\n" +
	                      "4 - Soma";

	        int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

	        String resultado;

	        switch (opcao) {
	            case 1:
	                double maior = Math.max(n1, Math.max(n2, n3));
	                resultado = "Maior = " + maior;
	                break;
	            case 2:
	                double menor = Math.min(n1, Math.min(n2, n3));
	                resultado = "Menor = " + menor;
	                break;
	            case 3:
	                double media = (n1 + n2 + n3) / 3;
	                resultado = "Média = " + media;
	                break;
	            case 4:
	                double soma = n1 + n2 + n3;
	                resultado = "Soma = " + soma;
	                break;
	            default:
	                resultado = "Opção inválida!";
	        }

	        JOptionPane.showMessageDialog(null, resultado);
	    }
}
