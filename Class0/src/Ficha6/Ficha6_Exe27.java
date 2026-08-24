package Ficha6;
import javax.swing.JOptionPane;

public class Ficha6_Exe27 {
    public static void main(String[] args) {
    	int codigo = Integer.parseInt(JOptionPane.showInputDialog("Código do empregado:"));
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento:"));
        int anoIngresso = Integer.parseInt(JOptionPane.showInputDialog("Ano de ingresso na empresa:"));

        int anoAtual = 2026;
        int idade = anoAtual - anoNascimento;
        int tempoTrabalho = anoAtual - anoIngresso;

        String situacao;
        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
            situacao = "Requerer Reforma";
        } else {
            situacao = "Não Requerer Reforma";
        }

        String resultado = "Código do Empregado: " + codigo
        		+ "\nIdade: " + idade + " anos"
                + "\nTempo de Trabalho: " + tempoTrabalho + " anos"
                + "\nResultado: " + situacao;

        JOptionPane.showMessageDialog(null, resultado);

        System.exit(0);
    }
}
