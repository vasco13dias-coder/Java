package Ficha6;
import javax.swing.JOptionPane;
public class Ficha6_Exe4 {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número:"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3º número:"));

        int maior = n1;
        if (n2 > maior) {
            maior = n2;
        }
        if (n3 > maior) {
            maior = n3;
        }

        JOptionPane.showMessageDialog(null, "O maior número é: " + maior);

        System.exit(0);

	}

}
