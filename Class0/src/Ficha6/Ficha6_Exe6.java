package Ficha6;
import javax.swing.JOptionPane;

public class Ficha6_Exe6 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        if (num % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número é Par.");
        } else {
            JOptionPane.showMessageDialog(null, "O número é Ímpar.");
        }

        System.exit(0);
	}

}
