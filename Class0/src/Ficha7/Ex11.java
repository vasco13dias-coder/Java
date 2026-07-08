package Ficha7;
import javax.swing.JOptionPane;
public class Ex11 {
	  public static void main(String[] args) {
	        String menu = "Plano de trabalho:\n" +
	                      "1 - Aumento de 10%\n" +
	                      "2 - Aumento de 15%\n" +
	                      "3 - Aumento de 20%";

	        int plano = Integer.parseInt(JOptionPane.showInputDialog(menu));
	        double salario = Double.parseDouble(JOptionPane.showInputDialog("Introduza o salário atual:"));

	        double novoSalario;

	        switch (plano) {
	            case 1:
	                novoSalario = salario * 1.10;
	                break;
	            case 2:
	                novoSalario = salario * 1.15;
	                break;
	            case 3:
	                novoSalario = salario * 1.20;
	                break;
	            default:
	                JOptionPane.showMessageDialog(null, "Plano inválido!");
	                return;
	        }

	        JOptionPane.showMessageDialog(null, "Novo salário: " + novoSalario + " €");
	    }
}
