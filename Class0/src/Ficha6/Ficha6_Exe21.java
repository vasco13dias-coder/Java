package Ficha6;
import javax.swing.JOptionPane;

public class Ficha6_Exe21 {
    public static void main(String[] args) {
    	double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo médio do último ano:"));

        double credito = 0;
        if (saldo >= 0 && saldo <= 500) {
            credito = 0;
        } else if (saldo >= 501 && saldo <= 1000) {
            credito = saldo * 0.30;
        } else if (saldo >= 1001 && saldo <= 3000) {
            credito = saldo * 0.40;
        } else if (saldo > 3000) {
            credito = saldo * 0.50;
        }

        JOptionPane.showMessageDialog(null,
                String.format("Saldo Médio: %.2f € | Valor do Crédito: %.2f €", saldo, credito));

        System.exit(0);
    }
}
