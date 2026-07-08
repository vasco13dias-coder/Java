package Ficha6;
import javax.swing.JOptionPane;
public class Ficha6_Exe5 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o número A:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o número B:"));

        if (a % b == 0 || b % a == 0) {
            JOptionPane.showMessageDialog(null, "Um dos números é múltiplo do outro.");
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum deles é múltiplo do outro.");
        }

        System.exit(0);
	}

}
