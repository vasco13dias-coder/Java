package Ficha7;
import javax.swing.JOptionPane;
public class Ex14 {
	 public static void main(String[] args) {
	        int mes = Integer.parseInt(JOptionPane.showInputDialog("Introduza o mês (1-12):"));

	        int dias;

	        switch (mes) {
	            case 1:
	            case 3:
	            case 5:
	            case 7:
	            case 8:
	            case 10:
	            case 12:
	                dias = 31;
	                break;
	            case 4:
	            case 6:
	            case 9:
	            case 11:
	                dias = 30;
	                break;
	            case 2:
	                dias = 28;
	                break;
	            default:
	                JOptionPane.showMessageDialog(null, "Mês inválido!");
	                return;
	        }

	        JOptionPane.showMessageDialog(null, "O mês " + mes + " tem " + dias + " dias.");
	    }
}
