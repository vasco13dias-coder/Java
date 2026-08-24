package Ficha7;
import javax.swing.JOptionPane;
public class Ex7 {
	public static void main(String[] args) {
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Introduza o número do mês (1-12):"));

        String nome;

        switch (mes) {
            case 1: nome = "Janeiro"; break;
            case 2: nome = "Fevereiro"; break;
            case 3: nome = "Março"; break;
            case 4: nome = "Abril"; break;
            case 5: nome = "Maio"; break;
            case 6: nome = "Junho"; break;
            case 7: nome = "Julho"; break;
            case 8: nome = "Agosto"; break;
            case 9: nome = "Setembro"; break;
            case 10: nome = "Outubro"; break;
            case 11: nome = "Novembro"; break;
            case 12: nome = "Dezembro"; break;
            default: nome = "Mês inválido!";
        }

        JOptionPane.showMessageDialog(null, nome);
    }
}
