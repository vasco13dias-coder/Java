import javax.swing.JOptionPane;

public class Ficha3_Exe10 {

    public static void main(String[] args) {
    	// Exemplo de valores para testar:
        // preco = 100
        // desconto = 0.10  -> 10%
        // Resultado esperado: desconto = 10, precoFinal = 90
    	
    	
        String inputPreco = JOptionPane.showInputDialog("Introduza o preço do produto:");
        double preco = Double.parseDouble(inputPreco);

        String inputDesconto = JOptionPane.showInputDialog("Introduza o desconto (ex: 0.10 para 10%):");
        double percentagemDesconto = Double.parseDouble(inputDesconto);

        double valorDesconto = preco * percentagemDesconto;

        double precoFinal = preco - valorDesconto;

        JOptionPane.showMessageDialog(null,
                "Desconto: " + valorDesconto + "\nPreço final: " + precoFinal);
    }
}
