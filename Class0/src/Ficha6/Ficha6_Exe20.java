package Ficha6;
import javax.swing.JOptionPane;

public class Ficha6_Exe20 {
    public static void main(String[] args) {
    	int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        StringBuilder resultado = new StringBuilder();
        boolean div = false;

        if (num % 10 == 0) {
            resultado.append("É divisível por 10.\n");
            div = true;
        }
        if (num % 5 == 0) {
            resultado.append("É divisível por 5.\n");
            div = true;
        }
        if (num % 2 == 0) {
            resultado.append("É divisível por 2.\n");
            div = true;
        }
        if (!div) {
            resultado.append("Não é divisível por 10, 5 ou 2.");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());

        System.exit(0);
    }
}
