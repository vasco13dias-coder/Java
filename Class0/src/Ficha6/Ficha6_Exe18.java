package Ficha6;
import javax.swing.JOptionPane;

public class Ficha6_Exe18 {
    public static void main(String[] args) {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Número de identificação do aluno:"));
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1 (0-100):"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2 (0-100):"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Nota 3 (0-100):"));
        double me = Double.parseDouble(JOptionPane.showInputDialog("Média dos exercícios (0-100):"));

        double ma = (n1 + n2 * 2 + n3 * 3 + me) / 7;

        char nf;
        if (ma >= 90) nf = 'A';
        else if (ma >= 75) nf = 'B';
        else if (ma >= 60) nf = 'C';
        else if (ma >= 40) nf = 'D';
        else nf = 'E';

        String situacao;
        if (nf == 'A' || nf == 'B' || nf == 'C') {
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }

        String resultado = String.format(
                "--- RESULTADO ---\nAluno ID: %d\nMédia de Aproveitamento (MA): %.2f\nNota Final: %s\nSituação: %s",
                id, ma, nf, situacao);

        JOptionPane.showMessageDialog(null, resultado);

        System.exit(0);
    }
}
