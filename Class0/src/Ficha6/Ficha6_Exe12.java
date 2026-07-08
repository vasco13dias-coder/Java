package Ficha6;
import javax.swing.JOptionPane;
public class Ficha6_Exe12 {

	public static void main(String[] args) {
		int senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha:"));

        if (senha == 1234) {
            JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
        } else {
            JOptionPane.showMessageDialog(null, "ACESSO NEGADO");
        }

        System.exit(0);
	}  

}
