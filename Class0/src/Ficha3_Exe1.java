import javax.swing.JOptionPane;

public class Ficha3_Exe1 {

	public static void main(String[] args) {
		
		int n1, n2;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite N1:" ));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite N2: "));
		System.out.println("Soma: " + (n1 + n2));
		System.out.println("Subtração: " + (n1 - n2));
		System.out.println("Divisão: " + (n1 / n2));
		System.out.println("Multiplicação: " + (n1 * n2));
		System.out.println("Resto: " + (n1 % n2));
	}

}

