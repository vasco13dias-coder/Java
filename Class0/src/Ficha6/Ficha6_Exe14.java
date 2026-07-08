package Ficha6;
import javax.swing.JOptionPane;
public class Ficha6_Exe14 {

	public static void main(String[] args) {
		int lados = Integer.parseInt(JOptionPane.showInputDialog("Número de lados do polígono:"));
        double medidaLado = Double.parseDouble(JOptionPane.showInputDialog("Medida do lado (em cm):"));

        if (lados == 3) {
            double area = (Math.pow(medidaLado, 2) * Math.sqrt(3)) / 4;
            JOptionPane.showMessageDialog(null, String.format("TRIÂNGULO - Área: %.2f cm²", area));
        } else if (lados == 4) {
            double area = medidaLado * medidaLado;
            JOptionPane.showMessageDialog(null, String.format("QUADRADO - Área: %.2f cm²", area));
        } else if (lados == 5) {
            JOptionPane.showMessageDialog(null, "PENTÁGONO");
        } else {
            JOptionPane.showMessageDialog(null, "Polígono não suportado.");
        }

        System.exit(0);
	}  

}
