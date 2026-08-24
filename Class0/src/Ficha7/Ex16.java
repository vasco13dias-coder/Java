package Ficha7;
import javax.swing.JOptionPane;
public class Ex16 {
	 public static void main(String[] args) {
	        double percurso = Double.parseDouble(JOptionPane.showInputDialog("Introduza o percurso em Km:"));
	        String tipo = JOptionPane.showInputDialog("Introduza o tipo de carro (A, B ou C):").toUpperCase();

	        double kmPorLitro;

	        switch (tipo) {
	            case "A":
	                kmPorLitro = 12;
	                break;
	            case "B":
	                kmPorLitro = 9;
	                break;
	            case "C":
	                kmPorLitro = 8;
	                break;
	            default:
	                JOptionPane.showMessageDialog(null, "Tipo de carro inválido!");
	                return;
	        }

	        double litros = percurso / kmPorLitro;
	        JOptionPane.showMessageDialog(null, "Consumo estimado: " + litros + " litros");
	    }
}
