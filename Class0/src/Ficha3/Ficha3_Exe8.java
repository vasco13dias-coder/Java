package Ficha3;
import javax.swing.JOptionPane;

public class Ficha3_Exe8 {
    public static void main(String[] args) {

        
        double r;
        double i;
        double v;

        
        r = Double.parseDouble(JOptionPane.showInputDialog("Introduza a Resistência R (ohms):"));
        i = Double.parseDouble(JOptionPane.showInputDialog("Introduza a Intensidade I (Amperes):"));

       
        v = r * i;

        
        JOptionPane.showMessageDialog(null, "A Voltagem (V) é: " + v + " Volts");
    }
}