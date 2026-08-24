package Ficha6;

import javax.swing.JOptionPane;	

public class Ficha6_Exe2 {

	public static void main(String[] args) {
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2:"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Nota 3:"));

        // Média ponderada com pesos 3, 4 e 5 (Soma dos pesos = 12)
        double media = (n1 * 3 + n2 * 4 + n3 * 5) / 12;

        String resultado;
        if (media >= 9.5) {
            resultado = "Dispensado";
        } else if (media >= 7.5) {
            resultado = "Admitido";
        } else {
            resultado = "Reprovado";
        }

        JOptionPane.showMessageDialog(null,
                String.format("Média ponderada: %.2f\nResultado: %s", media, resultado));

        System.exit(0);

	}

}
