package Ficha6;
import javax.swing.JOptionPane;
public class Ficha6_Exe13 {

	public static void main(String[] args) {
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de maçãs compradas:"));

        double total;
        if (qtd < 12) {
            total = qtd * 0.30;
        } else {
            total = qtd * 0.25;
        }

        JOptionPane.showMessageDialog(null,
                String.format("Valor total da compra: %.2f €", total));

        System.exit(0);
	}  

}
