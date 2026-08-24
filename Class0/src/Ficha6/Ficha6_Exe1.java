package Ficha6;


import javax.swing.JOptionPane;

public class Ficha6_Exe1 {
    public static void main(String[] args) {
    	String texto = JOptionPane.showInputDialog("Digite a idade do nadador:");
        int idade = Integer.parseInt(texto);

        // Resolvido apenas com decisões simples do tipo "Se" (if)
        if (idade <= 6) {
            JOptionPane.showMessageDialog(null, "Escalão: Golfinho");
        }
        if (idade >= 7 && idade <= 10) {
            JOptionPane.showMessageDialog(null, "Escalão: Infantil");
        }
        if (idade >= 11 && idade <= 13) {
            JOptionPane.showMessageDialog(null, "Escalão: Juvenil");
        }
        if (idade >= 14 && idade <= 17) {
            JOptionPane.showMessageDialog(null, "Escalão: Tubarão");
        }
        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Escalão: Cota");
        }

        System.exit(0);
    }
}