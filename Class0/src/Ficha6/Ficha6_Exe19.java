package Ficha6;
import javax.swing.JOptionPane;

public class Ficha6_Exe19 {
    public static void main(String[] args) {
    	double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço normal de etiqueta:"));

        String opcaoTexto = JOptionPane.showInputDialog(
                "Opções de Pagamento:\n1 - Dinheiro (-10%)\n2 - Cartão de Crédito (-15%)\n3 - 2x (Preço normal)\n4 - 3x (+10% juros)\n\nEscolha uma opção:");
        int opcao = Integer.parseInt(opcaoTexto);

        double precoFinal;
        if (opcao == 1) {
            precoFinal = preco * 0.90;
        } else if (opcao == 2) {
            precoFinal = preco * 0.85;
        } else if (opcao == 3) {
            precoFinal = preco;
        } else if (opcao == 4) {
            precoFinal = preco * 1.10;
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida.");
            System.exit(0);
            return;
        }

        JOptionPane.showMessageDialog(null, String.format("Preço a ser pago: %.2f €", precoFinal));

        System.exit(0);
    }
}
