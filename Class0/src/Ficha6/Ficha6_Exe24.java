package Ficha6;
import javax.swing.JOptionPane;

public class Ficha6_Exe24 {
    public static void main(String[] args) {
    	int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número:"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3º número:"));

        int maior, meio, menor;
        if (n1 >= n2 && n1 >= n3) {
            maior = n1;
            if (n2 >= n3) { meio = n2; menor = n3; }
            else { meio = n3; menor = n2; }
        } else if (n2 >= n1 && n2 >= n3) {
            maior = n2;
            if (n1 >= n3) { meio = n1; menor = n3; }
            else { meio = n3; menor = n1; }
        } else {
            maior = n3;
            if (n1 >= n2) { meio = n1; menor = n2; }
            else { meio = n2; menor = n1; }
        }

        String resultado = "Ordem Decrescente: " + maior + ", " + meio + ", " + menor
                + "\nOrdem Crescente: " + menor + ", " + meio + ", " + maior;

        JOptionPane.showMessageDialog(null, resultado);

        System.exit(0);
    }
}
