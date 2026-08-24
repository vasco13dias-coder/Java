package Ficha6;

import javax.swing.JOptionPane;

public class Ficha6_Exe3 {

	public static void main(String[] args) {
		String texto = JOptionPane.showInputDialog("Digite o sexo (M/F):");
        char sexo = texto.toUpperCase().charAt(0);

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura (em metros):"));

        double pesoIdeal = 0;
        if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
            JOptionPane.showMessageDialog(null, String.format("Peso ideal (Mulher): %.2f kg", pesoIdeal));
        } else if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
            JOptionPane.showMessageDialog(null, String.format("Peso ideal (Homem): %.2f kg", pesoIdeal));
        } else {
            JOptionPane.showMessageDialog(null, "Sexo inválido.");
        }

        System.exit(0);

	}

}
