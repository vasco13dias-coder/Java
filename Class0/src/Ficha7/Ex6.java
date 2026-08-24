package Ficha7;
import javax.swing.JOptionPane;
public class Ex6 {
	 public static void main(String[] args) {
	        double euros = Double.parseDouble(JOptionPane.showInputDialog("Introduza a quantidade em euros:"));

	        String menu = "Converter para:\n" +
	                      "1 - Dólares (USA)\n" +
	                      "2 - Libras (UK)\n" +
	                      "3 - Yuan (CHINA)\n" +
	                      "4 - Franco Suíço";

	        int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

	        double resultado;
	        String moeda;

	        switch (opcao) {
	            case 1:
	                resultado = euros * 1.08;
	                moeda = "Dólares";
	                break;
	            case 2:
	                resultado = euros * 0.86;
	                moeda = "Libras";
	                break;
	            case 3:
	                resultado = euros * 7.80;
	                moeda = "Yuan";
	                break;
	            case 4:
	                resultado = euros * 0.95;
	                moeda = "Francos Suíços";
	                break;
	            default:
	                JOptionPane.showMessageDialog(null, "Opção inválida!");
	                return;
	        }

	        JOptionPane.showMessageDialog(null, euros + " € = " + resultado + " " + moeda);
	    }
}
