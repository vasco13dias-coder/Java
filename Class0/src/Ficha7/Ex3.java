package Ficha7;
import javax.swing.JOptionPane;
public class Ex3 {
	public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Introduza o dia:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Introduza o mês:"));

        String estacao;

        switch (mes) {
            case 12:
                estacao = (dia >= 21) ? "Inverno" : "Outono";
                break;
            case 1:
            case 2:
                estacao = "Inverno";
                break;
            case 3:
                estacao = (dia >= 21) ? "Primavera" : "Inverno";
                break;
            case 4:
            case 5:
                estacao = "Primavera";
                break;
            case 6:
                estacao = (dia >= 21) ? "Verão" : "Primavera";
                break;
            case 7:
            case 8:
                estacao = "Verão";
                break;
            case 9:
                estacao = (dia >= 23) ? "Outono" : "Verão";
                break;
            case 10:
            case 11:
                estacao = "Outono";
                break;
            default:
                estacao = "Mês inválido!";
        }

        JOptionPane.showMessageDialog(null, "Estação: " + estacao);
    }
}
