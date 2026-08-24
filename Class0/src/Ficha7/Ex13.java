package Ficha7;
import javax.swing.JOptionPane;
public class Ex13 {
	public static void main(String[] args) {
        double custo = Double.parseDouble(JOptionPane.showInputDialog("Introduza o preço de custo:"));

        String menu = "Categoria:\n" +
                      "1 - Horticultura\n" +
                      "2 - Lacticínios\n" +
                      "3 - Carnes\n" +
                      "4 - Peixes\n" +
                      "5 - Aves\n" +
                      "6 - Ovos";

        int codigo = Integer.parseInt(JOptionPane.showInputDialog(menu));

        double margem;

        switch (codigo) {
            case 1:
            case 2:
                margem = 0.80;
                break;
            case 3:
            case 4:
                margem = 1.00;
                break;
            case 5:
            case 6:
                margem = 0.90;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Categoria inválida!");
                return;
        }

        double precoVenda = custo * (1 + margem);
        JOptionPane.showMessageDialog(null, "Preço de venda: " + precoVenda + " €");
    }
}
