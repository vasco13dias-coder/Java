package Ficha6;
import javax.swing.JOptionPane;
public class Ficha6_Exe16 {

	public static void main(String[] args) {
		int a1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º ângulo do triângulo:"));
        int a2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º ângulo do triângulo:"));
        int a3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3º ângulo do triângulo:"));

        if ((a1 + a2 + a3) != 180) {
            JOptionPane.showMessageDialog(null, "Erro: A soma dos ângulos tem de ser 180º.");
        } else {
            if (a1 == 90 || a2 == 90 || a3 == 90) {
                JOptionPane.showMessageDialog(null, "Triângulo Retângulo");
            } else if (a1 > 90 || a2 > 90 || a3 > 90) {
                JOptionPane.showMessageDialog(null, "Triângulo Obtusângulo");
            } else {
                JOptionPane.showMessageDialog(null, "Triângulo Acutângulo");
            }
        }

        System.exit(0);
	}  

}
