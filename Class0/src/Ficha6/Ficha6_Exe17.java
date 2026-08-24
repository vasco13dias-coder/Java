package Ficha6;
import javax.swing.JOptionPane;
public class Ficha6_Exe17 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Valor A:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Valor B:"));

        int resultado;
        if (a == b) {
            resultado = a + b;
            JOptionPane.showMessageDialog(null, "Iguais! Soma: " + resultado);
        } else {
            resultado = a * b;
            JOptionPane.showMessageDialog(null, "Diferentes! Multiplicação: " + resultado);
        }

        System.exit(0);
	}  

}
