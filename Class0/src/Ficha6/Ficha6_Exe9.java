package Ficha6;
import javax.swing.JOptionPane;
public class Ficha6_Exe9 {

	public static void main(String[] args) {
		int horas = Integer.parseInt(JOptionPane.showInputDialog("Horas de permanência:"));
        int minutos = Integer.parseInt(JOptionPane.showInputDialog("Minutos de permanência:"));

        double tempoTotal = horas + (minutos / 60.0);
        double totalPagar;

        if (tempoTotal <= 1) {
            totalPagar = tempoTotal * 2.0;
        } else if (tempoTotal <= 2) {
            totalPagar = 2.0 + (tempoTotal - 1) * 1.5;
        } else {
            totalPagar = 2.0 + 1.5 + (tempoTotal - 2) * 1.0;
        }

        JOptionPane.showMessageDialog(null,
                String.format("Total a pagar: %.2f €", totalPagar));

        System.exit(0);
	}  

}
