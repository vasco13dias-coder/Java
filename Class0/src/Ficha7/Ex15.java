package Ficha7;
import javax.swing.JOptionPane;
public class Ex15 {
	 public static void main(String[] args) {
	        int dia = Integer.parseInt(JOptionPane.showInputDialog("Introduza o dia:"));
	        int mes = Integer.parseInt(JOptionPane.showInputDialog("Introduza o mês:"));
	        int ano = Integer.parseInt(JOptionPane.showInputDialog("Introduza o ano:"));

	        long dtJuliana = (1461 * (ano + 4800 + (mes - 14) / 12)) / 4
	                + (367 * (mes - 2 - 12 * ((mes - 14) / 12))) / 12
	                - (3 * ((ano + 4900 + (mes - 14) / 12) / 100)) / 4
	                + dia - 32075;

	        int valor = (int) ((dtJuliana + 1) % 7);

	        String diaSemana;

	        switch (valor) {
	            case 0: diaSemana = "Segunda-feira"; break;
	            case 1: diaSemana = "Terça-feira"; break;
	            case 2: diaSemana = "Quarta-feira"; break;
	            case 3: diaSemana = "Quinta-feira"; break;
	            case 4: diaSemana = "Sexta-feira"; break;
	            case 5: diaSemana = "Sábado"; break;
	            case 6: diaSemana = "Domingo"; break;
	            default: diaSemana = "Erro no cálculo";
	        }

	        JOptionPane.showMessageDialog(null, "Dia da semana: " + diaSemana);
	    }
}
