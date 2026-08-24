package Ficha7;
import javax.swing.JOptionPane;
public class Ex9 {
	public static void main(String[] args) {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduza o código do produto:"));
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Introduza a quantidade:"));

        double precoUnitario;
        String nome;

        switch (codigo) {
            case 100:
                nome = "Cachorro quente";
                precoUnitario = 1.70;
                break;
            case 101:
                nome = "Bifana Simples";
                precoUnitario = 2.30;
                break;
            case 102:
                nome = "Bifana com ovo";
                precoUnitario = 2.60;
                break;
            case 103:
                nome = "Hambúrguer";
                precoUnitario = 2.40;
                break;
            case 104:
                nome = "Cheeseburger";
                precoUnitario = 2.50;
                break;
            case 105:
                nome = "Sumo";
                precoUnitario = 1.00;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Código inválido!");
                return;
        }

        double total = precoUnitario * quantidade;
        JOptionPane.showMessageDialog(null, nome + " x" + quantidade + " = " + total + " €");
    }
}
