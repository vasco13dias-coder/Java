package Ficha7;
import javax.swing.JOptionPane;
public class Ex5 {
	public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Introduza a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Introduza b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Introduza c:"));
        double d = Double.parseDouble(JOptionPane.showInputDialog("Introduza d:"));
        double e = Double.parseDouble(JOptionPane.showInputDialog("Introduza e:"));
        double f = Double.parseDouble(JOptionPane.showInputDialog("Introduza f:"));

        double denom = a * e - b * d;

        if (denom == 0) {
            JOptionPane.showMessageDialog(null, "Sistema impossível de resolver (ae-bd = 0)!");
        } else {
            double x = (c * e - b * f) / denom;
            double y = (a * f - c * d) / denom;
            JOptionPane.showMessageDialog(null, "x = " + x + "\ny = " + y);
        }
    }
}
