package Ficha6;
import javax.swing.JOptionPane;

public class Ficha6_Exe25 {
    public static void main(String[] args) {
    	int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número:"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3º número:"));

        int menor = n1;
        if (n2 < menor) menor = n2;
        if (n3 < menor) menor = n3;

        JOptionPane.showMessageDialog(null, "O menor número é: " + menor);

        System.exit(0);
    }
}
