package Ficha6;
import javax.swing.JOptionPane;
public class Ficha6_Exe7 {

	public static void main(String[] args) {
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso (kg):"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura (m):"));

        double imc = peso / (altura * altura);

        String mensagem;
        if (imc < 18.5) {
            mensagem = "Estás abaixo do peso normal.";
        } else if (imc >= 18.5 && imc < 25) {
            mensagem = "O teu peso está na faixa da normalidade.";
        } else if (imc >= 25 && imc < 30) {
            mensagem = "Estás acima do peso normal.";
        } else {
            mensagem = "Obeso. Precisas perder algum peso.";
        }

        JOptionPane.showMessageDialog(null,
                String.format("IMC: %.2f\n%s", imc, mensagem));

        System.exit(0);
	}

}
