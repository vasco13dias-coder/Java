package Ficha6;
import javax.swing.JOptionPane;
public class Ficha6_Exe15 {

	public static void main(String[] args) {
		double l1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º lado do triângulo:"));
        double l2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2º lado do triângulo:"));
        double l3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 3º lado do triângulo:"));

        if (l1 == l2 && l2 == l3) {
            JOptionPane.showMessageDialog(null, "Triângulo Equilátero");
        } else if (l1 == l2 || l1 == l3 || l2 == l3) {
            JOptionPane.showMessageDialog(null, "Triângulo Isósceles");
        } else {
            JOptionPane.showMessageDialog(null, "Triângulo Escaleno");
        }

        System.exit(0);
	}  

}
