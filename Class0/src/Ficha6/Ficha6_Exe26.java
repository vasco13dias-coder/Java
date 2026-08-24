package Ficha6;
import javax.swing.JOptionPane;

public class Ficha6_Exe26 {
    public static void main(String[] args) {
    	double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente c:"));

        double delta = (b * b) - (4 * a * c);

        if (delta < 0) {
            JOptionPane.showMessageDialog(null, "A equação não tem raízes reais.");
        } else if (delta == 0) {
            double r1 = -b / (2 * a);
            JOptionPane.showMessageDialog(null, String.format("Tem uma raiz real: r1 = %.2f", r1));
        } else {
            double r1 = (-b + Math.sqrt(delta)) / (2 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null,
                    String.format("Tem duas raízes reais: r1 = %.2f e r2 = %.2f", r1, r2));
        }

        System.exit(0);
    }
}
